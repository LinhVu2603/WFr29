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
public abstract class MayMoc {

    String tenMay;
    String namSX;
    int CongSuat;

    public void chay() {
        System.out.println("Máy thì chạy");
    }

    public abstract void napNhienLieu();
}
