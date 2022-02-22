REM   Script: Activity:7
REM   Aggregate Functions

select SUM(purchase_amount) AS "Total purchase Amount" from orders;

select AVG(purchase_amount) AS "Average purchase Amount" from orders;

select MAX(purchase_amount) AS "Maximum purcahse Amount" from orders;

select MIN(purchase_amount) AS "Minumum purchase Amount" from orders;

select COUNT(distinct salesman_id) AS "Total salesman" from orders;

