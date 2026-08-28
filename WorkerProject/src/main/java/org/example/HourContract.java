package org.example;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hour;

    public HourContract(Date date, Double valuePerHour, Integer hour){
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hour = hour;
    }

    public  Date getDate(){
        return this.date;
    }


    public void setDate(Date date){
        this.date = date;
    }

    public Double getValuePerHour(){
        return this.valuePerHour;
    }


    public void setValuePerHour(Double valuePerHour){
        this.valuePerHour = valuePerHour;
    }


    public Integer getHour(){
        return this.hour;
    }


    public void setHour(Integer hour){
        this.hour = hour;
    }


    public Double totalValue(){
        return this.hour * this.valuePerHour;
    }

    public String toString() {
        return this.date + ", " + this.valuePerHour + ", " + this.hour;
    }
}
