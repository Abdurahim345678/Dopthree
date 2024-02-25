import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Carr> cars = new ArrayList<>(10);
        cars.add(new Carr("Toyota", 15000.0, 2010));
        cars.add(new Carr("BMW", 25000.0, 2015));
        cars.add(new Carr("Ford", 18000.0, 2012));
        cars.add(new Carr("Audi", 30000.0, 2018));
        cars.add(new Carr("Mercedes", 28000.0, 2017));
        cars.add(new Carr("Honda", 12000.0, 2009));
        cars.add(new Carr("Chevrolet", 20000.0, 2014));
        cars.add(new Carr("Kia", 14000.0, 2011));
        cars.add(new Carr("Hyundai", 16000.0, 2013));
        cars.add(new Carr("Nissan", 17000.0, 2016));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите опцию:");
        System.out.println("1. Отсортировать машины по цене от меньшего к большему");
        System.out.println("2. Отсортировать машины по цене от большего к меньшему");
        System.out.println("3. Отсортировать машины по году выпуска от меньшего к большему");
        System.out.println("4. Отсортировать машины по году выпуска от большего к меньшему");
        System.out.println("5. Получить рандомную машину");

        int choice = scanner.nextInt();
        switch(choice) {
            case 1:
                Collections.sort(cars, Comparator.comparingDouble(car -> car.price));
                break;
            case 2:
                Collections.sort(cars, Comparator.comparingDouble(car -> car.price));
                Collections.reverse(cars);
                break;
            case 3:
                Collections.sort(cars, Comparator.comparingInt(car -> car.year));
                break;
            case 4:
                Collections.sort(cars, Comparator.comparingInt(car -> car.year));
                Collections.reverse(cars);
                break;
            case 5:
                int randomIndex = (int) (Math.random() * cars.size());
                System.out.println(cars.get(randomIndex));
                break;
            default:
                System.out.println("Неверная опция!");
        }

        if (choice != 5) {
            System.out.println(cars);
        }
    }
}