package Java;
//Inicialmente driver es de tipo string pero eventualmente será de tipo driver
public class Car {
    Integer id;
    String license;
    Account driver; //se cambia el tipo de dato por Acfount ya que hereda esta clase
    Integer passenger;

    //Metodo constructor con sus parametros obligatorios
    public Car(String license, Account driver){
        //con this se tiene acceso a los atibutos de la clase, para ser asignados en los parametros
        this.license=license;
        this.driver=driver;
    }

    //Metodo para imprimir los datos
    void printDataCar(){
        System.out.println("Licencia: "+ license + "Nombre del Coductor: " + driver.name);
    }
}
