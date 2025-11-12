package edu.touro.mcon152;
public class Greeter {
    private String name;
    public Greeter(String name) {
        this.name = name;
    }
    public String greet() {
        return "Hello, " + name + "!";
    }
}