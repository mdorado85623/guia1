import java.util.Scanner;
/**
 * Programa para calcular el costo de uso de un colectivo de transporte de personal.
 * 
 * @author Mario Esteban Dorado Sánchez 
 * @version Febrero 2020
 */
public class Ejercicio8
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        //definir las variables
        double pasaje, pagoxviaje,capacidad,nviajes, pagototal,propietario;
        int pasajeros;
        //solicitud de la información por parte del usuario
        System.out.println("cuál es la capacidad del colectivo?:");
        capacidad = teclado.nextDouble();
        System.out.println("Digite la cantidad de pasajeros:");
        //Operaciones a realizar
        pasaje = 10000;
        pagoxviaje = 2000;
        pasajeros = teclado.nextInt();
        nviajes = pasajeros / capacidad;
        pagototal = pasajeros * pasaje;
        propietario = pasajeros * pagoxviaje;
        //Mostrar datos de salida
        System.out.println("el numero de viajes necesarios es:" + nviajes);
        System.out.println("El pago total total a pagar por los turistas es:" + pagototal);
        System.out.println("El dinero a pagar al propietario es de" + propietario);
    }
}
