/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit06;

/**
 *
 * @author Linh
 */
public class Ex01 {
    public static void main(String[] args) {
        int a = 10;
        Integer b = 20;
        String c = "30";
        int d = Integer.parseInt(c);
        float e = Float.parseFloat(c);
        String f = String.valueOf(d);
        System.out.println(d+b);
        Integer g = Integer.valueOf(a);
        System.out.println(g+b);
    }
}
