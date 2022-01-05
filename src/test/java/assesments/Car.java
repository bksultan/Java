package assesments;

import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Car {
    String color;

    public Car(String color){
        this.color = color;
    }

    /**
     * blueCar => blue
     * blue => blue_car
     * greenCar1 => green
     * yellowCar => yellow
     * greenCar => green
     * @param args
     */

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

        Map<String, List<Car>> carMap = new HashMap<>();

        for (int i = 0; i < carList.size(); i++) {
            carMap.put(carList.get(i).color, new ArrayList<Car>());
        }

        System.out.println(carMap);
        System.out.println(carList.get(0));

        List<Integer> list = IntStream.rangeClosed(1, 15)
                .mapToObj(Integer::new).collect(Collectors.toList());

        Integer sum = list.stream()
                .reduce(0, Integer::sum);

        String string = "Item1 10 Item2 25 Item3 30 Item4 45";

        Integer sum1 = Arrays.stream(string.split(" "))
                .filter((s) -> s.matches("\\d+"))
                .mapToInt(Integer::valueOf)
                .sum();

        System.out.println(sum);
        System.out.println(sum1);
    }
}
