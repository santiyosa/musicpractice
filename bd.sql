CREATE DATABASE musica;

USE musica;

CREATE TABLE banda (
  idbanda INT NOT NULL,
  nombrebanda VARCHAR(45) NOT NULL,
  nacionalidad VARCHAR(45) NULL,
  fundacion VARCHAR(45) NULL,
  genero VARCHAR(45) NULL,
  PRIMARY KEY (idbanda));
  
INSERT INTO musica.banda (idbanda, fundacion, genero, nacionalidad, nombrebanda) 
VALUES (5, '2001', 'Rock', 'EEUU', 'Creed');
