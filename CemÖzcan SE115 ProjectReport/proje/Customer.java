package proje;

public class Customer {

    private String name;
    private double L;
    private double bill;
    private int password;

    public void setName( String myName) {
        name = myName;
    }

    public  String getName() {

        return name;
    }


    public void setPassword( int myPassword) {
        password = myPassword;
    }

    public int getPassword() {
        return password;
    }


    public void setL( double myL ) {
        L = myL;
    }
    public double getL () {
        return L;
    }


    public void setBill( double myBill ) {
        bill = myBill;
    }
    public double getBill() {
        return bill;
    }

    public void customer_display() {
        System.out.println("This is the customer's information.");
        System.out.println("Name: "+ getName());
        System.out.println("L: " + getL());
        System.out.println("Bill: " + getBill());
    }

    public void customer_private_display() {
        System.out.println("This is the customer's private information.");
        System.out.println("Name: "+ getName());
        System.out.println("L: " + getL());
        System.out.println("Bill: " + getBill());
        System.out.println(("Password " + getPassword()));
    }

    public static void displayHello() {
        System.out.println("Welcome to the our gas station.");
        System.out.println("Please enter your name then choose which service do you want to use.");

    }










}
