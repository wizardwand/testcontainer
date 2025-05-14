mysql -uroot -ptest
mysql> use test
mysql> select * from customers ;
+----+------------+-----------+
| id | first_name | last_name |
+----+------------+-----------+
|  1 | shirish    | patil     |
|  2 | marco      | behler    |
+----+------------+-----------+


# psql -U test -d test
psql (17.5 (Debian 17.5-1.pgdg120+1))
Type "help" for help.

test=# \dt
List of relations
Schema |   Name    | Type  | Owner
--------+-----------+-------+-------
public | customers | table | test
(1 row)

test=# SELECT * FROM customers;
id | first_name | last_name
----+------------+-----------
1 | shirish    | patil
2 | marco      | behler
(2 rows)

test=#