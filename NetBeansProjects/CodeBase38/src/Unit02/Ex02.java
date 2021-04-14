/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit02;

import java.util.Scanner;

/**
 *
 * @author Linh
 */
public class Ex02 {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number:");
        number = sc.nextInt();
        if (number % 7 == 2) {
            System.out.println("Today is Monday!");
        } else if (number % 7 == 3) {
            System.out.println("Today is Tuesday!");
        } else if (number % 7 == 4) {
            System.out.println("Today is Wednesday!");
        } else if (number % 7 == 5) {
            System.out.println("Today is Thursday!");
        } else if (number % 7 == 6) {
            System.out.println("Today is Friday!");
        } else if (number % 7 == 0) {
            System.out.println("Today is Saturday!");
        } else {
            System.out.println("Today is Sunday!");
        }
    }
}
