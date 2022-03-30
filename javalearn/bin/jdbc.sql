CREATE TABLESPACE jdbc
DATAFILE '/u01/app/oracle/oradata/XE/jdbc.dbf'
SIZE 100M AUTOEXTEND ON NEXT 5M;

CREATE USER jdbc IDENTIFIED BY jdbc
DEFAULT TABLESPACE jdbc
TEMPORARY TABLESPACE temp;

GRANT CONNECT, RESOURCE, CREATE VIEW TO jdbc;


SELECT 'private ' 
|| decode(data_type, 'NUMBER', 'int ', 'String ')
|| lower(substr(column_name, 1, instr(column_name, '_')-1)) || initcap(substr(column_name, instr(column_name, '_')+1)) || ';' AS field
FROM user_tab_columns 
WHERE table_name = 'BOARDS';