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
public class Chim extends DongVat implements iBay{

    @Override
    public void Bay() {
        System.out.println("Chim bay bằng cánh.");
    }

    @Override
    public void sinhSan() {
        System.out.println("Chim sinh sản bằng hình thức đẻ trứng.");
    }
    
}
