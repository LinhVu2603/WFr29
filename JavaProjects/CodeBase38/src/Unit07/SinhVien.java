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
public class SinhVien {

    private String name;
    private int old;
    private String school;

    public SinhVien() {
    }

    public SinhVien(String name, int old, String school) {
        this.name = name;
        this.old = old;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.old + " - " + this.school;
    }

}
