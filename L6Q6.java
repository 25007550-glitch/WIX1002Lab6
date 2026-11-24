/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIX1002L6;

/**
 *
 * @author 27006
 */
public class L6Q6 {
  
public class Question6
{

    public static void main(String[] args) {

        int N = 20;

        // First 20 Palindromic Prime Numbers
        System.out.println("The first " + N + " palindromic primes:");

        int count = 0;

        int j = 1;

        while (count < N) {

            if (isPalindromePrime(j)) {

                System.out.print(j + " ");

                count++;
            }

            j++;
        }

        System.out.println("\n");

        // First 20 Emirp Numbers
        System.out.println("The first " + N + " emirp numbers:");

        count = 0;

        j = 1;

        while (count < N) {

            if (isEmirp(j)) {

                System.out.print(j + " ");

                count++;
            }

            j++;
        }

        System.out.println();
    }


    // Method 1: Check Prime Number
    public static boolean isPrime(int n) {

        if (n < 2) {

            return false;
        }

        for (int i = 2; i <= n / i; i++) {

            if (n % i == 0) {

                return false;
            }
        }

        return true;
    }


    // Method 2: Reverse Number
    public static int reverseDigit(int a) {

        int b = 0;

        while (a > 0) {

            b = b * 10 + a % 10;

            a = a / 10;
        }

        return b;
    }


    // Method 3: Check Palindrome
    public static boolean isPalindrome(int a) {

        return a == reverseDigit(a);
    }


    // Method 4: Check Palindromic Prime
    public static boolean isPalindromePrime(int a) {

        if (isPrime(a) && isPalindrome(a)) {

            return true;
        }

        return false;
    }


    // Method 5: Check Emirp
    public static boolean isEmirp(int a) {

        int b = reverseDigit(a);

        if (isPrime(a) && isPrime(b) && !isPalindrome(a)) {

            return true;
        }

        return false;
    }

}
}
