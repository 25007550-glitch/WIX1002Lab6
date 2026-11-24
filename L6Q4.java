/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WIX1002L6;

/**
 *
 * @author 27006
 */
public class L6Q4 {
    public static int gcd(int a, int b) {

        int result = 1;

        for (int i = 1; i <= Math.min(a, b); i++) {

            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }

        return result;
    }
   
     
     

    public static void main(String[] args) {


        System.out.println(gcd(48,24));
    }
    
}
