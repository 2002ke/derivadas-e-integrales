
package riemann;

import java.util.Scanner;

public class Riemann1 {
    public static void main(String[] args) {
            // creacion del Scanner para obtener datos desde teclado 
        Scanner sc = new Scanner(System.in);
        // ingresamos el valor de  a que es el valor del límite inferior:
        System.out.println("Valor de a:");
        double a = sc.nextFloat();
       
        //ingresamos el valor de  b que es el valor del límite superior:
        System.out.println("Valor de b:");
        double b = sc.nextFloat();
       
        //Valor del número de intervalos:
        System.out.println("Cantidad de intervalos (n):");
        double n = sc.nextFloat();
       
        double dx = (b-a)/n;
        System.out.println("dx:" + dx);
        double s = 0.0; //  variable tipo double y en 0.0
        double x = 0.0; //  variable tipo double y en 0.0
        double y = 0.0; //  variable tipo double y en 0.0
        int j=0;
        for(double i = a;i <= b-(dx/2);i += dx) { //creamos un for para  cumplir la condicion asignada 
            x = i+(dx/2);     
            y = Funcion_f(x);
            s+= dx*y;
            System.out.println("i=" + ++j +" x=" + x + " f(x)=" + y + " area parcial=" + (dx+y) ); // concatenamos  los resultados con las variables 
        }
        System.out.println("El área bajo la curva es:"+s+" unidades cuadradas."); // concatenamos el resultado con la variable s 
    }
   
    private static double Funcion_f(double x) {
        //Declaración de la función f(x):
        double y=Math.pow(x, 2) - 2;
        //Devolver el valor de f(x)
        return(y);
    }
}


