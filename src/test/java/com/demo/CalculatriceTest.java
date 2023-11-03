package com.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatriceTest
{
    @Test
    public void testAdditioner(){

        assertEquals(5, Calculatrice.additionner(2, 3));
    }

    @Test
    public void testSoustraire(){

        assertEquals(2, Calculatrice.soustraire(5, 3));
    }

    @Test
    public void testMultiplier(){

        assertEquals(15, Calculatrice.multiplier(5, 3));
    }
}
