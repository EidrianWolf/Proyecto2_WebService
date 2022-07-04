package cliente_webservice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Cliente_WebService {

    public static void main(String[] args) {

        /*Thread hilo1 = new Thread(new Create("111", "Adrian"));
        Thread hilo2 = new Thread(new Create("222", "Fran"));
        Thread hilo3 = new Thread(new Create("333", "Jerry"));
        Thread hilo4 = new Thread(new Create("444", "Pylan"));
        Thread hilo5 = new Thread(new Create("555", "Gerald"));

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();*/

       
        Scanner leer = new Scanner(System.in);
        int exit = 0;
        String nombre = "";
        String id = "";
        int opc = 1;
        while (opc != 0) {
            System.out.println("--------INGRESE AL DUENIO Y MASCOTA--------");
            System.out.println("******************OPCIONES******************");
            System.out.println("1)   Digite 1 para agregar duenio y mascota");
            System.out.println("0)   Digite 0 para salir");
            System.out.println("--------------------------------------------");
            opc = leer.nextInt();
            leer.nextLine();
            switch (opc) {
                case 1:
                    System.out.println("Digite id del duenio:");
                    id = leer.nextLine();
                    System.out.println("Digite nombre de la mascota:");
                    nombre = leer.nextLine();
                    validar(id, nombre);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No disponible");
                    break;
            }
        }

    }

    private static void validar(String id, String nombre) {
        if (id.isBlank() || nombre.isBlank()) {
            System.out.println("Debe escribir algo");
        } else {
            System.out.println("DATOS");
            System.out.println("ID DUENIO: "+id + " NOMBRE MASCOTA: " + nombre);
            Thread hilo = new Create(id, nombre);
            hilo.start();
            System.out.println("REGISTRADO!");
        }
         
    }

}
