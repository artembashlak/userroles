package com.artembashlak;

public abstract class User {

    private int id;
    private String name;
    private String address;

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddresses() {
        return address;
    }

    public void setAddresses(String addresses) {
        this.address = addresses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}