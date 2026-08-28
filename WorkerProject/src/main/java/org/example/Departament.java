package org.example;

import java.sql.Date;

public class Departament {
    private String name;

    public Departament(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String toString(){
        return this.name;
    }
}
