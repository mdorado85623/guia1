import java.util.Scanner;
/**
 * Programa para calcular y mostrar el área de un polígono regular a partir de esos valores.
 * 
 * @author Mario Esteban Dorado Sánchez 
 * @version Febrero 2020
 */
public class Ejercicio6
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        //definir las variables
        double s, m, area;
        //solicitud de la información por parte del usuario
        System.out.print("Digite el valor de la longitud de un lado del polígono:");
        s = teclado.nextDouble();
        System.out.print("Digite el número de lados del polígono:");
        m = teclado.nextDouble();
        //Operaciones a realizar
        area = (m*Math.pow(s,2))/(4*Math.tan(Math.PI/m));
        System.out.println("El área del polígono regular es:" + area);
    }
}
