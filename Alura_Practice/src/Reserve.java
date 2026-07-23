public class Reserve {
    public void book() {
        System.out.println("Reservation made");
    }

    public void book(String date) {
        System.out.println("Reservation made for the day " + date);
    }

    public void book(String date, int people) {
        System.out.println("Reservation made for the day " + date + " for " + people + " persons");
    }

}
