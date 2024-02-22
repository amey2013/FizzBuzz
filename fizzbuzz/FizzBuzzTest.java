package org.amaap.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest {
    FizzBuzz instance = new FizzBuzz();

    @Test
    public void shouldHandleInavlidInput(){
        assertThrows(NumberFormatException.class, () -> instance.fizzbuzz(Integer.parseInt("invalid")));

    }


    @Test
    public void ifLimitisLessThanOrEqualToZero(){

        List<String> result = instance.fizzbuzz(0);
        assertEquals(0,result.size());
    }
    @Test
    public void ifLimitIs3Return12Fizz(){
        String [] list = {"1","2","Fizz"};
        List<String> expectedResult = new ArrayList<>(Arrays.asList(list));
        List<String> result = instance.fizzbuzz(3);

        assertEquals(expectedResult,result);
    }
    @Test
    public void ifLimitIs5Return12Fizz4Buzz(){
        String [] list = {"1","2","Fizz","4","Buzz"};
        List<String> expectedResult = new ArrayList<>(Arrays.asList(list));
        List<String> result = instance.fizzbuzz(5);

        assertEquals(expectedResult,result);

    }
    @Test
    public void shouldHandleCaseOfLimitMultipleOf3And5(){
        String [] list = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};
        List<String> expectedResult = new ArrayList<>(Arrays.asList(list));
        List<String> result = instance.fizzbuzz(15);

        assertEquals(expectedResult,result);

    }
    @Test
    public void shouldHandleForLimitasString(){
        String [] list = {"1","2","Fizz","4","Buzz"};
        List<String> expectedResult = new ArrayList<>(Arrays.asList(list));

        List<String> input = instance.fizzbuzz(Integer.parseInt("5"));
        assertEquals(expectedResult,input);
    }




}
