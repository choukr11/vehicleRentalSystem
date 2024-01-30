import java.util.Scanner;

public class Vehicle {
    Scanner sc = new Scanner(System.in);
    private String make;
    private String model;
    private double rentalPrice;
    public void setVehicle() {
        System.out.print("Enter the make of the Vehicle: ");
        make =sc.nextLine();
        System.out.print("Enter the model of the Vehicle: ");
        model =sc.nextLine();
        System.out.print("Enter the rental price of " +make +" - " +model +": ");
        make =sc.nextLine();
    }

    public String getMake() {
        System.out.println("Your vehicle is a " +make +" - " +model +", for it costs "+rentalPrice +" per day for rent.");
        return make;
    }

    public String getModel() {
        System.out.println(model);
        return model;
    }

    public double getRentalPrice() {
        System.out.println(rentalPrice);
        return rentalPrice;
    }

    public void listVehicle () {
        make=sc.nextLine();
        switch (make){
            case "Mercedes":
                System.out.println("You chose a Mercedes, model "+model +", for rent, it costs $" +rentalPrice +"/day.");
                break;
            case "Toyota":
                System.out.println("You chose a Toyota, model "+model +", for rent, it costs $" +rentalPrice +"/day.");
                break;
            case "Dacia":
                System.out.println("You chose a Dacia, model "+model +", for rent, it costs $" +rentalPrice +"/day.");
                break;
            default:
                System.out.println("we don't have "+make +" for rent.");




        }
    }

    class Car extends Vehicle {

    }
    class Bike extends Vehicle {

    }
}