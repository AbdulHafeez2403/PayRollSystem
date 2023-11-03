/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeepayrollsystem;
/**
 *
 * @author hafeez
 */
public class Main {

    public static void main(String[] args) {
        //create a payroll system
        PayRollSystem payRollSystem = new PayRollSystem();
        
//        now create a fulltime employee and part time employee
        FullTimeEmployee emp1 = new FullTimeEmployee("Vikas", 001, 70000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Farhan", 002, 40, 100.0);
        PartTimeEmployee emp3=new PartTimeEmployee("Piyush", 003, 20, 100.0);
        FullTimeEmployee emp4 = new FullTimeEmployee("Huzaifa", 004, 100000.0);
        FullTimeEmployee emp5 = new FullTimeEmployee("Rahul", 005, 50000.0);
        
        //add emplyees to payroll system
        payRollSystem.addEmployee(emp1);
        payRollSystem.addEmployee(emp2);
        payRollSystem.addEmployee(emp3);
        payRollSystem.addEmployee(emp4);
        payRollSystem.addEmployee(emp5);
        
        //Display All employees Details
        System.out.println("Employee Details: ");
        payRollSystem.displayEmp();
        
        System.out.println();
        
        //Display employee with id
        System.out.println("Employee Details");
        payRollSystem.getEmp(001);
        
        System.out.println();
        
        //remove Employees
        System.out.println("Removing Employees: ");
        payRollSystem.removeEmployee(3);
        payRollSystem.displayEmp();
        
        System.out.println();
        
        //get name of employee with id
        System.out.println(payRollSystem.getName(1));
        
        System.out.println();
        
        //get salary of emp
        System.out.println(payRollSystem.getSalary(2));
        
        
    }
}
