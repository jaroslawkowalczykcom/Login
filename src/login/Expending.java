package login;

public class Expending {

    private final int id;
    private final String date;
    private final double eating;
    private final double mobile;
    private final double flat;
    private final double fuel;
    private final double tickets;
    private final double payment;
    private final double other;
    private final double total;

    public Expending(int id, String date, double eating, double mobile, double flat, double fuel, double tickets, double payment, double other, double total) {
        this.id = id;
        this.date = date;
        this.eating = eating;
        this.mobile = mobile;
        this.flat = flat;
        this.fuel = fuel;
        this.tickets = tickets;
        this.payment = payment;
        this.other = other;
        this.total = eating + mobile + flat + fuel + tickets + payment + other;
    }

    public int getId() {
        return this.id;
    }

    public String getDate() {
        return this.date;
    }

    public double getEating() {
        return this.eating;
    }

    public double getMobile() {
        return this.mobile;
    }

    public double getFlat() {
        return this.flat;
    }

    public double getFuel() {
        return this.fuel;
    }

    public double getTickets() {
        return this.tickets;
    }

    public double getPayment() {
        return this.payment;
    }

    public double getOther() {
        return this.other;
    }

    public double getTotal() {
        return this.total;
    }
}
