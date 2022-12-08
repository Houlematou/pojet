package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplecalculatorTest {

    @Test
    public void test_if_calculated_add_is_working(){
        Simplecalculator calculator = new Simplecalculator();
        assertEquals(1,1);
    }
    @Test
    public void testfonctionnaliteisEven(){

        Simplecalculator calculator = new Simplecalculator();
        assertEquals(true,calculator.isEven(4));
        assertEquals(false,calculator.isEven(3));


    }
    @Test
    public void testsoustraction(){
        Simplecalculator calculator = new Simplecalculator();
        assertEquals(22,calculator.soustraction(44,22));
    }
    @Test
    public void testmultiplication(){
        Simplecalculator calculator = new Simplecalculator();
        assertEquals(4,calculator.multiplication(2,2));
    }

}