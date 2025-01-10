public class HalfLife extends FPS{
    public boolean has_zombies;
    public int playable_characters;

public HalfLife(String name, String genre, int releaseYear, boolean co_op){
    super(name, 1, true, "horror shooter", co_op, releaseYear);
    this.genre = "horror";
    this.co_op = false;
    this.releaseYear = 1998;
}
}