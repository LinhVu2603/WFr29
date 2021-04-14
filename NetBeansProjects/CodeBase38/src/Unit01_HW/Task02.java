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
public class Task02 {

    public static void main(String[] args) {
        Scanner ban_phim = new Scanner(System.in);
        System.out.println("Please fill your name: ");
        String name = ban_phim.nextLine();
        System.out.println("Please fill your course:");
        String course = ban_phim.nextLine();
        System.out.println("Please fill your School:");
        String school = ban_phim.nextLine();
        System.out.println("Please fill your sexual:");
        String sex = ban_phim.nextLine();
        System.out.println("Please fill your birthday:");
        int a = ban_phim.nextInt();
        int b = ban_phim.nextInt();
        int c = ban_phim.nextInt();
        System.out.println("Please fill your country");
        String country = ban_phim.nextLine();
        System.out.println("Hello " + name + " :\n");
        System.out.println("Study at" + course + school + "\n");
        System.out.println(sex + "\n");
        System.out.println("Born in " + a + "/" + b + "/" + c + "\n");
        System.out.println("Come from" + country);
    }
}
