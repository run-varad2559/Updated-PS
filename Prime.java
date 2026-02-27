import java.util.Scanner;

public class SimplePrimeFinder {

    static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int nearestPrime = n;

        while (!isPrime(nearestPrime)) {
            nearestPrime--;
        }

        System.out.println("Nearest Prime Number: " + nearestPrime);

        System.out.println("Next 5 Prime Numbers:");

        int count = 0;
        int num = nearestPrime + 1;

        while (count < 5) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }

        sc.close();
    }
}
