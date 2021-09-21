create database if not exists `library`
use `library`;

drop table if exists `book`;

create table `book`(
	`id` int(11) not null auto_increment,
	`title` varchar(50) NULL,
	`author` varchar(50) NULL,
	`release_date` varchar(50) NULL,
    primary key(`id`)
    )engine=InnoDB auto_increment = 6 default charset=utf8;
    
insert into `book` values
(1, 'Jeszcze piec minut', 'Altes Marta', '2019'),
(2, 'Razem z moim tatą', 'Beau Sandrine', '2021'),
(3, 'Razem z moją mamą', 'Beau Sandrine', '2021'),
(4, 'Tato, zdobądź dla mnie księżyc', 'Carle Eric', '2018'),
(5, 'My dwie, my trzy, my cztery', 'Crossan Sarah', '2018'),
(6, 'Włosy mamy', 'Dahle Gro', '2010'),
(7, 'Miłość', 'Desbordes Astrid', '2016'),
(8, 'Mama jest tylko jedna', 'Diaz Reguera  Raquel', '2018');