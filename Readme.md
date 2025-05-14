mysql -uroot -ptest

mysql> use test

mysql> select * from customers ;
```java
+----+------------+-----------+
| id | first_name | last_name |
+----+------------+-----------+
|  1 | shirish    | patil     |
|  2 | marco      | behler    |
+----+------------+-----------+
```

 psql -U test -d test

Type "help" for help.

test=# \dt

List of relations
````java
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
````
