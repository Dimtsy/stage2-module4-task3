package com.mjc.stage2;

import java.util.List;
import java.util.stream.Collectors;

public class ShopStock {
    private final List<Product> productList;


    public ShopStock(List<Product> productList) {
        this.productList = productList;
    }

//    public List<Product> getProductList() {
//        return productList;
//    }

//    public List<Product> ListExecuteFilteringStrategy (FilteringStrategy filteringStrategy){
//        return productList.stream()
//                .filter(filteringStrategy::filter)
//                .collect(Collectors.toList());
//    }
    public List executeFilteringStrategy(FilteringStrategy filteringStrategy){
        return productList.stream()
                .filter(filteringStrategy::filter)
                .collect(Collectors.toList());
    }

    // Write your code here!
}
