-- Postgres Sql
DROP TABLE IF EXISTS customers;
CREATE TABLE customers (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255)
);
INSERT INTO customers (first_name, last_name) VALUES ('shirish', 'patil');
INSERT INTO customers (first_name, last_name) VALUES ('marco', 'behler');
