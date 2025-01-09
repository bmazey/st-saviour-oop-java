public class half_life extends fps{
    public boolean has_zombies;
    public int playable_characters;

public half_life(String genre, int series_release_year, boolean co_op){
    super(series_release_year, co_op);
    this.genre = "horror";
    this.co_op = false;
    this.series_release_year = 1998;
}
    }