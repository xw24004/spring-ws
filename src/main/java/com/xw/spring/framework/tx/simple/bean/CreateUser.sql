create table user(
	id int not null auto_increment,
	name varchar(255) default null,
	age int default null,
	sex varchar(255) default null,
	primary key(id)
) engine=innodb default charset=utf8;