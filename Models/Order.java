/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interview.Siemens.Models;

import java.util.UUID;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author mkish
 */
public class Order {
    private final String StoreName = "System Design Stores";
    public UUID id;
    public Customer customer;
    public List<Item> items;
    public double totalCost;
    
    public Order(Customer customer, List<Item> items){
        this.id = UUID.randomUUID();
        this.customer = customer;
        this.items = items;
    }
    
    //add getters and setters here
    public String getStoreName(){
        return StoreName;
    }
    //Calculations
    public void calculateTotal(){
        if(this.items.size()==0){
            System.err.println("No items in this order to process");
        }
        for(Item item : items){
            this.totalCost += item.price;
        }
    }
    
    //Adding or removing Items
    public void addItems(Item item){
        this.items.add(item);
    }
}
