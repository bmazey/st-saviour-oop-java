public class FPS extends ShooterGame{
  public String genre;
  public boolean coOp;
  public int players;
  public int releaseYear;

  public FPS(String name, int pov, boolean hasGun, String genre, boolean coOp, int players, int releaseYear){ 
    super(name, pov, hasGun);
    this.genre = genre;
    this.coOp = coOp;
    this.players = players;
    this.releaseYear = releaseYear;
  }
  public int playerAmount(){
    return players += 1;
  }
}