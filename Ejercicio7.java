import java.util.Scanner;
/**
 * Programa para calcular la cantidad de viajes, la cantidad de gasolina y su costo de un viaje de carga entre Bogotá y Sasaima.
 * 
 * @author Mario Esteban Dorado Sánchez 
 * @version Febrero 2020
 */
public class Ejercicio7
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        //definir las variables
        double costogas, distancia, capcarga, consumogas, cantkg, viajes, cantgal, costo;
        //solicitud de la información por parte del usuario
        System.out.println("digite la capacidad de carga del caminon en kg?:");
        capcarga = teclado.nextDouble();
        System.out.println("Cuántos km por galon realiza el camión?:");
        consumogas = teclado.nextDouble();
        System.out.println("Digite la cantidad de kilos a transportar?:");
        cantkg = teclado.nextDouble();
        //Operaciones a realizar
        costogas = 10000;
        //distancia Bogotá - Sasaima de acuerdo a Google Maps existe una distancia de 80.2 Km.
        distancia = 80.2;
        viajes = cantkg / capcarga;
        cantgal = (distancia / consumogas) * viajes;
        costo = cantgal * costogas * viajes;
        System.out.println("Los viajes necesarios para transportar la carga deseada es:" + viajes);
        System.out.println("La cantidad de galones de gasolina necesarios son:" + cantgal);
        System.out.println("El costo de la gasolina:" + costo);
    }
}
