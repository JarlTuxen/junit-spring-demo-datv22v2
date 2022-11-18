package com.example.junitspringdemodatv22v2;

import com.example.junitspringdemodatv22v2.service.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTest {

    @Autowired
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        //arrange
        //calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addPositive() {

        //act
        int result = calculator.addPositive(1, 2);

        //assert
        assertEquals(3, result, "Add 1 and 2");

    }

    @Test
    void addPositiveFail() {

        //act
        int result = calculator.addPositive(2, 2);

        //assert
        assertNotEquals(3, result, "Add 2 and 2 doesn't give 3");

    }

    @Test
    void addNegativeFail(){
        //act & assert
        assertThrows(IllegalArgumentException.class, () -> calculator.addPositive(-1, -1),
                "Exception on negative numbers");
    }

    @Test
    void addPositiveBig() {

        //act
        int result = calculator.addPositive(2000, 200);

        //assert
        assertEquals(2200, result, "Add 2000 and 200");
        assertEquals(2200.0001, result, 0.01, "fejl på decimalerne?");

    }

}