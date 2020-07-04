package com.patterns.Prototype;

public class Sheep implements Cloneable {
    private String name;
    public Sheep(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        return new Sheep(this.name);
    }

    public static void main(String[] args) {
        Sheep origin = new Sheep("团团");
        Sheep o2 = origin;
        origin.setName("圆圆");
        try {
            Sheep clone = origin.clone();
            String result = origin.getName().equals(clone.getName()) ?"clone是浅拷贝":"clone是深拷贝";
            System.out.println(result);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
