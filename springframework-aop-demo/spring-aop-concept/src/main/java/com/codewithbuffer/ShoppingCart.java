package com.codewithbuffer;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    // below 3 are aspects and we need to separated each of them
    // Logging
    // authentification and authorization
    // Sanitize the data
    public void checkout()
    {
        System.out.println("Checkout method of ShoppingCart is called");
    }
}
