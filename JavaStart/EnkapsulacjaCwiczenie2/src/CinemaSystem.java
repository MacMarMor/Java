public class CinemaSystem {
    public static void main(String[] args) {

        Reservation reserve = new Reservation();
        Movie movie1 = new Movie("Omen", "horror", 128, 16, 72, 72);

        Client client1 = new Client("Jan", "Kowalski", 15);
        Client client2 = new Client("Anna", "Zalewska", 19);

        System.out.println("Sprzedane bilety");

        Ticket ticket1 = reserve.createTicket(client1, movie1);
        Ticket ticket2 = reserve.createTicket(client2, movie1);

        if(ticket1 != null){
            System.out.println( ticket1.getTicketId() + " " + ticket1.getClient().getFirstName()  + " " + ticket1.getClient().getLastName()  + " | " + ticket1.getMovie().getMovieTitle() +
            " " + ticket1.getMovie().getMovieType() + " " + ticket1.getMovie().getMovieTime() + " minut");
        }
        if(ticket2 != null){
            System.out.println( ticket2.getTicketId() + " " + ticket2.getClient().getFirstName()  + " " + ticket2.getClient().getLastName()  + " | " + ticket2.getMovie().getMovieTitle() +
                    " " + ticket2.getMovie().getMovieType() + " " + ticket2.getMovie().getMovieTime() + " minut");
        }
    }
}
