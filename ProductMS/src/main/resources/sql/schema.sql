DROP TABLE IF EXISTS product; 
create table product(
	product_id varchar(5) primary key,
    product_name varchar(50) NOT NULL,
    description varchar(100) NOT NULL ,
    price double NOT NULL,
    discount double NOT NULL,
    delivery_Charge double NOT NULL,
    avg_rating double ,
    quantity int NOT NULL,
    seller_name varchar(30) NOT NULL,
    category varchar(30) NOT NULL
);