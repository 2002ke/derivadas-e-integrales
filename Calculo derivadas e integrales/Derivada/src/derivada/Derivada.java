
package derivada;

import java.util.Scanner;


public class Derivada {

    
    public static void main(String[] args) {
     
                
       double inicio = System.currentTimeMillis(); 
      Scanner reader = new Scanner(System.in);
      int a=0, b=0, c=0, exp=0;

      
      
      System.out.println("Digite el valor de a");
       a = reader.nextInt();
       System.out.println("Digite el valor de b");
       b = reader.nextInt();
       System.out.println("Digite el valor de c");
       c = reader.nextInt();
       System.out.println("Digite el exponente");
       exp = reader.nextInt();       
       funcion fun = new funcion(a,b,c,exp);
       String ini = fun.funcion_inicial();
       String res = fun.derivada_funcion();
       System.out.println("La funcion inicial es :\n "+ini+" \n\nLa solucion es  : \n"+ res);
       double fin = System.currentTimeMillis() - inicio;
       System.out.println("El tiempo es : "+fin+" milisegundos");
       
    }
}

