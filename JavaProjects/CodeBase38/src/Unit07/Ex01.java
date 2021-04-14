/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit07;

/**
 *
 * @author Linh
 */
public class Ex01 {

    public static void main(String[] args) {
        System.out.println("Start!");
        int a = 20, b = 0;
        try {
            int c = a/b;
        } catch (Exception e) {
            System.out.println("Lỗi: "+ e.getMessage());
        }
        System.out.println("End!");
    }
}
