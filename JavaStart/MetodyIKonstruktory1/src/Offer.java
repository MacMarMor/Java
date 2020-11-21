public class Offer {
    Product product;
    double price;
    boolean special;

    Offer(Product producent, double cena, boolean oferta){
        product = producent;
        price = cena;
        special = oferta;
    }

    void printInfo() {
        System.out.println(product.name + ", " + product.producer + ", " + price + "zł; Oferta specjalna: " + special);
    }
}
