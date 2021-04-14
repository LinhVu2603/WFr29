/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit03_HW;

import java.util.Scanner;

/**
 *
 * @author Linh
 */
public class Task02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Radius r:");
        double r = sc.nextDouble();
        circleArea(r);
        System.out.println("Area of the circle is: " + circleArea(r));
    }
    
    public static double circleArea(double radius) {
        double S = Math.PI * Math.pow(radius, 2);
        return S;
    }
}
