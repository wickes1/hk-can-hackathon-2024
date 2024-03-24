const odbc = require('odbc');
const connectionString = {
    connectionString: 'DSN=QuickBooks Data 64-Bit QRemote',
    fetchSize: 1 // Replace 100 with your desired fetch size value
};


odbc.connect(connectionString, (error, connection) => {
    console.log('Connected to QuickBooks Data 64-Bit QRemote')
    if (error) {
        console.error(error);
        return;
    }

    connection.query('SELECT * FROM Customer', (error, result) => {
        if (error) {
        console.error(error);
        return;
        }

        console.log(result);
    });
    }
);
