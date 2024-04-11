package com.sam.java.EmployeeDBProxyDesignPattern;

public class EmployeeTableIMPL implements EmployeeTable{
    @Override
    public boolean create(String client, Employee emp) {
        System.out.println("new Employee data created " + emp.name +" -- "+ emp.id);
        return true;
    }

    @Override
    public boolean update(String client, int id) {
        System.out.println("Employee "+id + " data updated");
        return true;
    }

    @Override
    public EmployeeTable get(String client, int id) {
        System.out.println("Got the employee"+ id + "Data");
        return null;
    }


}
