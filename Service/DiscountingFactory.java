/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interview.Siemens.Service;

import Interview.Siemens.Models.Customer;
import Interview.Siemens.Models.Customer.CustomerType;

/**
 *
 * @author mkish
 */
public class DiscountingFactory {
    public EDiscountingService getDiscountingService(Customer customer){
        if(customer.type == CustomerType.GOLD){
            return new GoldDiscountingService();
        }
            return new SilverDiscountingService();
    }
}
