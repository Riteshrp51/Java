public class Prime {
    
    public static boolean isPrime(int n) {
        if(n==1 || n==0) {
            return false;
        }
        for(int i=2;i<n;i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int N = 50;

        for(int i=1;i<N;i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
