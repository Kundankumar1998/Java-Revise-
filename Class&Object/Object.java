/*An entity that has state and behavior is known as an object e.g., chair, bike, marker etc.
It can be physical or logical */


class Car{
    String model;
    String color;
    int year; // Constructor to initialize the object
    Car(String model, String color, int year){
        this.model=model;
        this.color=color;
        this.year=year;
    }
    void Desplay()
    {
        System.out.println("Model="+model);
        System.out.println("color="+color);
        System.out.println("year="+year);
    }
}
public class Object{
    public static void main(String ar[]){
        Car mycar=new Car("tata nano","Blue",2016);
        mycar.Desplay();
    }
}