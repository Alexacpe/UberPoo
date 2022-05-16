package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola");
        //creando el primer objeto
        Car car = new Car();
        //ya estan disponibles los atributos de la clase
        car.license="YZC45C";
        car.driver="Alex Acevedo";
        car.passenger=4;

        //llamar al metodo para imprimir los datos de la clase
        car.printDataCar();


        //creando el segundo objeto
        Car car2 = new Car();
        //ya estan disponibles los atributos de la clase
        car2.license="MHG286";
        car2.driver="Carla Suarez";
        car2.passenger=4;

        //llamar al metodo para imprimir los datos de la clase
        car2.printDataCar();
    }
}

