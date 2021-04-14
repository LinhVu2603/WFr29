/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit03;

import java.util.Scanner;

/**
 *
 * @author Linh
 */
public class Ex01 {

    public static void main(String[] args) {
        String arrName[] = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrName.length; i++) {
            System.out.print("Please fill student's name" + i + ": ");
            arrName[i] = sc.nextLine();
        }
        for (int i = 0; i < arrName.length; i++) {
            System.out.println(arrName[i]);
        }        
    }
}
