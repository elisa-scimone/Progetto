package progetto;

public class Lavoratori {
    private int tecnici;
    private int carpentieri;
    private int falegnami;

    public Lavoratori(int tecnici, int carpentieri, int falegnami){
        this.tecnici = tecnici;
        this.carpentieri = carpentieri;
        this.falegnami = falegnami;
    }
    public int getTecnici(){ return tecnici; }
    public int getCarpentieri(){ return carpentieri; }
    public int getFalegnami(){ return falegnami; }

}
