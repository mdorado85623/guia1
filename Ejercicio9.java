import java.util.Scanner;
/**
 * Programa para determinar los costos y servicios a utilizar en un viaje de un paseo escolar.
 * 
 * @author Mario Esteban Dorado Sánchez 
 * @version Febrero 2020
 */
public class Ejercicio9
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        //definir las variables
        //convenciones: puestos bus = pb, costo comida = cc, num de est gordos = neg, num de est flacos = nef, 
        //numero de buses = nb, costo total habitaciones por dia = cthd,costo total platos = ctp, Costo total hab paseo = cthp,
        //Numero de habitaciones = nh, costo hab dia = chd,
        double pb, cc, neg, nef, nb, cthd, ctp, cthp, nh, np, chd;
        //convenciones: comidas dia est gordos = cdeg,comidas dia est flacos = cdef,Cap habitaciones = ch,
        //num de dias del paseo = ndp
        int cdeg, cdef, ch, ndp;
        //solicitud de la información por parte del usuario
        System.out.println("Cuantos estudiantes gordos iran al paseo?: ");
        neg = teclado.nextDouble();
        System.out.println("Cuantos estudiantes flacos iran al paseo?: ");
        nef = teclado.nextDouble();
        System.out.println("Cuantos días dura el paseo?:");
        ndp = teclado.nextInt();
        //Operaciones a realizar
        pb=60;
        cc=10000;
        ch= 4; 
        chd=25000;
        nb = ((neg*2)+nef)/pb;
        np = ((neg*5)+(nef*3))* ndp;
        ctp = np * cc;
        nh = (neg+nef)/ch;
        chd = (nh * chd);
        cthp = chd * ndp;
        //Mostrar datos de salida
        System.out.println("El número de buses necesarios para el paseo son:" + nb);
        System.out.println("El número de platos a servir son:" + np);
        System.out.println("El costo total de los platos de comida es de:" + ctp);
        System.out.println("El número de habitaciones necesarias son:" + nh);
        System.out.println("El costo total de las habitaciones por dia es de:" + chd);
         System.out.println("Costo total habitaciones paseo = " + cthp);

    }
}
