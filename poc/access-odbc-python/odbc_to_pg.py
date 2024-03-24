"""
This script extracts data from a source database using ODBC and loads it into a PostgreSQL database.

The script uses the following environment variables:
- SOURCE_DSN: The ODBC DSN name for the source database.
- PG_HOST: The hostname or IP address of the PostgreSQL database.
- PG_PORT: The port number of the PostgreSQL database.
- PG_USER: The username for connecting to the PostgreSQL database.
- PG_PASSWORD: The password for connecting to the PostgreSQL database.
- PG_DATABASE: The name of the PostgreSQL database.

The script contains the following functions:
- extract(source_dsn): Extracts data from the source database and loads it into the PostgreSQL database.
- load(df, table_name): Loads the given DataFrame into the PostgreSQL database.

Example usage:
extract()  # Extracts data using the SOURCE_DSN environment variable.
load(df, "my_table")  # Loads the DataFrame into the "my_table" table in the PostgreSQL database.
"""

import os
import time

import pandas as pd
import pyodbc
from dotenv import load_dotenv
from sqlalchemy import create_engine

load_dotenv()

SOURCE_DSN = os.getenv("SOURCE_DSN")
PG_HOST = os.getenv("PG_HOST")
PG_PORT = os.getenv("PG_PORT")
PG_USER = os.getenv("PG_USER")
PG_PASSWORD = os.getenv("PG_PASSWORD")
PG_DATABASE = os.getenv("PG_DATABASE")


def extract(source_dsn=SOURCE_DSN):
    """
    Extracts data from the source database and loads it into the PostgreSQL database.

    Args:
        source_dsn (str, optional): The ODBC DSN name for the source database. If not provided, it uses the value of the SOURCE_DSN environment variable.
    """
    try:
        src_conn = pyodbc.connect("DSN=" + source_dsn)
        print("Connected to the source database successfully.")
        src_cursor = src_conn.cursor()
        tables = src_cursor.tables(tableType="TABLE").fetchall()
        df = pd.read_sql("SELECT * FROM [Item]", src_conn)
        load(df, "Item")
        # for table in tables:
        #     table_name = table.table_name
        #     df = pd.read_sql(f"SELECT * FROM [{table_name}]", src_conn)

        #     load(df, table_name)

    except pyodbc.Error as e:
        print(f"Error: {e}")
    finally:
        src_cursor.close()
        src_conn.close()


def load(df, table_name):
    """
    Loads the given DataFrame into the PostgreSQL database.

    Args:
        df (pandas.DataFrame): The DataFrame containing the data to be loaded.
        table_name (str): The name of the table in the PostgreSQL database where the data will be loaded.
    """
    try:
        engine = create_engine(
            f"postgresql://{PG_USER}:{PG_PASSWORD}@{PG_HOST}:{PG_PORT}/{PG_DATABASE}"
        )
        print(f"Importing {len(df)} rows into {table_name} table...")

        df.to_sql(
            table_name,
            con=engine,
            index=False,
            schema="public",
            if_exists="replace",
        )
        print(f"Table {table_name} copied successfully!")
    except Exception as e:
        print(f"Error: {e}")
    finally:
        time.sleep(2)


# log the time taken to run the script
start_time = time.time()

extract()

print(f"--- {(time.time() - start_time)} seconds ---")
