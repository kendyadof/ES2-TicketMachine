/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.junit;

import br.calebe.ticketmachine.core.PapelMoeda;
import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.core.TrocoIterator;
import br.calebe.ticketmachine.core.Troco;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Pepe
 */
public class JUnitTest {
    
    public JUnitTest() {
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
    
    @Test
    public void testeInserir() throws PapelMoedaInvalidaException {
        TicketMachine tm = new TicketMachine(5);
        tm.inserir(20);
        assertEquals(tm.getSaldo() == 20, true);
    }
    
    @Test
    public void testeGetTroco() {
        TicketMachine tm = new TicketMachine();
        Troco troco = new Troco(10);
        Iterator trocos = new TrocoIterator(troco);
        assertEquals(tm.getTroco(10), trocos);       
    }
    
    @Test
    public void testeGetValor() {
        PapelMoeda pm = new PapelMoeda(2,2);
        assertTrue(pm.getValor() == 2);
    }
    
    @Test
    public void testeGetQuantidade() {
        PapelMoeda pm = new PapelMoeda(2,2);
        assertEquals(pm.getQuantidade(), 2);
    }
}
