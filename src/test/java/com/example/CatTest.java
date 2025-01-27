package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.Animal.foodPredator;
import static com.example.Cat.catSound;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void catGetSoundTest(){
        Cat cat = new Cat(feline);
        assertEquals(catSound, cat.getSound());
    }

    @Test
    public void catEatMeatTest() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(foodPredator);
        Cat cat = new Cat(feline);
        assertEquals(foodPredator, cat.getFood());
    }
}