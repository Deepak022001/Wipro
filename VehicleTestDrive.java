class Vehicle {
    public void startEngine() {
        System.out.println("Starting engine of vehicle.");
    }
}


class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting engine of the car with a key.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting engine of the motorcycle with a button.");
    }
}


public class VehicleTestDrive {

    public static void vehicleTestDrive(Vehicle vehicle) {
        vehicle.startEngine();  
    }

    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();
        

        vehicleTestDrive(myCar);         
        vehicleTestDrive(myMotorcycle);  
    }
}

