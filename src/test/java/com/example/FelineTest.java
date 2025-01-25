
package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.Animal.animalKindCat;
import static com.example.Animal.foodPredator;
import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Feline feline;

    @Test
    public void eatMeat() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(foodPredator);
        assertEquals(foodPredator, feline.eatMeat());
    }

    @Test
    public void getFamily() {
        Mockito.when(feline.getFamily()).thenReturn(animalKindCat);
        assertEquals(animalKindCat, feline.getFamily());
    }

    @Test
    public void getKittens() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, feline.getKittens());
    }
}