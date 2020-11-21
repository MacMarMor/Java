class Firma extends NrTelefoniczny{
    String nazwa;
    String adres;

    public Firma(){
            nazwa = "";
            adres = "";
            NrTelefonu = 0;
            NrKierunkowy = 0;
    }

    public Firma(String nazF, String adF, Integer telF, Integer kierF){
            nazwa = nazF;
            adres = adF;
            NrTelefonu = telF;
            NrKierunkowy = kierF;
    }
}
