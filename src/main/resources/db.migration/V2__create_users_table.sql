create table users (
    id serial primary key,
    firstname text not null ,
    lastname text not null ,
    username text not null,
    email text not null,
    password text
);
