public class Multiples {

    //returns the count.
    public static int countMultiples(int n, int a, int b) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                count++;
            }
        }

        return count;
    }

    // psvm for testing from the command line or IntelliJ
    public static void main(String[] args) {
        //how many numbers below 1000 are divisible by 3 or 5
        int result = countMultiples(1000, 3, 5);
        System.out.println("There are " + result + " multiples of 3 or 5 below 1000.");
    }
}