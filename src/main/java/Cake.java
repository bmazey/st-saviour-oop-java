public class Cake {

    public int layers;
    public int slices;
    public boolean frosted;
    public boolean sprinkles;
    public String flavor;
    public String[] ingredients;

    public Cake() {
        this.layers = 1;
        this.slices = 8;
        this.frosted = true;
        this.sprinkles = false;
        this.flavor = "chocolate";
        this.ingredients = new String[]{"eggs", "flour", "water", "butter", "sugar", "vanilla"};
    }

    public Cake(int layers, boolean frosted, boolean sprinkles, String flavor) {
        this.layers = layers;
        this.frosted = frosted;
        this.sprinkles = sprinkles;
        this.flavor = flavor;
        this.slices = 8;
        this.ingredients = new String[]{"eggs", "flour", "water", "butter", "sugar", "vanilla"};
    }

    public String eat() {
        if (this.slices > 0) {
            this.slices -= 1;
            return "You eat a slice of the " + this.flavor + " cake!";
        } else {
            return "There are no slices left of the " + this.flavor + " cake. :(";
        }
    }
    
}
