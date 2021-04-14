/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit01_HW;

import java.util.Scanner;

/**
 *
 * @author Linh
 */
public class Task05 {

    public static void main(String[] args) {
        Scanner ban_phim = new Scanner(System.in);
        System.out.println("Input a:");
        double a = ban_phim.nextDouble();
        System.out.println("Input b:");
        double b = ban_phim.nextDouble();
        System.out.println("Input c:");
        double c = ban_phim.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh da cho vo nghiem!");
        } else if ((a == 0) & (b == 0) & (c == 0)) {
            System.out.println("Phuong trinh co vo so nghiem!");
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep:");
            System.out.println("x = " + -b / (2 * a));
        } else {
            System.out.println("Phuong trinh co 2 nghiem:");
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1 + "\n");
            System.out.println("x2 = " + x2 + "\n");
        }
    }
}
