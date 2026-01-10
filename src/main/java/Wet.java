public abstract class Wet extends Location{

    public Wet(String name) {
        super(name);
    }
    public String WetSound(){
        return this.GetName() + " makes rhythmic patterns out of the crashing waves...";
    }
}
