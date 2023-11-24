package Model;

import java.util.Arrays;

public class Parking {
    private String name;
    Car[] cars;

    public Parking(String name, int tam){
        this.name = name;
        if (tam<=0){
            tam=2;
        }
        this.cars = new Car[tam];
    }
    public Parking(){
        this("generico",2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Parking{" +
                "name='" + name + '\'' +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
    public boolean isfull(){
        return false;
    }
    public int howmanycars(){
        return 0;
    }
    public int searchCar(String licence){
        return 0;
    }
    public int ParkCar(Car car){
        return 0;
    }
    public Car unParkCar(String licence){
        return null;
    }
}