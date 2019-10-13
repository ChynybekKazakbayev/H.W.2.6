package com.company;

public  class Car implements Comparable<Car> {
    private String model;
    private int year;
    private int volume;

    public Car(String model, int year, int volume) {
        this.setModel(model);
        this.setYear(year);
        this.setVolume(volume);
    }

    @Override
    public int compareTo(Car c) {
        if (this.year < c.getYear()) {
            return 1;
        } else if (this.year > c.getYear()) {
            return -1;
        } else {
            return 0;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}