public class  SumaEnterosConsecutivos{
    
    public static int suma(int n){
        if (n == 1) return 1;
        return n + suma(n-1);

    }
}
