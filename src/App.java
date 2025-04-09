import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        EjerciciosRecursivos sec = new EjerciciosRecursivos();
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------------SUMA DE ENTEROS CONSECUTIVOS---------------");
        System.out.print("Ingrese un número entero positivo: ");
        int n1 = sc.nextInt();
        System.out.print("Suma de los numeros consecutivos: " + sec.SumaConsecutivos(n1));

        System.out.println("\n---------------------POTENCIAS-----------------------");
        System.out.print("Ingrese la base de la potencia: ");
        int base = sc.nextInt();
        System.out.print("Ingrese el expotente de la potencia: ");
        int exponente = sc.nextInt();
        System.out.print("Si la base es " + base + " y el exponente es " + exponente + " entonces la respuesta es = " + sec.Potencia(base, exponente));

        System.out.println("\n---------------SUMA DE DIGITOS DE UN NUMERO---------------");
        System.out.print("Ingrese un número entero positivo: ");
        int n2 = sc.nextInt();
        System.out.print("Suma de dígitos: " + sec.SumaDigitos(n2));

        System.out.println("\n-----------------------FIBONICCI-------------------------");
        System.out.println("Ingrese un numero entero positivo");
        int n = sc.nextInt();
        System.out.print("Suma de los numeros consecutivos: " + sec.fibonicci(n));

        sc.close();
    }
}