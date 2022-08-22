DROP TABLE IF EXISTS Peliculas;
DROP TABLE IF EXISTS Salas;

Create table Peliculas(
idFilm int auto_increment primary key,
Nombre varchar (100),
CalificacionEdad int);

Create table Salas (
id_Codigo int auto_increment primary key,
Nombre varchar(100),
Pelicula int,
Foreign key (Pelicula) references Peliculas(id_Film));

INSERT INTO Peliculas (Nombre, CalificacionEdad) VALUES ('StarWars', 16);
INSERT INTO Peliculas (Nombre, CalificacionEdad) VALUES ('Jurassic Park', 18);
INSERT INTO Peliculas (Nombre, CalificacionEdad) VALUES ('Rey Leon', 8);

INSERT INTO Salas (Nombre) VALUES ('SAL1');
INSERT INTO Salas (Nombre) VALUES ('SAL2');
INSERT INTO Salas (Nombre) VALUES ('SAL3');
