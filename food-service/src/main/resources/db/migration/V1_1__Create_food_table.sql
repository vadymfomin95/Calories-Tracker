CREATE TABLE FOOD
(
    ID          serial PRIMARY KEY,
    NAME        varchar(50)     NOT NULL,
    DESCRIPTION varchar(500)    NOT NULL,
    BRAND       varchar(50),
    CALORIES    decimal         NOT NULL
)