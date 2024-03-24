import pyodbc


def main():
    # Define the DSN
    dsn = "DSN=QuickBooks Data 64-Bit QRemote;"

    try:
        # Connect to the database using DSN
        connection = pyodbc.connect(dsn)
        print("Connected to the database successfully.")

        # Define a cursor
        cursor = connection.cursor()

        # Execute a query
        cursor.execute("SELECT TOP 3 * FROM Customer")

        # Fetch all rows
        rows = cursor.fetchall()

        # Print the result
        for row in rows:
            print(row)

        # Close cursor and connection
        cursor.close()
        connection.close()

    except pyodbc.Error as e:
        print(f"Error connecting to the database: {e}")


if __name__ == "__main__":
    main()
