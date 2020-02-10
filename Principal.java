import java.util.Scanner;
/**
 * Programa que pide al usuario el valor de 2 variables enteras para realizar diferentes calculos aritméticos.
 * 
 * @author Mario Esteban Dorado Sánchez
 * @version Febrero 2020
 */
public class Principal
{
   public static void main(String[] args)
   {
       //definir las variables para las operaciones aritméticas
       double a, b;
       double suma, diferencia, producto, division, residuo, logaritmo, potencia;
       Scanner teclado = new Scanner(System.in);
       //solicitud de la información por parte del usuario
       System.out.println("Ingrese un valor para a:");
       a = teclado.nextDouble();
       System.out.println("Ingrese un valor para b:");
       b = teclado.nextDouble();
       //Operaciones a realizar
       suma = a + b;
       diferencia = b - a;
       producto = a * b;
       division = a / b;
       residuo = a % b;
       logaritmo = Math.log10(a);
       potencia = Math.pow(a , b);
       //Mostrar datos de salida
       System.out.println("La suma de a + b es" + " = " + suma);
       System.out.println("La diferencia cuando b es restado de a es" + " = "+ diferencia);
       System.out.println("El producto de a y b es" + " = "+ producto );
       System.out.println("El cociente cuando a es dividido entre b es" + " = "+  division);
       System.out.println("El residuo de la división de a entre b es" + " = "+ residuo);
       System.out.println("El resultado de encontrar el logaritmo de a es" + " = "+ logaritmo);
       System.out.println("La resultado de a elevado a b es" + " = "+ potencia);
    }
}
