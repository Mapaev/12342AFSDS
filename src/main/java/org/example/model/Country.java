package org.example.model;

public class Country {
    private int id;
    private String name;
    private String date;
    private int city_age;

    public Country(int id, String name, String date, int city_age) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.city_age = city_age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCity_age() {
        return city_age;
    }

    public void setCity_age(int city_age) {
        this.city_age = city_age;
    }

    @Override
    public String toString() {
        return
                "\nid=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", city_age=" + city_age ;
    }
}
