package com.company;




import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {


    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>(5);

        Car Ferrari = new Car("Ferrari", 2003, 4);
        Car Mercedes = new Car("Mercedes", 2002, 5);
        Car Audi = new Car("Audi", 2004, 6);
        Car BMW = new Car("BMW", 2005, 7);
        Car Lada = new Car("Lada", 2001, 8);
        Car Volvo = new Car("Volvo", 2000, 9);
        Car Maserati = new Car("Maserati", 2006, 10);
        Car Pagani = new Car("Pagani", 2007, 11);
        Car Toyota = new Car("Toyota", 2008, 12);
        Car Honda = new Car("Honda", 2009, 13);


        cars.add(Ferrari);
        cars.add(Mercedes);
        cars.add(Audi);
        cars.add(BMW);
        cars.add(Lada);
        cars.ensureCapacity(10);
        cars.add(Volvo);
        cars.add(Maserati);
        cars.add(Pagani);
        cars.add(Toyota);
        cars.add(Honda);
        System.out.println("До сортировки");
        System.out.println(cars);
        Collections.sort(cars);
        System.out.println("После сортировки");
        Collections.sort(cars);
        System.out.println(cars);

        try {
            printListForEachloop(cars);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private static void printListForEachloop(List<Car> list) {
        for (Car i: list) {
            System.out.println("До сортировки");
            System.out.println("Model = " + i.getModel() + " Year = " + i.getYear()
                    + " Volume = " + i.getVolume());
            System.out.println("После сортировки");

        }
    }


}
