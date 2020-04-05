DROP TABLE IF EXISTS account;
DROP TABLE IF EXISTS wishlist;

create table account(
 name varchar(20),
 password varchar(20),
 email varchar(30) primary key
 );
 
create table wishlist(
	product_id varchar(5),
    user_email varchar(30) ,
    primary key(product_id,user_email)
);

 
 