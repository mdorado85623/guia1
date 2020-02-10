import java.util.Scanner;
/**
 * Programa para calcular y mostrasr el area de un círculo solicitando al usuario el valor de un radio.
 * 
 * @author Mario Esteban Dorado Sánchez 
 * @version Febrero 2020
 */
public class Ejercicio4
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        //definir las variables
        double r, area, volumen;
        System.out.print("Por favor digite el valor del radio:");
        r = teclado.nextDouble();
        //Operaciones a realizar
        area = Math.PI * Math.pow(r,2);
        volumen = (4.0 / 3.0) * Math.PI * Math.pow(r,3);
        //Datos de salida
        System.out.println("El área del circulo es:= " + area);
        System.out.println("El volumen de la esfera es: = " + volumen);
    }
}
