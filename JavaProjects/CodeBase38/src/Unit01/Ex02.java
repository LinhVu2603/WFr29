/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit01;

import java.util.Scanner;

/**
 *
 * @author Linh
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner ban_phim = new Scanner(System.in);
        System.out.println("Please show your name: ");
        String name = ban_phim.nextLine();
        System.out.println("Please show your age:");
        int old = ban_phim.nextInt();
        System.out.println("Hello " + name + ": the " + old + " years old guy!");
    }
}
