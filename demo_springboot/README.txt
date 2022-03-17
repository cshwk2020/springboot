
README
----------

This is about my demo of use case of retrieve orders by REST api.
http://localhost:8080/api/orders

Included sources folders:
1) northwind_db_mysql : create table scripts used to setup northwind for my testing.
2) northwind_springboot: my springboot source code for your reference.

Then it will need to use hibernate to:
-retrieve all orders.
-for each order, it will continue to mapping to tables related to orders including:
    -order_details (1-to-many)
    -customer table (1-to-1)
    -...
    
-for each order_details, it will continue to mapping to related tables:
    -products (1-to-1)
    -purchase_order (optional 1-to-1)

-for purchase_order, it will continue to mapping to related tables:
    -purchase_order_details (1-to-many)

for purchase_order_details, it will continue to mapping to related tables:
    -purchase_detail_status (1-to-1)


As it was shown, the use case of retrieve orders involve hiernate mapping 
of many tables joining together, in spring environment