DROP DATABASE food_point
CREATE DATABASE food_point;

USE food_point;

CREATE TABLE category (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    category_name VARCHAR(50) NOT NULL,
    category_desc VARCHAR(100) NOT NULL,
    category_order INT NOT NULL,
    dateon DATE DEFAULT NULL
);
SELECT subcat_name FROM subcat WHERE catid = 3 ORDER BY subcat_name;
SELECT subcat_name FROM subcat ORDER BY subcat_name
SELECT *FROM category
CREATE TABLE subcat (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    catid INT(11) DEFAULT NULL,
    subcat_name VARCHAR(50) NOT NULL,
    subcat_desc VARCHAR(100) NOT NULL,
    subcat_order INT NOT NULL,
    dateon DATE DEFAULT NULL,
    KEY catid (catid),
    CONSTRAINT fk_cat FOREIGN KEY (catid) REFERENCES category (id) ON DELETE CASCADE
) ENGINE=INNODB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8;
SELECT *FROM subcat

CREATE TABLE product (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    catid INT(11) DEFAULT NULL,
    subcatid INT(11) DEFAULT NULL,
    retailerid INT(11) DEFAULT NULL,
    product_name VARCHAR(50) NOT NULL,
    product_price INT(11) NOT NULL,
    product_desc VARCHAR(100) NOT NULL,
    img1 VARCHAR(5000) DEFAULT NULL,
    img2 VARCHAR(5000) DEFAULT NULL,
    dateon DATE DEFAULT NULL,
    CONSTRAINT fk_product_subcat FOREIGN KEY (subcatid) REFERENCES subcat(id) ON DELETE CASCADE,
    CONSTRAINT fk_product_cat FOREIGN KEY (catid) REFERENCES category(id) ON DELETE CASCADE,
    CONSTRAINT fk_product_retailer FOREIGN KEY (retailerid) REFERENCES retailer(id) ON DELETE CASCADE 
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
SELECT *FROM product
SELECT category_name FROM category WHERE id NOT IN (SELECT id FROM subcat)
DROP TABLE product

CREATE TABLE retailer(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    shop_name VARCHAR(50) NOT NULL,
    shop_address VARCHAR(100) NOT NULL,
    gst_no VARCHAR(10) NOT NULL,
    owner_name VARCHAR(50) NOT NULL,
    gmail VARCHAR(10),
    pass VARCHAR(20)    
)

ALTER TABLE retailer
ADD COLUMN img VARCHAR(1000);


ALTER TABLE retailer
MODIFY COLUMN gmail VARCHAR(100);

SELECT *FROM retailer
SELECT pass FROM retailer

INSERT INTO retailer(shop_name,shop_address,gst_no,owner_name,gmail,pass)VALUES('jatin telecom','hapur','876543','jatin','mr.jatingupta0912@gmail.com','Jatin@9456')

DROP TABLE products
SELECT category_name FROM category ORDER BY category_name
DROP TABLE IF EXISTS products;
SELECT category_name FROM category WHERE id  NOT IN (SELECT id FROM subcat)
SELECT *FROM product

SELECT * FROM subcat INNER JOIN category ON category.id=subcat.catid WHERE catid=1 ORDER BY subcat_name

SELECT *FROM product WHERE id=1

UPDATE product SET subcatid='null', product_name='null', catid='null', product_desc='null', img1='null', img2='null', product_price=NULL WHERE id=1
UPDATE product SET product_name='chillie maggie'WHERE id=8

CREATE TABLE USER(
   id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   NAME VARCHAR(20) NOT NULL,
   gmail VARCHAR(10) NOT NULL,
   pass VARCHAR(20) NOT NULL,
   phone_no VARCHAR(13)
)
 SELECT *FROM USER
 ALTER TABLE USER
MODIFY COLUMN gmail VARCHAR(100);
INSERT INTO USER(NAME,gmail,pass,phone_no)VALUES('avantika','avantika@test.com','avni','8976544321')


CREATE TABLE orders (
  id INT(20) NOT NULL AUTO_INCREMENT,
  orderno INT(20) DEFAULT NULL,
  ordertotal FLOAT DEFAULT NULL,
  tax FLOAT DEFAULT NULL,
  userid INT(20) DEFAULT NULL,
  orderstatus VARCHAR(50) DEFAULT NULL,
  paymentstatus VARCHAR(50) DEFAULT NULL,
  paymentmode VARCHAR(50) DEFAULT NULL,
  dateon DATE DEFAULT NULL,
  PRIMARY KEY (id),
  KEY userid (userid),
  CONSTRAINT orders_ibfk_1 FOREIGN KEY (userid) REFERENCES USER (id)
) 

CREATE TABLE tblshopingcart (
  id INT(11) NOT NULL AUTO_INCREMENT,
  pid INT(11) DEFAULT NULL,
  rate DOUBLE DEFAULT NULL,
  qty INT(11) DEFAULT NULL,
  total DOUBLE DEFAULT NULL,
  sessionid VARCHAR(100) DEFAULT NULL,
  dateon DATE DEFAULT NULL,
  PRIMARY KEY (id),
  KEY pid (pid),
  CONSTRAINT shopingcart_ibfk_1 FOREIGN KEY (pid) REFERENCES product (id)
) 
DELETE FROM tblshopingcart WHERE id =9
ALTER TABLE tblshopingcart
ADD COLUMN img VARCHAR(1000);
ALTER TABLE tblshopingcart
ADD COLUMN product_name VARCHAR(50);
SELECT *FROM tblshopingcart
SELECT tblshopingcart.id,tblshopingcart.qty,tblshopingcart.rate,tblshopingcart.sessionid,tblshopingcart.total,product.product_name,product.img1 FROM product INNER JOIN tblshopingcart ON product.id=tblshopingcart.pid WHERE sessionid=1500788765
INSERT INTO tblshopingcart(pid, product_name, product_price, img, qty, total, sessionid, dateon) VALUES('10', 'special', 776, 'null', 1, 776.0, 'ranch438064320', NOW());

CREATE TABLE tblorders (
  id INT(20) NOT NULL AUTO_INCREMENT,
  orderno INT(20) DEFAULT NULL,
  ordertotal FLOAT DEFAULT NULL,
  tax FLOAT DEFAULT NULL,
  userid INT(20) DEFAULT NULL,
  orderstatus VARCHAR(50) DEFAULT NULL,
  paymentstatus VARCHAR(50) DEFAULT NULL,
  paymentmode VARCHAR(50) DEFAULT NULL,
  dateon DATE DEFAULT NULL,
  PRIMARY KEY (id),
  KEY userid (userid),
  CONSTRAINT `tblorders_ibfk_1` FOREIGN KEY (userid) REFERENCES USER (id)
)

SELECT *FROM tblorders
SELECT MAX(orderno) FROM tblorders


INSERT INTO tblorders(orderno,ordertotal,tax,userid,orderstatus,paymentstatus,paymentmode,dateon)VALUES('1','0.0','0.0','4','success','success','on',NOW())
SELECT MAX(orderno) FROM tblorders
SELECT id FROM tblorders WHERE orderno=1NULL

CREATE TABLE tblorderitem (
  id INT(11) NOT NULL AUTO_INCREMENT,
  rate FLOAT DEFAULT NULL,
  qty INT(11) DEFAULT NULL,
  total FLOAT DEFAULT NULL,
  pid INT(11) DEFAULT NULL,
  orderid INT(11) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY pid (pid),
  KEY orderid (orderid),
  CONSTRAINT tblorderitem_ibfk_1 FOREIGN KEY (pid) REFERENCES product (id),
  CONSTRAINT tblorderitem_ibfk_2 FOREIGN KEY (orderid) REFERENCES tblorders (id)
)
SELECT *FROM tblorderitem

com.mysql.jdbc.JDBC4ResultSet@7b769508
INSERT INTO tblorders(orderno,ordertotal,tax,userid,orderstatus,paymentstatus,paymentmode,dateon)VALUES('2','1130.0','0.0','FD-1542036230','success','success','on',NOW())
SELECT id FROM tblorders WHERE orderno=1
SELECT tblshopingcart.pid,tblshopingcart.id,tblshopingcart.qty,tblshopingcart.rate,tblshopingcart.sessionid,tblshopingcart.total,product.product_name,product.img1 FROM product INNER JOIN tblshopingcart ON product.id=tblshopingcart.pid WHERE sessionid='FD-1542036230'
INSERT INTO tblorderitem (rate,qty,total,pid,orderid)VALUES('565.0',2,'1130.0',11,2);
you have been ordered successfully















