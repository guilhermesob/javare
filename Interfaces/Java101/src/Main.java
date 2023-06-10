// Create Interface
interface Vehicle {
    public void vehicleMessage();
    public void vehicleColor();
}

class Car implements Vehicle {
    public void vehicleMessage(){
        System.out.println("This is the vehicle message!");
    }
    public void vehicleColor() {
        System.out.println("The vehicle color is yellow");
    }
}

class Program {
    public static void main(String[] args) {
        Car newCar = new Car();
        newCar.vehicleMessage();
        newCar.vehicleColor();
    }
}