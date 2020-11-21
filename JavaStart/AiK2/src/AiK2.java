public class AiK2 {
    public static void main(String[] argv){

        Auction aukcja1 = new Auction();
        aukcja1.title = "XBOX One";
        aukcja1.description = "Konsola dla wymagających graczy";
        aukcja1.price = 999.90;
        aukcja1.seller = new Seller();
        aukcja1.seller.name = "Jan";
        aukcja1.seller.subname = "Kowalski";
        aukcja1.seller.address = new Address();
        aukcja1.seller.address.adresSprzedajacego = "ul. Bema 15, 00-401, Warszawa";

        Auction aukcja2 = new Auction();
        aukcja2.title = "Samsung S20";
        aukcja2.description = "Niesamowity telefon z 3 obiektywanmi";
        aukcja2.price = 3999.0;
        aukcja2.seller = new Seller();
        aukcja2.seller.name = "Justyna";
        aukcja2.seller.subname = "Kowalczyk";


        System.out.println("Oferta 1:");
        System.out.println(aukcja1.title + " " + aukcja1.description + " CENA: " + aukcja1.price + " Sprzedający: " + aukcja1.seller.name + " " + aukcja1.seller.subname);
        System.out.println("Oferta 2:");
        System.out.println(aukcja2.title + " " + aukcja2.description + " CENA: " + aukcja2.price + " Sprzedający: " + aukcja2.seller.name + " " + aukcja2.seller.subname);


    }
}