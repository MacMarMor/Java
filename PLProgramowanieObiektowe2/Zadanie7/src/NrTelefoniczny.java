class NrTelefoniczny implements Comparable<NrTelefoniczny> {
    int NrKierunkowy;
    int NrTelefonu;


    public NrTelefoniczny(){
        NrKierunkowy = 0;
        NrTelefonu = 0;
    }

    public NrTelefoniczny(int NrKierunkowy, int NrTelefonu){
        this.NrKierunkowy = NrKierunkowy;
        this.NrTelefonu = NrTelefonu;
    }

    public int compareto(NrTelefoniczny a, NrTelefoniczny b) {
        return a.NrTelefonu - b.NrTelefonu;
    }

    @Override
    public int compareTo(NrTelefoniczny o) {
        return this.NrTelefonu;
    }
}