/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author Tisay
 */
public class Name {
    private String firstN;
    private String middleN;
    private String lastN;

    public Name() {}

    public Name(String lname) {
        this.lastN = lname;
    }

    public Name(String lname, String fname) {
        this.firstN = fname;
        this.lastN = lname;
    }

    public Name(String lname, String fname, String mname) {
        this.lastN = lname;
        this.firstN = fname;
        this.middleN = mname;
    }

    public void setName(String lname, String fname, String mname) {
        this.lastN = lname;
        this.firstN = fname;
        this.middleN = mname;
    }

    public void setFirstN(String firstN) {
        this.firstN = firstN;
    }

    public String getFirstN() {
        return firstN;
    }

    public void setMiddleN(String middleN) {
        this.middleN = middleN;
    }

    public String getMiddleN() {
        return middleN;
    }

    public char getMiddleI() {
        return middleN.charAt(0);
    }

    public void setLastN(String lastN) {
        this.lastN = lastN;
    }

    public String getLastN() {
        return lastN;
    }

    public void displayName() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append(getFirstN()).append(" ")
            .append((getMiddleN() == null) ? "" : getMiddleI() + ". ")
            .append(getLastN());
        return sb.toString();
    }
}
