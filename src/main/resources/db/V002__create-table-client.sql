create table client (
	id bigint not null auto_increment,
    state varchar(2) not null,
    city varchar(250) not null,
    ug varchar(250) not null,
    is_active boolean not null,
    
    primary key (id)
);