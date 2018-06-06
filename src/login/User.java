package login;

public class User {

    private final int id;
    private final String userName;
    private final String password;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final int age;
    private final String januarySalary;
    private final String februarySalary;
    private final String marchSalary;
    private final String aprilSalary;
    private final String maySalary;
    private final String juneSalary;
    private final String julySalary;
    private final String augustSalary;
    private final String septemberSalary;
    private final String octoberSalary;
    private final String novemberSalary;
    private final String decemberSalary;

    public User(int id, String userName, String password, String firstName, String lastName, String email, int age, String januarySalary, String februarySalary, String marchSalary, String aprilSalary, String maySalary, String juneSalary, String julySalary, String augustSalary, String septemberSalary, String octoberSalary, String novemberSalary, String decemberSalary) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.januarySalary = januarySalary;
        this.februarySalary = februarySalary;
        this.marchSalary = marchSalary;
        this.aprilSalary = aprilSalary;
        this.maySalary = maySalary;
        this.juneSalary = juneSalary;
        this.julySalary = julySalary;
        this.augustSalary = augustSalary;
        this.septemberSalary = septemberSalary;
        this.octoberSalary = octoberSalary;
        this.novemberSalary = novemberSalary;
        this.decemberSalary = decemberSalary;
    }

    public int getId() {
        return this.id;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEMail() {
        return this.email;
    }

    public int getAge() {
        return this.age;
    }

    public String getJanuarySalary() {
        return this.januarySalary;
    }

    public String getFebruarySalary() {
        return this.februarySalary;
    }

    public String getMarchSalary() {
        return this.marchSalary;
    }

    public String getAprilSalary() {
        return this.aprilSalary;
    }

    public String getMaySalary() {
        return this.maySalary;
    }

    public String getJuneSalary() {
        return this.juneSalary;
    }

    public String getJulySalary() {
        return this.julySalary;
    }

    public String getAugustSalary() {
        return this.augustSalary;
    }

    public String getSeptemberSalary() {
        return this.septemberSalary;
    }

    public String getOctoberSalary() {
        return this.octoberSalary;
    }

    public String getNovemberSalary() {
        return this.novemberSalary;
    }

    public String getDecemberSalary() {
        return this.decemberSalary;
    }
}
