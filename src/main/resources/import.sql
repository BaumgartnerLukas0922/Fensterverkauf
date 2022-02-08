--customer
insert into customer(firstname, lastname)
values ('Max', 'Muster'),
       ('Melanie', 'Muster'),
       ('Oliver', 'Sugic'),
       ('Miriam', 'Mayr'),
       ('Ferdinand', 'Fröhlich');

--lkw
insert into lkw(brand, model)
values ('Mercedes', 'Arcos'),
       ('Merceds', 'Amewi'),
       ('Volvo', 'FH16'),
       ('Volvo', 'FMX');

--supplier
insert into supplier(name, phonenumber, shipmentcost)
values ('Glashaus', '12903', 20),
       ('Svarovski', '21620', 50),
       ('Gartner GmbH', '67687', 10);

/*
insert into employee(firstname,lastname,salary,hours,hasdrivinglicense,curdriving)
values ('Maxl','Musterkerlchen', 2400, 30, true, true),
       ('Mcis', 'Quarkus', 2700, 34, true, false ),
       ('Heinz', 'Angular', 4500, 48, false, true);

insert into shipment(driver_empno, lkw_lkwid, date)
values (0, 0, '2022-01-01'),
       (1, 0, '2022-01-02'),
       (2, 2, '2022-01-05'),
       (1, 3, '2022-01-08');
--Inserts funktionieren nicht -> Fehlermeldung bei Quarkus start
 */