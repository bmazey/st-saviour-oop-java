public class Borderlands extends FPS{
    public boolean humor = true;
    protected String vault_hunter;

    public Borderlands(String name, String vault_hunter, int releaseYear){
        super(name, 1, true, "looter shooter", true, releaseYear);
        this.vault_hunter = vault_hunter;
    }
}
