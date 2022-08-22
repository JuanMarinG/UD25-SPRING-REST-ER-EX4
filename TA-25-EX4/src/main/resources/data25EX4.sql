DROP TABLE IF EXISTS Peliculas;
DROP TABLE IF EXISTS Salas;

Create table Peliculas(
id_Film int auto_increment primary key,
Nombre varchar (100),
Calificacion_Edad int);

Create table Salas (
id_Codigo int auto_increment primary key,
Nombre varchar(100),
Pelicula int,
Foreign key (Pelicula) references Peliculas(id_Film));

INSERT INTO Peliculas (Calificacion_Edad, Nombre) VALUES (16,'StarWars');
INSERT INTO Peliculas (Calificacion_Edad, Nombre) VALUES (18,'Jurassic Park');
INSERT INTO Peliculas (Calificacion_Edad, Nombre) VALUES (8,'Rey Leon');

INSERT INTO Salas (id_Codigo, Nombre, Pelicula) VALUES (1,'SAL1',1);
INSERT INTO Salas (id_Codigo, Nombre, Pelicula) VALUES (2,'SAL2',3);
INSERT INTO Salas (id_Codigo, Nombre, Pelicula) VALUES (3,'SAL3',2);
