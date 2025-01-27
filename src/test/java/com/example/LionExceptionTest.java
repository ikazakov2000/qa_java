package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {

    @Mock
    Feline feline;
    String animalSex;

    @Test
    public void lionSexError() {
        assertThrows(Exception.class, () -> new Lion(feline, animalSex));
    }
}






