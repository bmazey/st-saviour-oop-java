
abstract class ShooterGame {
    public String name;
    protected boolean hasGun;
    public int pov;    

public ShooterGame(String name, int pov, boolean hasGun){
    this.name = name;
    this.pov = 1;
    this.hasGun = true;
    }
}
