package superclass;

import service.AppCompany;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee juan = new Employee("Juan",126534,31);
        Employee ximena = new Employee("Ximena",35689,23);
        Employee ana = new Employee("Ana", 24587,35);
        Employee teresa = new Employee("Teresa",54689,28);
        Employee carmen = new Employee("Carmen",14789,38);
        Employee carlos = new Employee("Carlos",789456,32);


        employees.add(juan);
        employees.add(ximena);
        employees.add(ana);
        employees.add(teresa);
        employees.add(carmen);
        employees.add(carlos);

        AppCompany.reportEmployeeData(employees);
        AppCompany appCompany = new AppCompany();
        List < Employee> employeesLessThanThirty=appCompany.getFromEmployeesLessThanThirty(employees);
        System.out.println("Empleados menores de 30 años:" + AppCompany.reportEmployeeData(employeesLessThanThirty);
        }

}
