package oop;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        // This is where policy goes.
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String eat(String food) {
        return this.name + " eats " + food + "!";
    }
}
