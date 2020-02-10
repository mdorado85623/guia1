import java.util.Scanner;
/**
 * Programa que muestra la cantidad total de energia que se necesita para alcanzar la temperatura deseada para esa cantidad.
 * 
 * @author Mario Esteban Dorado Sánchez 
 * @version Febrero 2020
 */
public class Ejercicio5
{
    public static void main(String[] args)
    {
       Scanner teclado = new Scanner(System.in);
       //definir las variables
       double masa, temperatura, c, q;
       //solicitud de la información por parte del usuario
       System.out.print("Masa del agua:");
       masa = teclado.nextDouble();
       System.out.print("Que temperatura desea:");
       temperatura = teclado.nextDouble();
       //Operaciones a realizar
       //el calor específico del agua varía menos del 1 % respecto de su valor de 4,184 J/(g·K) (Wikipedia - Calor específico)
       c = 4.184;
       q = masa * c * temperatura;
       System.out.println("La cantidad total de energia que se necesita es:" + q);
    }
}
