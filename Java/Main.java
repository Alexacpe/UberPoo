package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola");
        //creando el primer objeto pasandole los atributos del contructor
        Car car = new Car("YZC45C", new Account("Alex Acevedo", "1234567"));
        //ya estan disponibles los atributos de la clase
        car.passenger=4;

        //llamar al metodo para imprimir los datos de la clase
        car.printDataCar();


        //creando el segundo objeto
        Car car2 = new Car("MHG286", new Account("Carla Suarez", "9876544"));
        //ya estan disponibles los atributos de la clase
        car2.license="MHG286";
        car2.passenger=4;

        //llamar al metodo para imprimir los datos de la clase
        car2.printDataCar();
    }
}

