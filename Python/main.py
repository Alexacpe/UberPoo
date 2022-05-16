#importar el archivo y la clase
from car import Car

if __name__ == "__main__":
    print("Saludo desde Python")
     #se crea el primer objeto
    car = Car()
    car.license= "jfh9774"
    car.driver= "un conductor"
    car.passenger= 5
    
    #imprimir el objeto
    print(vars(car))
    
    #segundo objeto
    car2=Car()
    car2.license= "skf104"
    car2.driver= "otro conductor"
    car2.passenger= 4
    
    #imprimir objeto
    print(vars(car2))
    
    