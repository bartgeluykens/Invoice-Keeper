create table invoice 
( id                 integer       not null
, shop               varchar(100) not null
, description        varchar(100) not null
, invoice_date       date         not null
, guarentee_end_date date         null
);

