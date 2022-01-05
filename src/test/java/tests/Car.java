package tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Car {
    public String color;
    public static final String BLUE="blue";
    public static final String YELLOW="yellow";
    public static final String GREEN="green";

    public Car(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "color='" + color + '\'';
    }
    public static void main(String[] args) {
        Car blueCar = new Car("blue");
        Car greenCar1 = new Car("green");
        Car yellowCar = new Car("yellow");
        Car greenCar = new Car("green");
        List<Car> carList = new ArrayList<Car>();
        carList.add(blueCar);
        carList.add(greenCar1);
        carList.add(greenCar);
        carList.add(yellowCar);

        Map<String,List<Object>> map = new HashMap<>();
        List<Object> listGreen = new ArrayList<>();
        List<Object> listYellow = new ArrayList<>();
        List<Object> listBlue = new ArrayList<>();
        for(Car c:carList){
            if(c.color.equals(YELLOW))
                listYellow.add(c);
            else if(c.color.equals(BLUE))
                listBlue.add(c);
            else
                listGreen.add(c);
        }
        map.put(BLUE,listBlue);
        map.put(GREEN,listGreen);
        map.put(YELLOW,listYellow);
        System.out.println(map);
    }
}
