import java.util.Scanner;
/**
 * Programa que convierte la eficiencia de combustible en MPG y lo entrega en LPK.
 * 
 * @author Mario Esteban Dorado Sánchez 
 * @version Febrero 2020
 */
public class Ejercicio2
{
   public static void main(String[] args)
   {
       //definir las variables
       double mpg, lpk;
       double equivalencia;
       Scanner teclado = new Scanner(System.in);
       lpk = 235.21;
       System.out.print("Digite el valor de una eficiencia de combustible en Millas por galón (MPG):");
       mpg = teclado.nextDouble();
       equivalencia = (lpk / mpg);
       System.out.println("La equivalencia en Colombia es:" + " = "+ equivalencia+ "Litros por Kilómetro (LPK)");
       
    }
}
