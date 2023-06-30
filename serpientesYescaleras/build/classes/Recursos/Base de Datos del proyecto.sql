-- Crear la base de datos
CREATE DATABASE Base_Proyecto_Poo4;

-- Seleccionar la base de datos
USE Base_Proyecto_Poo4;
-------------------------------------------------------------------------

CREATE TABLE Jugador (
    id_jugador INT IDENTITY(1, 1) PRIMARY KEY,
    nombre VARCHAR(100),
    sexo CHAR(1),
    instagram VARCHAR(100),
    nickname VARCHAR(100)
);

CREATE TABLE Tablero (
    id_tablero INT IDENTITY(1, 1) PRIMARY KEY,
    cantidad_casillas INT,
	ruta_imagen VARCHAR(200)
);

CREATE TABLE Ficha (
    id_ficha INT IDENTITY(1, 1) PRIMARY KEY,
    nombre_ficha VARCHAR(100),
    ruta_imagen VARCHAR(200)
);

CREATE TABLE CasillaEscalera (
    id_casilla_escalera INT IDENTITY(1, 1) PRIMARY KEY,
    id_tablero INT,
    casilla_inicio INT,
    casilla_fin INT,
    FOREIGN KEY (id_tablero) REFERENCES Tablero(id_tablero)
);

CREATE TABLE CasillaSerpiente (
    id_casilla_serpiente INT IDENTITY(1, 1) PRIMARY KEY,
    id_tablero INT,
    casilla_inicio INT,
    casilla_fin INT,
    FOREIGN KEY (id_tablero) REFERENCES Tablero(id_tablero)
);

CREATE TABLE Juego (
    id_juego INT IDENTITY(1, 1) PRIMARY KEY,
    tipo_juego VARCHAR(20), -- Puede ser "Individual" o "Competencia"
    id_tablero INT,
    fecha_inicio DATETIME,
    fecha_fin DATETIME,
    FOREIGN KEY (id_tablero) REFERENCES Tablero(id_tablero)
);

CREATE TABLE RegistroJugador (
    id_registro INT IDENTITY(1, 1) PRIMARY KEY,
    id_juego INT,
    id_jugador INT,
    id_ficha INT,
    tiros_dado INT,
    escaleras_avanzadas INT,
    serpientes_retrocedidas INT,
    desbancos INT,
    jugador_ganador BIT,
    FOREIGN KEY (id_juego) REFERENCES Juego(id_juego),
    FOREIGN KEY (id_jugador) REFERENCES Jugador(id_jugador),
    FOREIGN KEY (id_ficha) REFERENCES Ficha(id_ficha)
);
----------------------------------------
SELECT * FROM Jugador;
SELECT * FROM RegistroJugador;
---------------------------------
DROP DATABASE Base_Proyecto_Poo4
----------------------------------------
DELETE FROM Jugador WHERE id_jugador = 6;