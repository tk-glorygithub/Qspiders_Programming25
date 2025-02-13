import java.util.Scanner;

class GoodPrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input range
        System.out.print("Enter Range1 (Lower Bound): ");
        int Range1 = sc.nextInt();
        System.out.print("Enter Range2 (Upper Bound): ");
        int Range2 = sc.nextInt();

        System.out.println("\nGood Prime Numbers between " + Range1 + " and " + Range2 + ":");

        for (int i = Range1; i <= Range2; i++) {
            // Step 1: Check if the number is prime
            boolean isPrime = true;
            if (i < 2) continue; // Skip numbers < 2
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                int num = i;
                boolean isGoodPrime = true;

                // Step 2: Check if all digits are prime
                while (num > 0) {
                    int rem = num % 10; // Extract digit
                    boolean isDigitPrime = true;

                    // Check if the digit is prime
                    if (rem < 2) {
                        isDigitPrime = false;
                    } else {
                        for (int j = 2; j * j <= rem; j++) {
                            if (rem % j == 0) {
                                isDigitPrime = false;
                                break;
                            }
                        }
                    }

                    if (!isDigitPrime) {
                        isGoodPrime = false;
                        break;
                    }

                    num /= 10; // Remove last digit
                }

                if (isGoodPrime) {
                    System.out.println(i);
                }
            }
        }
    }
}
