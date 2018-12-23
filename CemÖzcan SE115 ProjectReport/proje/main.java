package proje;
import java.util.Scanner;

public class main {



    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int b =0;
        int i = 0;
        int choice;
        int password = 0;


        Customer[] newCustomer = new Customer[1000];

        String wash;
        String payment;
        String name;


        double LPG = 3.49;
        double Diesel = 4.81;
        double Unleaded_Gasoline = 6.23;
        double L = 0;
        double bill = 0;
        double price;
        while (true) {

            boolean check = false;
            boolean money = false;
            boolean wash_check = false;
            boolean priceCheck = false;
            boolean billCheck = false;

            Customer.displayHello();
            name = input.next();
            System.out.printf("Hello! %s%n", name);

            if ( name.equals("exit")) {
                break;
            }

            if ( name.equals("Control_Panel")) {

                System.out.println("Welcome to Control Panel.");
                System.out.println("If you want to see all the customers information please enter 1.");
                System.out.println("If you want to exit the system enter 2.");
                choice = input.nextInt();

                if (choice == 1 ) {
                    for ( int q =0; q < b ; q++ ) {
                        newCustomer[q].customer_private_display();
                        System.out.println("");
                    }
                    continue;
                }
                else if ( choice == 2) {
                    continue;
                }

            }


            while (check == false) {

                System.out.println("For car wash press 1." + "\n" + "For fuel press 2");
                choice = input.nextInt();

                if (choice == 1) {

                    System.out.println("Your choice is car wash!");
                    System.out.println("Do you want Inside or Outside wash or Both?");

                    while (wash_check == false) {
                        wash = input.next();

                        if (wash.equals("Inside")) {
                            System.out.println("Your choose is Inside! Be ready for Inside wash");
                            System.out.println("Whooossshh wusshhh woshhhh");
                            System.out.println("It costs: 10 TL. " + "We only accept cash please enter the price.");

                            while (billCheck == false) {
                                bill = input.nextDouble();
                                if (bill == 10) {
                                    System.out.println("Thank you " + name);
                                    billCheck = true;
                                } else {
                                    System.out.println("try again");
                                }
                                wash_check = true;
                            }


                        } else if (wash.equals("Outside")) {
                            System.out.println("Your choose is Outside! Be ready for Inside wash");
                            System.out.println("Whooossshh wusshhh woshhhh");
                            System.out.println("It costs: 20 TL. " + "We only accept cash please enter the price.");

                            while (billCheck == false) {
                                bill = input.nextDouble();
                                if (bill == 20) {
                                    System.out.println("Thank you " + name);
                                    billCheck = true;
                                } else {
                                    System.out.println("try again");
                                }

                                wash_check = true;
                            }

                        } else if (wash.equals("Both")) {
                            System.out.println("Your choose is Both! Be ready for Inside wash");
                            System.out.println("Whooossshh wusshhh woshhhh");
                            System.out.println("It costs: 25 TL. " + "We only accept cash please enter the price.");

                            while (billCheck == false) {
                                bill = input.nextDouble();
                                if (bill == 25) {
                                    System.out.println("Thank you " + name);
                                    billCheck = true;
                                } else {
                                    System.out.println("try again");
                                }

                                wash_check = true;
                            }

                        } else {
                            System.out.println("Wrong Choice " + "Choose again.");
                        }
                    }
                    check = true;
                } else if (choice == 2) {

                    System.out.println("Your choice is fuel!");
                    System.out.println("Please choose a station between station 1,2 or 3. ");
                    choice = input.nextInt();
                    System.out.printf("You choose Station %s.%nPick you fuel type. %n", choice);


                    while (check == false) {

                        System.out.println("Press " + "\n" + "1-LPG " + "\n" + "2-Diesel" + "\n" + "3-Unleaded Gasoline");
                        choice = input.nextInt();

                        if (choice != 1 && choice != 2 && choice != 3) {
                            System.out.println("Wrong choice. Choose again.");
                        } else {
                            check = true;
                        }
                    }

                    switch ((choice)) {

                        case 1:
                            System.out.println("You choose LPG. Price for LPG is " + LPG + " TL.");
                            System.out.println("How many litres do you want?  ");
                            L = input.nextDouble();
                            bill = L * LPG;
                            System.out.println("Your costs: " + bill + " Choose your payment type: Cash or Card");

                            while (money == false) {
                                payment = input.next();

                                if (payment.equals("Cash")) {
                                    System.out.println("Please enter the price.");
                                    while (priceCheck == false) {
                                        price = input.nextDouble();
                                        if (price == bill) {
                                            System.out.println("Thank you " + name);
                                            priceCheck = true;
                                        } else {
                                            System.out.println("try again");
                                        }
                                    }
                                    money = true;
                                } else if (payment.equals("Card")) {
                                    System.out.println("Please enter your card password");
                                    password = input.nextInt();
                                    System.out.println("Thank you " + name);
                                    money = true;
                                } else {
                                    System.out.println("ERROR!! Please write again.");
                                }
                            }
                            break;

                        case 2:
                            System.out.println("You choose Diesel. Price for Diesel is " + Diesel + "  TL.");
                            System.out.println("How many litres do you want? ");
                            L = input.nextDouble();
                            bill = L * Diesel;
                            System.out.println("Your costs: " + bill + " Choose your payment type: Cash or Card");

                            while (money == false) {
                                payment = input.next();

                                if (payment.equals("Cash")) {
                                    System.out.println("Please enter the price.");
                                    while (priceCheck == false) {
                                        price = input.nextDouble();
                                        if (price == bill) {
                                            System.out.println("Thank you " + name);
                                            priceCheck = true;
                                        } else {
                                            System.out.println("try again");
                                        }
                                    }
                                    money = true;
                                } else if (payment.equals("Card")) {
                                    System.out.println("Please enter your card password");
                                    password = input.nextInt();
                                    System.out.println("Thank you " + name);
                                    money = true;
                                } else {
                                    System.out.println("ERROR!! Please write again.");
                                }
                            }

                            break;

                        case 3:
                            System.out.println("You choose Unleaded Gasoline. Price for Unleaded Gasoline is " + Unleaded_Gasoline + " TL.");
                            System.out.println("How many litres do you want? ");
                            L = input.nextDouble();
                            bill = L * Unleaded_Gasoline;
                            System.out.println("Your costs: " + bill + " Choose your payment type: Cash or Card");

                            while (money == false) {
                                payment = input.next();

                                if (payment.equals("Cash")) {
                                    System.out.println("Please enter the price.");
                                    while (priceCheck == false) {
                                        price = input.nextDouble();
                                        if (price == bill) {
                                            System.out.println("Thank you " + name);
                                            priceCheck = true;
                                        } else {
                                            System.out.println("try again");
                                        }
                                    }
                                    money = true;
                                } else if (payment.equals("Card")) {
                                    System.out.println("Please enter your card password");
                                    password = input.nextInt();
                                    System.out.println("Thank you " + name);
                                    money = true;
                                } else {
                                    System.out.println("ERROR!! Please write again.");
                                }
                            }
                            break;
                    }
                } else {
                    System.out.println("Wrong choice");
                }
            }
            b++;
            for (int a = 0; a < b ; a++) {

                newCustomer[i] = new Customer();

                newCustomer[i].setPassword(password);
                newCustomer[i].setName(name);
                newCustomer[i].setBill(bill);
                newCustomer[i].setL(L);
            }
            i++;
            System.out.println(" ");
        }
    }
}





