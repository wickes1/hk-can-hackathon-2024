@echo off
SETLOCAL

set "POSTGRESQL_DB_URL=jdbc:postgresql://localhost:5432/qbdemo"
set "POSTGRESQL_DB_USERNAME=admin"
set "POSTGRESQL_DB_PASSWORD=password"

java -jar .\backend-sync-0.0.1-SNAPSHOT.jar

pause
ENDLOCAL