DROP TABLE IF EXISTS friendShips;
DROP TABLE IF EXISTS friends;
DROP TABLE IF EXISTS users;

create table users(
	userID SERIAL not null  primary key,
	username varchar not null,
	password varchar not null,
	fName varchar not null,
	lName varchar not null,
	birthday date not null,
	city varchar not null,
	state varchar not null
);

create type status as enum('pending','friends','blocked','notFriends');
create table friends(
	friendID SERIAL not null primary key,
	status status default 'notFriends'
);

create table friendShips(
	userID serial not null,
	friendID serial not null,
	primary key(userID, friendID)
);

alter table friendShips add constraint fk_u_id foreign key (userID) references users(userID);
alter table friendShips add constraint fk_f_id foreign key (friendID) references friends(friendID);