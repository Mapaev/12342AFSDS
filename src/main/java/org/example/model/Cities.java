package org.example.model;

public class Cities {
     private int id;
     private String name;
     private String population;

    public Cities(int id, String name, String population) {
        this.id = id;
        this.name = name;
        this.population = population;
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

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return
                "\nid=" + id +
                ", name='" + name + '\'' +
                ", population='" + population ;
    }
}
