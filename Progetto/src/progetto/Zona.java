package progetto;

import java.util.ArrayList;

public class Zona {
    private String codice;
    private ArrayList<Stallaggio> stallaggi;
    private ArrayList<Zona> adiacenti;

    public Zona(String codice){
        this.codice= codice;
        this.stallaggi= new ArrayList<>();
        this.adiacenti = new ArrayList<>();
    }
    //Metodi per gestire gli stallaggi
   /* public void aggiungiStallaggio(Stallaggio stallaggio){ stallaggi.add(stallaggio); }
    public void rimuoviStallaggio(Stallaggio stallaggio){ stallaggi.remove(stallaggio); }
    public void aggiungiZonaAdicente(Zona zona){
        adiacenti.add(zona);
    }
    public void rimuoviZonaAdiacente(Zona zona){
        adiacenti.remove(zona);
    }*/
    public ArrayList<Zona> getZoneAdiacenti(){ return adiacenti; }
    public ArrayList<Stallaggio> getStallaggi(){ return stallaggi; }
    public String getCodice(){ return codice; }
    public void setCodice(String codice){ this.codice= codice; }
}
