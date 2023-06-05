import java.util.ArrayList;
import java.util.List;
   class Zona{
        private String codice;
        private List<Zona> adiacenti;
        private List<Stallaggio> stallaggi;

        public Zona(String codice) {
            this.codice = codice;
            this.adiacenti = new ArrayList<>();
            this.stallaggi = new ArrayList<>();
        }

        public String getCodice() {
            return codice;
        }

        public List<Zona> getAdiacenti() {
            return adiacenti;
        }

        public List<Stallaggio> getStallaggi() {
            return stallaggi;
        }
    }
