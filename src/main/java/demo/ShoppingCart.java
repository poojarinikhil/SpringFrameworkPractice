package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String value){

        System.out.println("Checkout Method from shoppingCart Called");
    }
}
