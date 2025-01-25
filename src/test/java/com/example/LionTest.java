package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.Animal.foodPredator;
import static com.example.Lion.animalSexFemale;
import static com.example.Lion.animalSexMale;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittens() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion(feline, animalSexMale);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void maleDoesHaveMane() throws Exception {
        Lion lion = new Lion(feline, animalSexMale);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void femaleDoesHaveMane() throws Exception {
        Lion lion = new Lion(feline,animalSexFemale);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void getFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(foodPredator);
        Lion lion = new Lion(feline, animalSexMale);
        assertEquals(foodPredator, lion.getFood());
    }
}


