public class Winda {
    private Osoba[] wsiada = new Osoba[10];
    private int iloscOsob = 0;
    private final int maxWaga = 400;

    void wsiadanie(Osoba osoba){
        if(iloscOsob < 4){
            wsiada[iloscOsob] = osoba;
           // System.out.println("osoby" + iloscOsob);
            iloscOsob++;
        }
        else{
            System.out.println("W windzie nie ma już miejsca. Proszę poczekać");
        }
    }

    void start(){
        if (wagaPoprawna()){
            System.out.println("Winda jedzie");
        }else{
            System.out.println("Winda jest przeciążona");
        }
    }

    private boolean wagaPoprawna() {
        return getMaxWaga() <= maxWaga;
    }

    private int getMaxWaga(){
        int sumaWagOsob = 0;
        if(wsiada[0]!=null){
            sumaWagOsob += wsiada[0].getWaga();
        }
        if(wsiada[1]!=null){
            sumaWagOsob += wsiada[1].getWaga();
        }
        if(wsiada[2]!=null){
            sumaWagOsob += wsiada[2].getWaga();
        }
        if(wsiada[3]!=null){
            sumaWagOsob += wsiada[3].getWaga();
        }
        return sumaWagOsob;
    }

    void wysiadka(){
        System.out.println("Winda jest pusta");
        wsiada[0] = null;
        wsiada[1] = null;
        wsiada[2] = null;
        wsiada[3] = null;
        iloscOsob = 0;
    }
}
