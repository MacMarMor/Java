public class MetodyIKonstruktory1 {
    public static void main(String[] args) {
        Product product1 = new Product("Czekolada mleczna", "Milka");
        Offer offer1 = new Offer(product1, 3.99, true);
        /*
        product1.name = "Czekolada mleczna";
        product1.producer = "Milka";
        Offer offer1 = new Offer();
        offer1.product = product1;
        offer1.price = 3.99;
        offer1.special = true;
        */

        offer1.printInfo();

        /*
        System.out.println(offer1.product.name + " "
                + offer1.product.producer + " "
                + offer1.price + "zł, "
                + "oferta specjalna? " + offer1.special);

         */
    }
}
