package service;

import superclass.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppCompany {

    public static void reportEmployeeData(List<Employee> employees) {
        System.out.println(employees);

    }

    public List getFromEmployeesLessThanThirty(ArrayList<Employee> employees) {
        List <Employee> employeeloyeesLessThanThirty = new ArrayList<>();
        for (int i = 0; i< employees.size(); i++){
            if (employees.get(i).isLessTanThirty()){
                employeeloyeesLessThanThirty.add(employees.get(i));
            }
        }

        return employeeloyeesLessThanThirty;

    }

    public int countEmployees(ArrayList<Employee> employees) {
        return employees.size();

    }
}




