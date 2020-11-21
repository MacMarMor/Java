public class PrintService {

    public void printPodsumowanie(Client client, double originalPrice, double discountPrice) {
        testKlienta(client);
        testCeny(originalPrice, discountPrice);
    }
    //Sprawdzanie Imienia i Nazwiska
    private void testKlienta(Client client){

        if( client.getFirstName().isEmpty() && client.getLastName().isEmpty() ){
            System.out.println("Witaj Nieznajomy");
        }
        else if( client.getFirstName().isEmpty() ){
            System.out.println("Dzień dobry panie/pani Kowalski");
        }
        else if( client.getLastName().isEmpty() ){
            System.out.println("Witaj Jan");
        }
        else{
            System.out.println("Witaj Jan Kowalski");
        }
    }
    //Sprawdzanie zniżki
    private void testCeny(double price, double discountPrice) {
        System.out.println("Cena przed rabatem: " + price);
        System.out.println("Cena po uwzględnieniu rabatu: " + discountPrice);
    }

}
