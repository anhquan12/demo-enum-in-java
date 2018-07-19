/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Scanner;

/**
 *
 * @author anhquan17
 */
public class Employee {

    private static int currentId = 0;
    private int id;
    private String name;
    public Gender gender;

    public Employee() {
        this.id = currentId++;
    }

    public Employee(String name, Gender gender) {
        this.id = currentId++;
        this.name = name;
        this.gender = gender;
    }


    public int getId() {
        return currentId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {  
        this.gender = gender;
    }
    
    @Override
    public String toString() {
        return "Employee{" + "id=" + currentId++ + ", name=" + name + ", gender=" + gender + '}';
    }
    
}
