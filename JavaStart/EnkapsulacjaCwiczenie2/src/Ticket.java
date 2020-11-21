public class Ticket{
    private int ticketId;
    private Movie movie;
    private Client client;

    public Ticket(){

    }

    public Ticket(Movie movie, Client client, int ticketId){
        this.movie = movie;
        this.client = client;
        this.ticketId = ticketId;
    }

    public Movie getMovie() {
        return movie;
    }

    public Client getClient() {
        return client;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
}
