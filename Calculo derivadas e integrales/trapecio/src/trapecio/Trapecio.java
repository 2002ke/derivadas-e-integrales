

package trapecio;

public class Trapecio {

    public static double f(double x) {
        return 1 / x;
    }

    public static double Funcion(double a, double b, double c) {
        double integral = f(a) + f(b);
        double x = a + c, acum = 0;
        while (x < b) {
            acum += f(x);
            x += c;
        }
        integral += 2 * acum;
        integral *= (c / 2);
        return integral;
    }

    public static void main(String[] args) {
        System.out.println(Funcion(2.3, 9.4, 2.5)); // cambiamos los numeros o las cantidades 
    }

}
