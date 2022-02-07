-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-1');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-2');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-3');

insert into customer(firstname, lastname)
values ('Max', 'Muster'),
       ('Melanie', 'Muster'),
       ('Oliver', 'Sugic'),
       ('Miriam', 'Mayr'),
       ('Ferdinand', 'Fröhlich');

insert into lkw(brand, model)
values ('Mercedes', 'Arcos'),
       ('Merceds', 'Amewi'),
       ('Volvo', 'FH16'),
       ('Volvo', 'FMX');