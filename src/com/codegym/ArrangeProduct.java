package com.codegym;

import java.util.Comparator;

public class ArrangeProduct implements Comparator<Product> {

    @Override
    public int compare(Product price1, Product price2) {
        if (price1.getPrice()> price2.getPrice()){
            return 1;
        }else if (price1.getPrice()== price2.getPrice()){
            return 0;
        }else {
            return -1;
        }
    }

}
