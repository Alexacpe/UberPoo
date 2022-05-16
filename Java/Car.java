package Java;
//Inicialmente driver es de tipo string pero eventualmente será de tipo driver
public class Car {
    Integer id;
    String license;
    String driver;
    Integer passenger;

    //Metodo para imprimir los datos
    void printDataCar(){
        System.out.println("Licencia: "+ license + "Coductor: " + driver);
    }
}
