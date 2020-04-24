public class Primes {
    public static void main(String[] args) {
        for (int j = 2; j <= 100; j++) {
            if (inPrime(j)) {
                System.out.println("Число " + j);

            }


        }

    }
    public static boolean inPrime(int n) {
        for (int i =2; i < n; i++){
            if ((n % i) == 0) {
                return false;}}
            return true;
    }
}


