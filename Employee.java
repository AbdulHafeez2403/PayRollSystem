/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeepayrollsystem;

/**
 *
 * @author hafeez
 */
abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    //getter and setter method (Encapsulation)
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    
    //abstarct method
    //will be overriden for part time and full time employee
    public abstract double calculateSalary();
    
    @Override
    public String toString(){
        return "Employee[name= "+name+", ID= "+id+", Salary= "+calculateSalary()+"]";
    }
}
