package com.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatriceTest
{
    @Test
    public void testAdditioner(){

        assertEquals(5, Calculatrice.additionner(2, 3));
    }
}
