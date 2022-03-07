package edu.fci;

public class Student {
    private int age;
    private String name;
    private float c1,c2,c3;

    public Student() {
        System.out.println("Hello");
    }

    public Student(String name, int age, float c1, float c2, float c3) {
        this.name = name;
        this.age = age;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getC1() {
        return c1;
    }

    public void setC1(float c1) {
        if(c1>=0 && c1<100)
            this.c1 = c1;
        else
            this.c1 = 0;
    }

    public float getC2() {
        return c2;
    }

    public void setC2(float c2) {
        this.c2 = c2;
    }

    public float getC3() {
        return c3;
    }

    public void setC3(float c3) {
        this.c3 = c3;
    }

    public void setAge(int a){
        if(a>0)
            age = a;
        else
            age = 15;
    }

    public int getAge(){
        return age;
    }

    public float Total(){
        return c1+c2+c3;
    }
    public void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Grades: "+"\n"+c1+"\n"+c2+"\n"+c3);

    }

}
