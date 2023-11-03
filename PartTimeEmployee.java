/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeepayrollsystem;

/**
 *
 * @author hafeez
 */
//create PartTime employee
class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;
    
    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate){
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public double calculateSalary(){
        return hoursWorked*hourlyRate;
    }
}
