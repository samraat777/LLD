package com.sam.java.EmployeeDBProxyDesignPattern;

public interface EmployeeTable {
    public boolean create(String client, Employee emp);
    public boolean update(String client, int id);
    public EmployeeTable get(String client, int id);

}
