create table roles (
    id serial primary key,
    name text not null ,
    KEY ix_length_name(name(255)))
    ENGINE =InnoDB;
