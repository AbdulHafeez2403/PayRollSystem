/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeepayrollsystem;

import java.util.ArrayList;

/**
 *
 * @author hafeez
 */
class PayRollSystem{
   private ArrayList<Employee> employeeList;

    public PayRollSystem() {
        employeeList = new ArrayList<>();
    }
    
    //fuction to add employee in ArrayList
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    
    //we will remove employee by using id
    public void removeEmployee(int id){
        Employee empToRemove = null; 
        //iterate over emplist to check whether the given id exist or not
        //if id exist add it's corresponding employee to empToRemove
        for (Employee employee : employeeList) {
            if(employee.getId() == id){
                empToRemove = employee;
                break;
            }
        }
        //empToRemove != null means there is an employee to remove
        //just remove the stored emplyee from list by remove method
        if(empToRemove != null){
            employeeList.remove(empToRemove);
            System.out.println("Employee Removed with ID= "+id);
        }
    }
    
    //display EMployees in company
    public void displayEmp(){
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
    
    //display details of employee with id
    public void getEmp(int id){
        for (Employee employee : employeeList) {
            if(employee.getId() == id){
                System.out.println(employee);
                break;
            }
            System.out.println("No Emplyee exist with id= "+id);
        }
    }
    
    //get name of emp with id
    public String getName(int id){
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                System.out.print("Name of Employee with id "+id+" is ");
                return employee.getName();
            }
        }
        return null;
    }
    
    //get salary of emp
    public double getSalary(int id){
        for (Employee employee : employeeList) {
            if(employee.getId() == id){
                System.out.print("Salary of Employee with id "+id+" is ");
                return employee.calculateSalary();
            }
        }
        return 0;
    }
}