package oop;

public abstract class Mammal extends Animal {
    public final boolean WARM_BLOODED = true;
    public final boolean HAS_FUR = true;

    public Mammal(String name) {
        super(name);
    }

    public String sleep() {
        return this.getName() + " sleeps! ZzZzZz ...";
    }
}
