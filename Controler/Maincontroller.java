package Controler;

import Model.Car;
import Model.Parking;
import view.menu;

import java.awt.*;

public class Maincontroller {
    /**
     *
     */
    static Parking parking = new Parking(" IES tanques abiones y submarionos ",4);

    public static void startapp(){
        int option=-1;
        do {
            option = menu.mainMenu();
            ControladorMenuPrincipal(option);
        }while (option!=5);
    }
    public static void ControladorMenuPrincipal(int option){
        switch (option){
            case 1:
                System.out.println("******************************");
                System.out.println(parking);
                System.out.println("******************************");
                break;
            case 2:
                int nCars = parking.howManyCars();
                if (nCars==0){
                    System.out.println("no hay coches");
                } else if (nCars == 1) {
                    System.out.println("hay 1 coche");
                    } else{
                    System.out.println("hay "+ nCars + "coches ");
                }
                break;
            case 3:
                if (parking.isFull()){
                    System.out.println(" lo siento esta lleno ");
                }else{
                    String Licence = menu.parkingMenu_step1();
                    String model = menu.parkingMenu_step2();
                    int age = menu.parkingMenu_step3();
                    Car cartobeinserted = new Car(Licence,model,age);
                    int parked = parking.parkCar(cartobeinserted);
                    if (parked==-1){
                        System.out.println(" error al apartcar el coche ");
                    }else {
                        System.out.println(" hemosaparcadosu coche en la plaza "+ parked);
                    }
                }
                break;
            case 4:
                String Licence = menu.unparkingMenu();
                Car cartobeunparked = parking.unParkCar(Licence);
                if (cartobeunparked==null){
                    System.out.println(" error al sacar el coche ");
                }else{
                    System.out.println(" el coche que sacamos es " + cartobeunparked);
                }
                break;
            case 5:
                break;
            default:
                System.out.println();
        }
    }
}
