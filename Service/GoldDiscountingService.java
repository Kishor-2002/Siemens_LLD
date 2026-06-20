/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interview.Siemens.Service;

import Interview.Siemens.Models.Customer;

/**
 *
 * @author mkish
 */
public class GoldDiscountingService extends EDiscountingService {
    @Override
    public void setDiscountingPercent(Customer customer) {
        this.discountingPercent = 20/100;
    } 
}
