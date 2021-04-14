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
public class MayBay extends MayMoc implements iBay{

    @Override
    public void napNhienLieu() {
        System.out.println("Máy bay nạp dầu.");
    }

    @Override
    public void bay() {
        System.out.println("Máy bay thì bay bằng động cơ");
    }
}
