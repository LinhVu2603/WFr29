/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit05;

/**
 *
 * @author Linh
 */
public class TinhTong {
    public int cong(int a, int b){
        return a+b;
    }
    public String cong(String a, String b){
        return a.concat(b);
    }
    public static void main(String[] args) {
        TinhTong t = new TinhTong();
        System.out.println(t.cong("Abcd", "efghtk"));
        System.out.println(t.cong(03, 03));
    }
}