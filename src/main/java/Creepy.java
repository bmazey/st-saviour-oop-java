public abstract class Creepy extends Location{

    public Creepy(String name) {
        super(name);
    }

    public String CreepySound(){
        return this.GetName() + " makes discomforting and unsettling sounds...";
    }
}
