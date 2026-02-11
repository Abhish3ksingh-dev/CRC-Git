public class EvenPrimeNumbers {
    
    public static void main(String[] args) {
        int limit = 100;
        
        
        for (int i = 2; i <= limit; i++) {
            if (isEvenPrime(i)) {
                System.out.print(i);
            }
        }
    }
    
    public static boolean isEvenPrime(int num) {
        return num == 2;
    }
}