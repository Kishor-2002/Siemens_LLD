/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interview.Siemens.Service;

import Interview.Siemens.Models.Customer;

/**
 *
 * @author mkish
 */
public abstract class EDiscountingService {
    public double discountingPercent;
    public abstract void setDiscountingPercent(Customer customer);
    public void calculateDiscountPrice(){
        
    }
}
