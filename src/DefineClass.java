/**
 * 自定义类
 */
import java.time.*;
class Employee{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n,double s,int year,int month,int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year,month,day);
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100 * 12;
        salary += raise;

    }
}
public class DefineClass {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Victor Hacker",75000,2001,1,8);
        staff[1] = new Employee("Steve Cracker",50000,1999,2,7);
        staff[2] = new Employee("Tesla Tester",40000,1992,4,18);

        for(Employee e : staff)
            e.raiseSalary(2.6);

        for(Employee e : staff)
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay=" + e.getHireDay());
    }
}
