
    class Stallaggio {
        private String codice;
        private Zona zona;
        private String stato;
        private String tipo;
        private int tecnici;
        private int carpentieri;
        private int falegnami;

        public Stallaggio(String codice, Zona zona, String stato, String tipo, int tecnici, int carpentieri, int falegnami) {
            this.codice = codice;
            this.zona = zona;
            this.stato = stato;
            this.tipo = tipo;
            this.tecnici = tecnici;
            this.carpentieri = carpentieri;
            this.falegnami = falegnami;
        }

        public String getCodice() {
            return codice;
        }

        public Zona getZona() {
            return zona;
        }

        public String getStato() {
            return stato;
        }

        public String getTipo() {
            return tipo;
        }

        public int getTecnici() {
            return tecnici;
        }

        public int getCarpentieri() {
            return carpentieri;
        }

        public int getFalegnami() {
            return falegnami;
        }
    }

