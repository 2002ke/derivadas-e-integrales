
package derivada;


public class funcion {
    private int a;
    private int b;
    private int c;
    private int n;
    public double inicio;
    public double fin;
    public funcion(int a, int b, int c, int n)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.n = n;
    }
    
    public String funcion_inicial()
    {
        
        
        String inicial = "";
        inicial = String.valueOf(a)+" X^"+String.valueOf(n)+" + "+String.valueOf(b)+" X^"+String.valueOf(n-1)+" + "+ c+" X";
        return inicial;
    }
    public String derivada_funcion(){
            
            
            String result = "";
            
            
            result = String.valueOf(n*a)+"X^"+String.valueOf(n-1)+"+"+String.valueOf((n-1)*b)+"X^"+String.valueOf(n-1-1)+"+"+ c;
           
        return result;
            }
    
    
}

