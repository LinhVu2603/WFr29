/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit06_HW;

import java.util.Scanner;

/**
 *
 * @author Linh
 */
public class Task02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi: ");
        String str = sc.nextLine();
        boolean bool = false;
        for (int i = 0; i < str.length() / 2; i++) {
            String a = String.valueOf((str.charAt(i)));
            String b = String.valueOf((str.charAt(str.length()-1-i)));
            bool = a.equals(b);
        }
        if (!(bool == true)) {
            System.out.println("Chuỗi đã nhập là chuỗi Palindrome.");
        } else 
        {
            System.out.println("Chuỗi đã nhập không là chuỗi Palindrome.");
        }
    }
}
