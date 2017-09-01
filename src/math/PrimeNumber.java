package math;

public class PrimeNumber {

    public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
        int prime = 0;
        for (int i = 2; i < 1000000; i++) {
            if (findPrimeNum(i)) {
                prime++;
                System.out.println(i);
            }
        }
        System.out.println("The number of Prime numbers on the given range is --> " + prime);
    }

    public static boolean findPrimeNum(int integer) {
        if(integer == 2){
            return true;
        }
        if (integer % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= integer; i = i + 2) {
            if (integer % i == 0) {
                return false;
            }
        }
        return true;
    }
}