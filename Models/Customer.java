/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interview.Siemens.Models;

import java.util.UUID;

/**
 *
 * @author mkish
 */
public class Customer {
    public UUID id;
    public String name;
    public CustomerType type;
    
    public enum CustomerType{
        GOLD, SILVER, DEFAULT
    }
    
    public Customer(String name){
        this.id = UUID.randomUUID();
        this.name = name;
        this.type = CustomerType.DEFAULT;
    }
    
    //Write getters and setters here
}

