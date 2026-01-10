public abstract class Location {
    private String name;
    public Location(String name) {
        this.name = name;
    }

    public void SetName(String name){
        this.name = name;
    }

    public String GetName(){
        return this.name;
    }
}