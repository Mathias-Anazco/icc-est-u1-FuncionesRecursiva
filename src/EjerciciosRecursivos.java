public class  EjerciciosRecursivos{
    
    public int llamadasRecursiva = 1;
    public int SumaConsecutivos(int n){
        int idActual = llamadasRecursiva++;

        System.out.println("LLamada a "+ idActual +" con numero n = "+n);

        if (n == 1){
            System.out.println("Llamada a "+ idActual +" caso baso alcanzado n = 1");
            return 1;
        }

        System.out.println("Llamada a "+ idActual +" Llamando recursivamente con n = "+(n - 1));
        int resultadoParcial = SumaConsecutivos(n-1);
    
        int resultado = n + resultadoParcial;
        System.out.println("Llamada a "+ idActual +" sumando "+ n + " al resultado de "+ resultadoParcial +" = "+ resultado);
    
        System.out.println("Llamada a "+ idActual +" retorno "+ resultado);
        return resultado;
    }
    public int SumaDigitos(int n) {
        if (n < 10) return n;
        return (n % 10) + SumaDigitos(n / 10);

    }
    public int Potencia(int base, int exponente){
        if (exponente == 0) return 1;
        return base * Potencia(base, exponente - 1);

    }
    public int fibonicci(int n){
        if (n <= 1){ 
            return n;
        }else if (n == 1){
            return 1;
        }
        return fibonicci(n - 1) + fibonicci(n - 2);
    }
}
