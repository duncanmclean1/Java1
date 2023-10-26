package com.xpanxion.assignments.student;
import java.util.ArrayList;

public class Invoice extends Base{
    private ArrayList<Product> list;

    public Invoice(){}

    public Invoice(int l){
        list = new ArrayList<Product>(l);
    }

    public void addProduct(Product newProduct){
        this.list.add(newProduct);
    }

    public double getTotalCost(){
        double ans = 0;

        for(int i = 0; i < this.list.size(); i++){
            ans += this.list.get(i).getPrice();
        }
        return ans;
    }

}//Invoice