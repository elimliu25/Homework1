public class Reduce {

    // How many steps to reduce n to 0
    public static int reduceToZero(int n) {
        int steps = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n - 1;
            }
            steps++;
        }

        return steps;
    }

    //test with n = 100
    public static void main(String[] args) {
        int result = reduceToZero(100);
        System.out.println("It takes " + result + " steps to reduce 100 to 0.");
    }
}
