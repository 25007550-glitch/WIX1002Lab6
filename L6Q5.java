/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIX1002L6;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author 27006
 */
public class L6Q5 {
    public static boolean checkAnswer(int a, int b, int answer) {
        return a * b == answer;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int score = 0;

        while (true) {

            int a = random.nextInt(13);
            int b = random.nextInt(13);

            System.out.println("Enter negative number to quit.");
            System.out.print(a + " x " + b + " = ");

            int answer = input.nextInt();

            if (answer < 0) {
                break;
            }

            if (checkAnswer(a, b, answer)) {
                score++;
            }
        }

        System.out.println("Your Score is " + score);
        input.close();
    }
    
}
