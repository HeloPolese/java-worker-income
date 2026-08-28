package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a departament's name: ");
        String departamentName = sc.nextLine();
        Departament dp = new Departament(departamentName);

        System.out.println("Enter worker data: ");
        System.out.println("Name: ");
        String workerName = sc.nextLine();

        System.out.println("Level: ");
        WorkerLevel workerLevel = WorkerLevel.valueOf(sc.nextLine());


        System.out.println("Base salary: ");
        Double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName,workerLevel,baseSalary,dp);


        System.out.println("How many contracts to this worker: ");
        int numberOfContracts = sc.nextInt();

        for (int i = 0; i < numberOfContracts; i++){
            System.out.println("Enter contract #"+ i+1 + " data: ");
            System.out.println("Date DD/MM/YYYY: ");

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String dateContract = sc.next();
            Date dateContractFormated = formatter.parse(dateContract);
            //System.out.println(SF.format(dateContractFormated));

            System.out.println("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            System.out.println("Duration (Hours): ");
            Integer duration = sc.nextInt();

            HourContract hourContract = new HourContract(dateContractFormated, valuePerHour,duration);

            worker.addContract(hourContract);
        }

        System.out.println("Enter month and year to calculate Income (MM/YYYY): ");
        SimpleDateFormat fmt2 = new SimpleDateFormat("MM/yyyy");
        String incomeDate = sc.next();

        Date incomeDateFormater = fmt2.parse(incomeDate);

        System.out.println(worker.toString());

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(incomeDateFormater);
        int c2Month = 1 + calendar.get(Calendar.MONTH);
        int c2Year = calendar.get(Calendar.YEAR);

        System.out.println("Income for " + fmt2.format(incomeDateFormater) + ": " + worker.Income(c2Year,c2Month));

        sc.close();
    }
}
