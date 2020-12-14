package OMV;

public class main {
    public static void main(String[] args) {
        Car car = new Car(50,100);
        Station station = new Station(car, 50);

        System.out.println();

        System.out.println("The gas tank now " + car.gasAmount + " liters full.");
        System.out.println("Your cars capacity is " + car.capacity + " liters");

        if(car.gasAmount == car.capacity) {
            System.out.println("Your car is now full");
        } else {
            System.out.println("Station is empty");
        }

    }
}

