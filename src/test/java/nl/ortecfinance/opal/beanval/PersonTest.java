/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.ortecfinance.opal.beanval;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author DickD
 */
public class PersonTest {

    public PersonTest() {
    }

    @Test
    public void testGetNaam() {
        Person p = new Person("dick", 41);

        Assert.assertEquals("dick", p.getNaam());
        Assert.assertEquals(Integer.valueOf("41"), p.getAge());
    }

    @Test
    public void testSetNaam() {
    }

    @Test
    public void testGetAge() {
    }

    @Test
    public void testSetAge() {
    }

}
