/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIX1002L6;

/**
 *
 * @author 27006
 */
import java.util.Scanner;
public class L6Q3 {
    public static void reverseInt(int[] n) {
        for (int i = 0; i < n.length; i++) {
            int value = n[i];
            int reversed = 0;

            while (value != 0) {
                int digit = value % 10;
                reversed = reversed * 10 + digit;
                value /= 10;
            }

            n[i] = reversed;
        }
    }

    public static void main(String[] args) {
        Scanner scanners = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanners.nextInt();
        }

        reverseInt(numbers);

        System.out.print("Reversed integers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        scanners.close();
    }
}
