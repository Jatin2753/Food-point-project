/*
SQLyog Professional v13.1.1 (64 bit)
MySQL - 5.5.41 : Database - food_point
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Data for the table `category` */

insert  into `category`(`id`,`category_name`,`category_desc`,`category_order`,`dateon`) values 
(1,'lunch','its lunch category                                   \r\n                            ',0,'2024-07-21'),
(2,'dinner ','      its dinner category                             \r\n                            ',1,'2024-07-21'),
(3,'breakfast','its breakfast category                                   \r\n                            ',2,'2024-07-22'),
(6,'jatin','its testing menu',3,'2024-07-25'),
(7,'chaitka','dfhgsdui',7,'2024-09-10'),
(8,'ayushi','friend',10,'2024-09-13'),
(9,'lalit','friend',8,'2024-09-20'),
(10,'newtest','testtest',10,'2024-09-28'),
(11,'lunch','dfvsc',4,'2024-09-29'),
(12,'lunch','jgf',0,'2024-09-29'),
(13,'vishal','test',0,'2024-09-29');

/*Data for the table `orders` */

/*Data for the table `product` */

insert  into `product`(`id`,`catid`,`subcatid`,`retailerid`,`product_name`,`product_price`,`product_desc`,`img1`,`img2`,`dateon`) values 
(8,2,6,1,'mnhfbgvcd',2002,'  tnbgfvd                                 \r\n                            ','17.jpg','15.jpg','2024-07-24'),
(9,2,1,3,'ujtyhrge',765432,'umyntbgfv                                   \r\n                            ','8.png','12.jpg','2024-07-24'),
(10,2,5,1,'special',776,'        testing r                           \r\n                            ','35.jpg','63.png','2024-07-24'),
(11,1,3,1,'spc',565,'ymntrge                                   \r\n                            ','12.jpg','14.jpg','2024-07-24'),
(12,1,6,3,'testing',123,'wedrtfgyuh','12.jpg','12.jpg',NULL),
(13,9,9,3,'meeti chai',99,'special                                   \r\n                            ','6.jpg','14.png','2024-09-20');

/*Data for the table `retailer` */

insert  into `retailer`(`id`,`shop_name`,`shop_address`,`gst_no`,`owner_name`,`gmail`,`pass`,`img`) values 
(1,'jatin telecom','hapur','876543','jatin','mr.jatingupta0912@gmail.com','Jatin@9456','8.png'),
(3,'suraj mobile center','hapur','7865432','suraj','suraj@suraj.com','suraj','9.png'),
(4,'aakriti fast food','modinagar','4532','aakriti','aakriti@gmail.com','akriti','9.png'),
(5,'kiet wale','muradnagar','dfvs7865','dean','kietwale@gmail.com','kietkiet','35.jpg'),
(6,'kietwale',' fgfd','5644w3','kiet kiet','akriri@akriri','akriti','29.jpg'),
(7,'new test','xdfcgh','4567yuh','new new','testing@test','testing','8.jpg'),
(8,'new test','xdfcgh','4567yuh','new new','testing@test','testing','8.jpg');

/*Data for the table `subcat` */

insert  into `subcat`(`id`,`catid`,`subcat_name`,`subcat_desc`,`subcat_order`,`dateon`) values 
(1,2,'maggie2','maggie   2                                \r\n                            ',3,'2024-07-21'),
(2,3,'pp2','rice  22                              \r\n                            ',3,'2024-07-21'),
(3,1,'noodles','noodles                                   \r\n                            ',2,'2024-07-21'),
(4,2,'rajma rice','rajma rice                                   \r\n                            ',0,'2024-07-21'),
(5,2,'burger','burger                                   \r\n                            ',1,'2024-07-21'),
(6,2,'roti2','roti       2                            \r\n                            ',22,'2024-07-21'),
(7,7,'jhdfbvsjh','jgmfnbd                                   \r\n                            ',564,'2024-09-10'),
(8,7,'jyhft','                                   \r\ngfs                            ',9,'2024-09-10'),
(9,9,'chai','chai lover                                   \r\n                            ',6,'2024-09-20'),
(10,9,'doodh','doodh lover                                   \r\n                            ',7,'2024-09-20');

/*Data for the table `tblorderitem` */

