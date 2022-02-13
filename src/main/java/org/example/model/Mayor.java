package org.example.model;

public class Mayor {
    private int id;
    private String name;
    private String date_of_reign;
    private int age;

    public Mayor(int id, String name, String date_of_reign, int age) {
        this.id = id;
        this.name = name;
        this.date_of_reign = date_of_reign;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Presidents{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date_of_reign='" + date_of_reign + '\'' +
                ", age=" + age +
                '}';
    }
}
