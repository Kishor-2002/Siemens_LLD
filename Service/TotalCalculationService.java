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
public class TotalCalculationService extends ITotalCalculationService{

    @Override
    public void setDiscountingPercent(Customer customer) {
        if(customer.type == Customer.CustomerType.SILVER){
            this.discountingPercent = 10/100;
        }else if(customer.type == Customer.CustomerType.GOLD){
            this.discountingPercent = 20/100;
        }else{
            this.discountingPercent = 0.0;
        }
    }

    @Override
    public void calculateDiscountPrice() {
        
    }    
}
