import java.util.Scanner;
/**
 * Este programa permite mostras la distancia entre dos ciudades conociendo la latitud y longitud de las mismas.
 * 
 * @author Mario Esteban Dorado Sánchez 
 * @version Febrero 2020
 */
public class Ejercicio3
{
   public static void main(String[] args)
   {
       Scanner teclado = new Scanner(System.in);
       //definir las variables
       double distancia, latitud1, latitud2, longitud1, longitud2;
       //solicitud de información al usuario
       System.out.print("Ingrese la latitud de la primera ciudad:");
       latitud1 = teclado.nextDouble();
       System.out.print("Ahora ingrese la longitud:");
       longitud1 = teclado.nextDouble();
       System.out.print("Ingrese la latitud de la segunda ciudad:");
       latitud2 = teclado.nextDouble();
       System.out.print("Ahora ingrese la longitud:");
       longitud2 = teclado.nextDouble();
       //Operacion a realizar - fórmula dada
       distancia = 6371.07 * Math.acos (Math.sin(latitud1))*Math.sin(latitud2)+Math.cos(latitud1)*Math.cos(latitud2)*Math.cos(longitud1)-longitud2;
       //Resultado
       System.out.print("La distancia entre las ciudades es:" + " " + distancia);
    }
}
