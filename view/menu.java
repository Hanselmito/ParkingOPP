package view;

public class menu {
    public static int mainMenu(){
        System.out.println("Binbenido al Parking ");
        System.out.println("1- Listar coches ");
        System.out.println("2- cuantos coches hay ");
        System.out.println("3- aparcar coche ");
        System.out.println("4- sacar coche ");
        System.out.println("5- salir");
        return UI.readInt("elije una opcion");
    }
    public static String parkingMenu_step1(){
        return UI.readString(" inserte la matricula ");
    }
    public static String parkingMenu_step2(){
        return UI.readString(" inserte el modelo ");
    }
    public static int parkingMenu_step3(){
        return UI.readInt(" inserte la antiguedad ");
    }
    public static String unparkingMenu(){
        return UI.readString(" inserte la matricula ");
    }
}
