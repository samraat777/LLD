package com.sam.java.EmployeeDBProxyDesignPattern;

import com.sam.java.TicTacToe.Pair;

public class EmployeeTableProxy implements EmployeeTable{
    EmployeeTableIMPL employeeTableIMPL = new EmployeeTableIMPL();
    @Override
    public boolean create(String client, Employee emp) {
        if(client == "ADMIN")
        {
            employeeTableIMPL.create(client,emp);
            return true;
        }
        System.out.println("No proper access " + client);
        return false;
    }

    @Override
    public boolean update(String client, int id) {
        if(client == "ADMIN")
        {
            employeeTableIMPL.update(client,id);
            return true;
        }
        System.out.println("No proper access" + client);
        return false;
    }

    @Override
    public EmployeeTable get(String client, int id) {
        if(client == "ADMIN" || client == "USER")
        {
            return employeeTableIMPL.get(client,id);
        }
        System.out.println("No proper access");
        return null;
    }


}
