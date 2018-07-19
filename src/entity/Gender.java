/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author anhquan17
 */
public enum Gender {

    NAM(1, "Nam"), NU(0, "Nu"), KXD(-1, "Undefined");

    private int genderId;
    private String genderName;

    private Gender() {
    }

    private Gender(int genderId, String genderName) {
        this.genderId = genderId;
        this.genderName = genderName;
    }

    public int getGenderId() {
        return genderId;
    }

    public void setGenderId(int genderId) {
        this.genderId = genderId;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

    public static Gender getByGenderId(int genderId) {

        switch (genderId) {
            case 1:
                return NAM;
            case 0:
                return NU;

            default:
                return KXD;
        }
    }

}
