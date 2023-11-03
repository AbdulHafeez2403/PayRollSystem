/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeepayrollsystem;

/**
 *
 * @author hafeez
 */
//create full time employee class
public class FullTimeEmployee extends Employee{
    private double monthlySalary;

    //inheritance
    public FullTimeEmployee(String name, int id,double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }  
}
