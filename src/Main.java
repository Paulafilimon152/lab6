import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("cati angajati sunt:");
        int n=myObj.nextInt();
        ArrayList<Employee>Employees=new ArrayList<>();
        for(int i=0;i<n;i++) {
            System.out.println("Numele angajatului:");
            String name = myObj.nextLine();
            System.out.println("Email");
            String email = myObj.nextLine();
            System.out.println("Hour Rate");
            double hourRate = myObj.nextDouble();
            System.out.println("Capacity");
            int capacity = myObj.nextInt();
            System.out.println("Free Days");
            int freeDays = myObj.nextInt();
            Employee employee=new(name, email, hourRate, capacity, freeDays);
                 Employees.add(employee);
        }
        System.out.println("salar pe luna");
        for(int Employee Employee:Employee){
            System.out.println("nume:" +Employee.getName());
            System.out.println("salar pe luna" +Employee.getMonthlyIncome());
            System.out.println();
        }
    }
}
