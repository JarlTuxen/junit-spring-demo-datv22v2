package com.example.junitspringdemodatv22v2.service;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
    public int addPositive(int a, int b){
        //exception hvis negative tal
        if (a<0 || b <0) throw new IllegalArgumentException("Negative numbers not allowed");

        return a + b;
    }
}
