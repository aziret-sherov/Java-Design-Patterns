package com.company.Builder;

import com.company.Packing;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Бутылка";
    }
}