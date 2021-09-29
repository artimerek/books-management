-- for default spring table schema

create table `users` (
	`username` varchar(50) NOT NULL,
	`password` varchar(50) NOT NULL,
	`enabled` tinyint(1) NOT NULL,
	
    primary key (`username`)
) engine = InnoDB default charset=utf8;

create table `authorities` (
	`username` varchar(50) NOT NULL,
	`authority` varchar(50) NOT NULL,
	
    unique key `authorities_idx_1` (`username`,`authority`),
    
    constraint `authorities_ibfk_1`
    foreign key (`username`)
    references `users` (`username`)
) engine = InnoDB default charset=utf8;


insert into `users`
values
('konrad','{noop}test', 1);

insert into `authorities`
values
('konrad', 'ROLE_ADMIN');
(