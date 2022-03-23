package com.vedenemo.cli;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class VedenemoCliTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public VedenemoCliTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( VedenemoCliTest.class );
    }

    private String getTestMethodName(){
        return  super.getName();
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        System.out.println("Running and asserting example test... (" + getTestMethodName() + ")");
        assertTrue( true );
    }
}
