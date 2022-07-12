package com.anginribut;

public class Provinsi {
    int id;
    String name;

    public Provinsi(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Provinsi() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
