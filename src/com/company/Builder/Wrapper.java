package com.company.Builder;

import com.company.Packing;

public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Обертка";
    }
}