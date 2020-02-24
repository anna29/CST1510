package week19_lecture;

import java.io.Serializable;

public class Sandwich implements Serializable {

    private String bread;
    private String cheese;

    public Sandwich() {
    }

    public Sandwich(String bread, String cheese) {
        this.bread = bread;
        this.cheese = cheese;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

}
