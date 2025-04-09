import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Ingrese un número entero positivo: ");
        int n1 = sc.nextInt();
        System.out.print("Suma de los numeros consecutivos: " + SumaEnterosConsecutivos.suma(n1));
    
        System.out.print("\nIngrese la base de la potencia: ");
        int base = sc.nextInt();
        System.out.print("Ingrese el expotente de la potencia: ");
        int exponente = sc.nextInt();
        System.out.print("Si la base es " + base + " y el exponente es " + exponente + " entonces la respuesta es = " +Potencia.calcular(base, exponente));
    
        System.out.print("\nIngrese un número entero positivo: ");
        int n2 = sc.nextInt();
        System.out.print("Suma de dígitos: " + SumaDigitosUnNumero.calcular(n2));
    }
}