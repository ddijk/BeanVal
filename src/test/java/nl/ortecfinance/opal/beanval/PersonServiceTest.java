/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.ortecfinance.opal.beanval;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author DickD
 */
public class PersonServiceTest {

    @Test
    public void testPost() throws IOException {
        Person p = new Person(null, 3);

        MyObjectMapperProvider.createDefaultMapper().writeValue(System.out, p);
    }

}
