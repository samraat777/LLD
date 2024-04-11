package com.sam.java.EmployeeDBProxyDesignPattern;

public class Client {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Samraat",1);
        Employee employee2 = new Employee("Sonu",2);

        EmployeeTable employeeTable = new EmployeeTableProxy();

        employeeTable.create("ADMIN",employee1);
        employeeTable.create("USER",employee2);

        employeeTable.update("ADMIN",1);

    }
}
