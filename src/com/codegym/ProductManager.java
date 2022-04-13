package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class ProductManager extends Product {
public  List<Product> productList = new ArrayList<>();

    public void addProduct(int id,String name, double price){
            productList.add(new Product(id,name,price));
    }
    public boolean checkId(int id){
        boolean check = true;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId()==id){
                check = true;
            }
               else check = false;
        }
        return check;
    }
 public void deleteProduct(int id){
     for (int i = 0; i < productList.size(); i++) {
         if (id==productList.get(i).getId()){
             productList.remove(i);
         }
     }
 }
 public void editProduct(int id,String name, double price ){
     for (int i = 0; i < productList.size(); i++) {
         if (id==productList.get(i).getId()){
             productList.get(i).setNameOfProduct(name);
             productList.get(i).setPrice(price);
         }
     }
 }
 public void findByName(String name){
     for (int i = 0; i < productList.size(); i++) {
         if (name==productList.get(i).getNameOfProduct()){
             System.out.println("Product is: "+productList.get(i));
         }
     }
 }
 public void sortAZ(){
     Collections.sort(productList, new Comparator<Product>() {
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
     });
 }
    public void sortZA(){
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product price1, Product price2) {
                if (price1.getPrice()< price2.getPrice()){
                    return 1;
                }else if (price1.getPrice()== price2.getPrice()){
                    return 0;
                }else {
                    return -1;
                }
            }
        });
    }
}
