package vn.edu.iuh.fit.jenkin.springdeployrailway.service.impl;

import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.jenkin.springdeployrailway.service.Calculator;

@Service
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
