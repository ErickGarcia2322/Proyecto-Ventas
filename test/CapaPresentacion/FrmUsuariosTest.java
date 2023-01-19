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
public class FrmUsuariosTest {
    
    public FrmUsuariosTest() {
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
     * Test of mostrar method, of class FrmUsuarios.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        String buscar = "";
        FrmUsuarios instance = new FrmUsuarios();
        instance.mostrar(buscar);
       
    }

    /**
     * Test of inhabilitar method, of class FrmUsuarios.
     */
    @Test
    public void testInhabilitar() {
        System.out.println("inhabilitar");
        FrmUsuarios instance = new FrmUsuarios();
        instance.inhabilitar();
       
    }

    /**
     * Test of habilitar method, of class FrmUsuarios.
     */
    @Test
    public void testHabilitar() {
        System.out.println("habilitar");
        FrmUsuarios instance = new FrmUsuarios();
        instance.habilitar();
      
    }

    /**
     * Test of Limpiar method, of class FrmUsuarios.
     */
    @Test
    public void testLimpiar() {
        System.out.println("Limpiar");
        FrmUsuarios instance = new FrmUsuarios();
        instance.Limpiar();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class FrmUsuarios.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FrmUsuarios.main(args);
 
    }
    
}
