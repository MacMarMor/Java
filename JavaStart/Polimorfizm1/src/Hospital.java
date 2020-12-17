class Hospital {
    private static final int MAX_ARRAY_SIZE = 3;
    private Person[] personel = new Person[MAX_ARRAY_SIZE];
    private int idPracownika = 0;

    void add(Person person){
        if(idPracownika < MAX_ARRAY_SIZE) {
            personel[idPracownika] = person;
            idPracownika++;
        }
    }

    String getInfo() {
        System.out.println("Pracownicy szpitala: ");
        String wydrukowanaDana = "";
        for(int i = 0; i < idPracownika; i++){
            wydrukowanaDana = wydrukowanaDana + personel[i].getInfo() + "\n";
        }
        return wydrukowanaDana;
    }
}