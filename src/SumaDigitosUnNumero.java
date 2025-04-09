public class SumaDigitosUnNumero {

    public static int calcular(int n) {
        if (n < 10) return n;
        return (n % 10) + calcular(n / 10);

    }
}
