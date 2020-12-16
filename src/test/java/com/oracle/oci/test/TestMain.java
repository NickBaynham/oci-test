package com.oracle.oci.test;

import org.junit.Test;

public class TestMain {
    @Test
    public void testMain() {
        Main main = new Main();
        String[] args = null;
        Main.main(args);
        main.greet("Hello!");
    }
}
