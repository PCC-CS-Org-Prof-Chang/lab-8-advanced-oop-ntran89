package edu.pasadena.cs.cs03b;

public abstract class Person {
    private String title; // Title of Person's job
    private String name; // Perosn name
    private int Age; // Person age
    //Getters 
    public String getName() {
        return name;
    }
    public int getAge() {
        return Age;
    }
    public String getTitle() {
        return title;
    }
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int Age) {
        this.Age = Age;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    //Abstract summary method that will be implemented in the subclasses
    public abstract void summary();
}
