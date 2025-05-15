public class Multiples {

    // Main logic
    public static int countMultiples(int n, int a, int b) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                count++;
            }
        }
        return count;
    }

    //default parameters
    public static void main() {
        int result = countMultiples(1000, 3, 5);
        System.out.println("There are " + result + " multiples of 3 or 5 below 1000.");
    }

    // Required psvm for IntelliJ to run it directly
    public static void main(String[] args) {
        main();  // just call the default one
    }
}
