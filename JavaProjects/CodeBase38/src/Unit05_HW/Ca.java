/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit05_HW;

/**
 *
 * @author Linh
 */
public class Ca extends DongVat implements iBoi {

    @Override
    public void Boi() {
        System.out.println("Cá có thể bơi.");
    }

    @Override
    public void sinhSan() {
        System.out.println("Cá sinh sản bằng hình thức đẻ trứng.");
    }

}
