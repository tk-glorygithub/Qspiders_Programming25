import java.util.Scanner;

class PrimeNumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close();

        //Step 1: Check if num is prime.
        boolean isNumPrime = true;
        if (num < 2) {
            isNumPrime = false;
        } else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isNumPrime = false;
                    break;
                }
            }
        }
        if (!isNumPrime) {
            System.out.println(num + " is not a prime number.");
            return;
        }

        // Step 2: Print the representation for prime numbers.
        if (num == 2 || num == 3) {
            System.out.println(num);
        } else if (num == 5) {
            System.out.println("2 + 3 = " + num);
        } else { // num >= 7
            // We'll try representing num as: 2 + 2 + (num - 4) = num
            int diff = num - 4;
            boolean isDiffPrime = true;
            if (diff < 2) {
                isDiffPrime = false;
            } else {
                for (int i = 2; i * i <= diff; i++) {
                    if (diff % i == 0) {
                        isDiffPrime = false;
                        break;
                    }
                }
            }
            if (isDiffPrime) {
                System.out.println("2 + 2 + " + diff + " = " + num);
            } else {
                // If for some reason (num - 4) is not prime, try an alternative representation.
                // For many odd primes greater than 5, Goldbach’s weak conjecture guarantees a representation
                // as the sum of three primes. Here, we'll try 3 + 3 + (num - 6).
                int diff2 = num - 6;
                boolean isDiff2Prime = true;
                if (diff2 < 2) {
                    isDiff2Prime = false;
                } else {
                    for (int i = 2; i * i <= diff2; i++) {
                        if (diff2 % i == 0) {
                            isDiff2Prime = false;
                            break;
                        }
                    }
                }
                if (isDiff2Prime) {
                    System.out.println("3 + 3 + " + diff2 + " = " + num);
                } else {
                    System.out.println("Representation not found.");
                }
            }
        }
    }
}
