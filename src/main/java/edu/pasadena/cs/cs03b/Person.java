package edu.pasadena.cs.cs03b;

public abstract class Person {
    private String title;
    private String name;
    private int Age;
    public String getName() {
        return name;
    }
    public int getAge() {
        return Age;
    }
    public String getTitle() {
        return title;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int Age) {
        this.Age = Age;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public abstract void summary();
}
