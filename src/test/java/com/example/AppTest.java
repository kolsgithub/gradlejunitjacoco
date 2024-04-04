// src/test/java/com/example/AppTest.java
package com.example;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {
    
    @Test
    public void testIsTrue() {
        App app = new App();
        assertTrue(app.isTrue());
    }
}

