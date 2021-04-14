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
public class Task01 {

    public static void main(String[] args) {
        Scanner ban_phim = new Scanner(System.in);
        System.out.println("Input a:");
        double a = ban_phim.nextDouble();
        System.out.println("Input b:");
        double b = ban_phim.nextDouble();
        if ((a == 0) && (b == 0)) {
            System.out.println("Phuong trinh da cho vo so nghiem!");
        } else if ((a == 0) && (b != 0)) {
            System.out.println("Phương trinh da cho vo nghiem");
        }
        System.out.println("Phuong trinh co nghiem la " + -b / a);
    }
}
