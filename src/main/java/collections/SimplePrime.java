package collections;

public class SimplePrime {
    public static void main(String[] args) {
        System.out.println("prime numbers from 1 t0 100 ");
        for (int i=2;i<=100; i++){
            if (isPrime(i)){
                System.out.println(i + "  ");

            }

        }
    }
    static boolean isPrime(int num){
        if (num <=1) return false ;
            for (int i=2;i<=Math.sqrt(num);i++){
                if (num %i==0){
                    return false;

                }
            }
            return true;

    }
}
