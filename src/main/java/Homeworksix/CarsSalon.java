package Homeworksix;

public class CarsSalon {
    public static void main(String[] args) {
        Cars carsone = new Cars();

        carsone.models = "BMV";
        carsone.price = 2300;
        carsone.color = "white";

        Cars carstwo = new Cars();
        carstwo.models = "Mersedes";
        carstwo.price = 3300;
        carstwo.color = "black";

        Cars carstree = new Cars();
        carstree.models = "Toyota";
        carstree.price = 4500;
        carstree.color = "red";

        Cars carsfour = new Cars();
        carsfour.models = "Porshe";
        carsfour.price = 6000;
        carsfour.color = "pink";


        System.out.println("Cars information is:" +
                carsone.models + "price" + carsone.price + ", " +
                carstwo.models + "price" + carstwo.price + ", " +
                carstree.models + "price" + carstree.price + ", " +
                carsfour.models + "price" + carsfour.price);

        Cars[] carsArray = {
                carsone("BMV", 2300, "white");
        carstwo("Mersedes", 3300, "black");
        carstree("Toyota", 4500, "red");
        carsfour("Porshe", 6000, "pink");

        System.out.println("Cars information before sorting:");
        System.out.println("\nCars information after sorting by price:");
        System.out.println("\nCars information after sorting by model:");
    }




