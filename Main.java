/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interview.Siemens;

//import Interview.Siemens.Models;

import Interview.Siemens.Models.Item;
import Interview.Siemens.Models.Order;
import Interview.Siemens.Models.Customer;
import Interview.Siemens.Service.DiscountingService;
import Interview.Siemens.Service.EDiscountingService;
//import Interview.Siemens.Service.IDiscountingService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mkish
 */

class CreateData{
    public void LoadItems(List<Item> items) {
        for(int i=1;i<=10;i++){
            items.add(new Item("Item"+i, 100.00*i));
        }
    }
}
public class Main {    
    private static List<Item> items;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //Load Items
        CreateData createData = new CreateData();
        createData.LoadItems(items);
        
        //Console Applciation works
        
        //Plan fetches the customer details from the DB and then add the items in their name and gets the bill
//        System.out.println("Hi Customer, Welcome Back");
//        System.out.println("Please Enter your Unique Id to get your details from our database");
//        int customerId = sc.nextInt();
        
        
        //Simple plan Customer enters his/her name and mobile Number and chooses the items they brought 
        //Asking them to purshase membership GOLD, Silver,.. so that the bill can be reduced
        
//        System.out.println("Hi Customer, Welcome to "+ (new Order()).getStoreName()); //fix this
        System.out.println("Hi Customer, Welcome");
        System.out.println("Enter your details here");
        System.out.println("Name : ");
        String CustomerName = sc.next();
        Customer customer = new Customer(CustomerName);
//        System.out.println("Mobile Number : ");
        
        System.out.println("Select the Id of the following items which you've purchased");
        for(int i=1;i<10;i++){
            Item item = items.get(i-1);
            System.out.println("Id - "+item.id+" | Name : "+item.name+" | Price : "+item.price);
        }
        List<Item> orderedItems = new ArrayList<>();
        System.out.println("Now you can select Ids one by one, Type STOP to quit after your selection");
        while(true){
            String input = sc.next();
            if(input.equalsIgnoreCase("stop")){
                break;
            }
            int id = Integer.getInteger(input);
            orderedItems.add(items.get(id-1));
        }
        Order order = new Order(customer,orderedItems);
        order.calculateTotal();
        System.out.println("Total Cost : "+order.totalCost);
        
//        EDiscountingService discount = new DiscountingService();
DiscountingService discount = new DiscountingService();
        System.out.println("Applying discount");
        discount.setDiscountingPercent(customer);
        order.totalCost = (discount.discountingPercent * order.totalCost) + order.totalCost;
        //Write and call discounting logic        
        System.out.println("Total Price after discount : "+order.totalCost);
        
        System.out.println("Applying Tax");
        //Complete the tax logic
        order.calculateTax();
        System.out.println("Final Price after applying Tax : "+order.totalCost);
    }
}
