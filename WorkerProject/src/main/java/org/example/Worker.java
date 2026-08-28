package org.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Departament departament;
    private List<HourContract> hourContracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary,Departament departament){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName(){
        return this.name;
    }


    public void setName(String name){
        this.name = name;
    }

    public WorkerLevel getLevel(){
        return this.level;
    }


    public void setLevel(WorkerLevel level){
        this.level = level;
    }

    public double getBaseSalary(){
        return this.baseSalary;
    }


    public void setBaseSalary(Double baseSalary){
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament(){
        return this.departament;
    }

    public void setDepartament(Departament departament){
        this.departament = departament;
    }

    public List<HourContract> getHourContracts(){
        return  this.hourContracts;
    }

    public void setHourContracts(List<HourContract> hourContracts){
        this.hourContracts = hourContracts;
    }


    public void addContract(HourContract contract){
        this.hourContracts.add(contract);
    }

    public void removeContract(HourContract contract){
        this.hourContracts.remove(contract);
    }


    public Double Income(Integer year, Integer month){
        Double totalMoneyContract = 0.0;

        Calendar cal = Calendar.getInstance();

        for (HourContract hourContract : this.hourContracts){

            cal.setTime(hourContract.getDate());
            int yearD = cal.get(Calendar.YEAR);
            int monthD = 1+ cal.get(Calendar.MONTH);

            if (yearD == year && monthD == month){
                totalMoneyContract += hourContract.totalValue();
            }

        }

        return totalMoneyContract + this.baseSalary;
    }


    public String toString(){
        return "Name: "+ this.name + "\nDepartament: " + this.departament.getName();
    }

}
