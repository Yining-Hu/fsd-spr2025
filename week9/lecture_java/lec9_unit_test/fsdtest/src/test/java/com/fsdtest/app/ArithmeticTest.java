package com.fsdtest.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArithmeticTest {

    private int x;
    private int y;
    static final Logger log = Logger.getLogger(ArithmeticTest.class.getName());

    private Arithmetic arithmetic;

    public ArithmeticTest() {}

    // @BeforeEach is the equivalence of @Before in JUnit5
    @BeforeEach
    public void setUp() {
        log.info("Initializing test parameters...");
        x = 4;
        y = 2;
        arithmetic = new Arithmetic(x,y);
    }

    @AfterEach
    public void tearDown() {
        log.info("Cleaning up the test parameters...");
        arithmetic = null;
    }

    @Test
    public void testAdd() {
        log.info("> Testing add ...");
        int expResult = 6;
        int result = arithmetic.add(x, y);
        assertEquals(expResult, result, "Unexpected result for add operation.");
    }

    @Test
    public void testSub() {
        log.info("> Testing sub ...");
        int expResult = 2;
        int result = arithmetic.sub(x, y);
        assertEquals(expResult, result);
    }

    @Test
    public void testMul() {
        log.info("> Testing mul ...");
        int expResult = 8;
        int result = arithmetic.mul(x, y);
        assertEquals(expResult, result);
    }

    @Test
    public void testDiv() {
        log.info("> Testing div ...");
        int expResult = 2;
        int result = arithmetic.div(x, y);
        assertEquals(expResult, result);
    }
}
