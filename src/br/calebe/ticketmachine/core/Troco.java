package br.calebe.ticketmachine.core;

import java.util.Iterator;

/**
 *
 * @author Correção: João Pedro Rocha e Leonardo de Maria
 */
public class Troco {

    protected PapelMoeda[] papeisMoeda;

    public Troco(int valor) {
        papeisMoeda = new PapelMoeda[6];
        int count = 0;
        while (valor % 100 != 0) {
            count++;
            //correção da issue 5:
            valor = valor - 100;
        }
        papeisMoeda[5] = new PapelMoeda(100, count);
        count = 0;
        while (valor % 50 != 0) {
            count++;
            //correção da issue 6:
            valor = valor - 50;
        }
        papeisMoeda[4] = new PapelMoeda(50, count);
        count = 0;
        while (valor % 20 != 0) {
            count++;
            //correção da issue 7:
            valor = valor - 20;
        }
        papeisMoeda[3] = new PapelMoeda(20, count);
        count = 0;
        while (valor % 10 != 0) {
            count++;
            //correção da issue 8:
            valor = valor - 10;
        }
        papeisMoeda[2] = new PapelMoeda(10, count);
        count = 0;
        while (valor % 5 != 0) {
            count++;
            //correção da issue 9
            valor = valor - 5;
        }
        papeisMoeda[1] = new PapelMoeda(5, count);
        count = 0;
        while (valor % 2 != 0) {
            count++;
            //correção da issue 10:
            valor = valor - 2;
        }
        papeisMoeda[1] = new PapelMoeda(2, count);
        
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

    //correção da issue 16: método "remove()" removido.
    
    //correção da issue 14: implementação separada das classes Troco e Troco Iterator
    //as issues 11, 12, 13 e 17 foram tratadas na classe TrocoIterator
}
