REM   Script: Activity4
REM   Modifying the salesman table.

Alter table salesman 
ADD grade int;

Update salesman  
SET grade=100;

select * from salesman;

