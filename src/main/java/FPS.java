public class FPS extends ShooterGame{
  public String genre;
  public boolean co_op;
  public int releaseYear;

  public FPS(String name, int pov, boolean hasGun, String genre, boolean co_op, int releaseYear){ 
    super(name, pov, hasGun);
    this.genre = genre;
    this.co_op = co_op;
    this.releaseYear = releaseYear;
  }
}