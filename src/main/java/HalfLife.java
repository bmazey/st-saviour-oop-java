public class HalfLife extends FPS{
    public boolean hasZombies;
    public int playableCharacters;

    public HalfLife(String name, boolean hasZombies, int releaseYear){
        super(name, 1, true, "Horror shooter", false, releaseYear);
        this.hasZombies = true;
}
}