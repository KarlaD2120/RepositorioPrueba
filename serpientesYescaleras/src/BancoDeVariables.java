/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class BancoDeVariables {
    private static boolean halo;
    private static boolean halo2;
    private static boolean dosJugadores;
    private static String jugador1;
    private static String jugador2;
    private static int idTablero;
    private static int idfichero;
    private static String TipoJuego;
    private static String fecha_inicio;
    private static int id_jugador1;
    private static int id_juego;
    private static boolean WinJugador1;
    private static boolean WinJugador2;
    private static int idfichero2;
    private static int id_jugador2;
    public static void setHalo(boolean value) {
        halo = value;
    }
    //Para saber si elegio el fichero "halo" o el fichero "halo2"
    public static boolean getHalo() {
        return halo;
    }
    
    public static void setHalo2(boolean value) {
        halo2 = value;
    }

    public static boolean getHalo2() {
        return halo2;
    }
    //Para saber el nickname o aleas de los jugadores
    public static void setjugador1(String value) {
        jugador1 = value;
    }

    public static String getjugador1() {
        return jugador1;
    }
    
    public static void setjugador2(String value) {
        jugador2 = value;
    }

    public static String getjugador2() {
        return jugador2;
    }
    //Para saber si esta jugando uno o dos jugadores
    public static void setdosJugadores(boolean value) {
        dosJugadores = value;
    }

    public static boolean getdosJugadores() {
        return dosJugadores;
    }
    //Para saber que tablero utlizò
    public static int getidTablero() {
        return idTablero;
    }
    
    public static void setidTablero(int value) {
        idTablero = value;
    }
    //Para saber que fichero eleigiò el jugador 1
    public static int getFichero() {
        return idfichero;
    }
    public static void setfichero(int value) {
        idfichero = value;
    }
    //Para saber que fichero eleigiò el jugador 2
    public static int getFichero2() {
        return idfichero2;
    }
    public static void setfichero2(int value) {
        idfichero2 = value;
    }
    //para saber que tipo de juego eleigiò
    public static String getTipoJuego() {
        return TipoJuego;
    }
    public static void setTipoJuego(String value) {
        TipoJuego = value;
    }
    //Para saber la fecha y hora del inicio de la partida
    public static String getfecha_inicio() {
        return fecha_inicio;
    }
    
    public static void setfecha_inicio(String value) {
        fecha_inicio = value;
    }
    //Para saber el id de jugador 1
    public static int getIdJugador1() {
        return id_jugador1;
    }
    public static void setIdJugador1(int value) {
        id_jugador1 = value;
    }
    //Para saber el id de jugador 2
    public static int getIdJugador2() {
        return id_jugador2;
    }
    public static void setIdJugador2(int value) {
        id_jugador2 = value;
    }
    //Para saber el id del juego
    public static int getIdJuego() {
        return id_juego;
    }
    public static void setIdJuego(int value) {
        id_juego = value;
    }
    //Para saber si gano el jugador1
    public static boolean getWinJugador1() {
        return WinJugador1;
    }   
    public static void setWinJugador1(boolean value) {
        WinJugador1 = value;
    }
    //Para saber si gano el jugador2
    public static boolean getWinJugador2() {
        return WinJugador2;
    }   
    public static void setWinJugador2(boolean value) {
        WinJugador2 = value;
    }
    
}