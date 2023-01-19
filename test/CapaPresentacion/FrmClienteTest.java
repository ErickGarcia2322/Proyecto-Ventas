/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class FrmClienteTest {
    
    public FrmClienteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of mostrar method, of class FrmCliente.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        String buscar = "";
        FrmCliente instance = new FrmCliente();
        instance.mostrar(buscar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inhabilitar method, of class FrmCliente.
     */
    @Test
    public void testInhabilitar() {
        System.out.println("inhabilitar");
        FrmCliente instance = new FrmCliente();
        instance.inhabilitar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of habilitar method, of class FrmCliente.
     */
    @Test
    public void testHabilitar() {
        System.out.println("habilitar");
        FrmCliente instance = new FrmCliente();
        instance.habilitar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Limpiar method, of class FrmCliente.
     */
    @Test
    public void testLimpiar() {
        System.out.println("Limpiar");
        FrmCliente instance = new FrmCliente();
        instance.Limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FrmCliente.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FrmCliente.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
