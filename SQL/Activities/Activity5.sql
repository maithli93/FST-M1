REM   Script: Activity5
REM   updating the data in the salesman table

Update salesman  
SET grade=200 where salesman_city='Rome';

Update salesman  
SET grade=300 where salesman_name='James Hoog';

Update salesman  
SET salesman_name='Pierre' where salesman_name='McLyon' ;

select * from salesman;

