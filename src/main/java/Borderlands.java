public class Borderlands extends FPS{
    public boolean humor = true;
    protected String vaultHunter;
    private boolean hasSiren = true;

    void setHasSiren(boolean siren){
        this.hasSiren = siren;
    }
    
    public Borderlands(String name, String vaultHunter, int players, int releaseYear){
        super(name, 1, true, "looter shooter", true, 4, releaseYear);
        this.vaultHunter = vaultHunter;
    }
    public boolean getHasSiren(){
        return this.hasSiren;
    }
}
