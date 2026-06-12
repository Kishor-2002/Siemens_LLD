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
public class Item {
    public UUID id;
    public String name;
    public double price;
    
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    ///getters and setters here when required
}
