package login;

public class Expending 
{
    private int id;
    private String date;
    private double eating;
    private double mobile;
    private double flat;
    private double fuel;
    private double tickets;
    private double payment;
    private double other;
    private double total;
    
    public Expending(int id, String date, double eating, double mobile, double flat, double fuel, double tickets, double payment, double other, double total)
    {
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
    
    public int getId()
    {
        return this.id;
    }
    
    public String getDate()
    {
        return this.date;
    }
    
    public double getEating()
    {
        return this.eating;
    }
    
    public double getMobile()
    {
        return this.mobile;
    }
    
    public double getFlat()
    {
        return this.flat;
    }  
    
    public double getFuel()
    {
        return this.fuel;
    }
    
    public double getTickets()
    {
        return this.tickets;
    }
    
    public double getPayment()
    {
        return this.payment;
    }
    
    public double getOther()
    {
        return this.other;
    }
    
    public double getTotal()
    {
        return this.total;
    }
}
