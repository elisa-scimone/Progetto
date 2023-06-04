package progetto;

import java.util.ArrayList;
import java.util.List;

public class Stallaggio {
    private String codice;
    private String zona;
    private String stato;
    private String tipo;
    private int numTecnici;
    private int numCarpetieri;
    private int numFalegnami;

    public Stallaggio(String codice,String zona, String stato, String tipo, int numTecnici, int numCarpetieri, int numFalegnami) {
        this.codice = codice;
        this.zona = zona;
        this.stato = stato;
        this.tipo = tipo;
        this.numTecnici = numTecnici;
        this.numCarpetieri = numCarpetieri;
        this.numFalegnami = numFalegnami;
    }
    public String getCodice(){ return codice; }
    public String getZona(){ return zona; }
    public String getStato(){ return stato; }
    public String getTipo(){return tipo; }
    public int getNumTecnici(){ return numTecnici; }
    public int getNumCarpetieri(){ return numCarpetieri; }
    public int getNumFalegnami(){ return numFalegnami; }
    public int getTotaleLavoratori(){ return numTecnici + numCarpetieri + numFalegnami; }

}