insert  into `tblorderitem`(`id`,`rate`,`qty`,`total`,`pid`,`orderid`) values 
(11,565,2,1130,11,2);

/*Data for the table `tblorders` */

insert  into `tblorders`(`id`,`orderno`,`ordertotal`,`tax`,`userid`,`orderstatus`,`paymentstatus`,`paymentmode`,`dateon`) values 
(2,1,0,0,4,'success','success','on','2024-07-29');

/*Data for the table `tblshopingcart` */

insert  into `tblshopingcart`(`id`,`pid`,`rate`,`qty`,`total`,`sessionid`,`dateon`,`img`,`product_name`,`gmail`) values 
(2,10,776,1,776,'ranch438064320','2024-07-27','null','special','jatin2753@gmail.com'),
(3,10,776,4,3104,'ranch438064320','2024-07-27','null','special','jatin2753@gmail.com'),
(4,10,776,10,7760,'ranch438064320','2024-07-27','null','special','jatin2753@gmail.com'),
(5,10,776,5,3880,'ranch438064320','2024-07-27','null','special','jatin2753@gmail.com'),
(6,10,776,6,4656,'FD-1500788765','2024-07-27','null','special','jatin2753@gmail.com'),
(7,8,2002,3,6006,'FD-1500788765','2024-07-27','null','mnhfbgvcd',NULL),
(8,8,2002,3,6006,'FD771438342','2024-07-27','null','mnhfbgvcd',NULL),
(11,11,565,3,1695,'FD890045129','2024-07-29','null','spc',NULL),
(12,8,2002,2,4004,'FD664758704','2024-07-29','null','mnhfbgvcd',NULL),
(13,12,123,9,1107,'FD664758704','2024-07-29','null','testing',NULL),
(14,9,765432,5,3827160,'FD214813635','2024-07-29','null','ujtyhrge',NULL),
(15,9,765432,5,3827160,'FD1960427573','2024-07-29','null','ujtyhrge',NULL),
(16,9,765432,5,3827160,'FD674381335','2024-07-29','null','ujtyhrge',NULL),
(17,11,565,2,1130,'FD-1542036230','2024-07-29','null','spc',NULL),
(18,11,565,1,565,'FD-192918388','2024-07-29','null','spc',NULL),
(19,11,565,1,565,'FD-2067019892','2024-07-29','null','spc',NULL),
(20,8,2002,1,2002,'FD1768267406','2024-09-10','null','mnhfbgvcd',NULL),
(21,9,765432,5,3827160,'FD1768267406','2024-09-10','null','ujtyhrge',NULL),
(22,8,2002,6,12012,'FD1768267406','2024-09-10','null','mnhfbgvcd','jatin2753@gmail.com'),
(23,10,776,5,3880,'FD1585106844','2024-09-13','null','special','jatin2753@gmail.com'),
(24,10,776,1,776,'FD2090619797','2024-09-22','null','special',NULL),
(25,10,776,5,3880,'FD2090619797','2024-09-22','null','special',NULL),
(26,11,565,10,5650,'FD2090619797','2024-09-22','null','spc',NULL),
(27,13,99,1,99,'FD1315478347','2024-09-28','null','meeti chai',NULL),
(29,9,765432,1,765432,'FD-49214635','2024-10-02','null','ujtyhrge',NULL),
(30,11,565,1,565,'FD-49214635','2024-10-02','null','spc',NULL),
(32,10,776,5,3880,'FD114235729','2024-10-02','null','special',NULL),
(33,11,565,4,2260,'FD-32719196','2024-10-02','null','spc',NULL),
(34,11,565,5,2825,'FD-32719196','2024-10-02','null','spc',NULL),
(35,8,2002,1,2002,'FD-1397518950','2024-10-02','null','mnhfbgvcd',NULL);

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`gmail`,`pass`,`phone_no`) values 
(1,'avantika','avantika@test.com','avni','8976544321'),
(4,'akriti','padhaku@topper.com','padhaku','9876543'),
(9,'jatin','jatin.2325mca1029@kiet.edu','Jatin@9456','87654334'),
(12,'sema','sema@ghjm','7654se','765432'),
(13,'aakriti','aakriti@dollychai','chaiwale','9876543'),
(14,'Jatin','jatin211@gmail.com','jatin@9456','9456254251');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
