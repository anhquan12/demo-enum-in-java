/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Employee;
import entity.Gender;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anhquan17
 */
public class EmployeeManager {

    
    public static Scanner s = new Scanner(System.in);
    ArrayList<Employee> list = new ArrayList<>();
    public void addEmployee() {
        System.out.println("Enter element :");
        int n = s.nextInt();
        s.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name :");
            String name = s.nextLine();
            System.out.println("Enter gender :");
            int gender = s.nextInt();
            s.nextLine();
            Employee employee = new Employee(name, Gender.getByGenderId(gender));
            list.add(employee);
        }
    }

    public ArrayList<Employee> getList() {
        for (int i = 0; i < list.size(); i++) {
            Employee temp = list.get(i);
            System.out.println(temp.toString());
        }
        return list;
    }
    
//    public void search() {
//        System.out.println("Enter gender need search : ");
//        int code = s.nextInt();
//        for (int i = 0; i < list.size(); i++) {
//            Employee temp = list.get(i);
//                if(temp.gender.equals(code)){
//                    System.out.println(toString());
//            }
//        }
//    }
    
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        while (true) {            
            System.out.println("1.add ");
            System.out.println("2.display ");
            System.out.println("3. search ");
            int choice = s.nextInt();
            s.nextLine();
            switch(choice) {
                case 1 : manager.addEmployee();
                break;
                case 2 : manager.getList();
                break;
//                case 3 : manager.search();
                break;
            }
        }
    }

}
