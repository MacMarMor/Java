public class Reservation {
    private int ticketId;
    private Movie movie;
    private Client client;

    Ticket createTicket(Client client, Movie movie ){
        if (movie.getFreeSeats() == 0) {
            System.out.println("Brak wolnych miejsc na seans");
            return null;
        } else if (client.getAge() < movie.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + movie.getAgeRequired() + " lat");
            return null;
        } else {
            int ticketId = movie.getMaxSeats() - movie.getFreeSeats() + 1;
            movie.setFreeSeats(movie.getFreeSeats() - 1);
            return new Ticket(movie, client, ticketId);
        }
    }
}