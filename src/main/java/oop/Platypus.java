package oop;

public class Platypus extends Mammal {
    public int eggs;

    public Platypus(String name, int eggs) {
        super(name);
        this.eggs = eggs;
    }

    public void layEgg() {
        this.eggs += 1;
    }

    public void hatch() {
        if (this.eggs > 0) {
            this.eggs -= 1;
        }
    }
}
