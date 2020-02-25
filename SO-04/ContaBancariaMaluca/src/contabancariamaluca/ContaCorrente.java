/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancariamaluca;

/**
 *
 * @author profbrigadeiro
 */
public class ContaCorrente {

    public static float saldo = 0;
    float tmp;

    public float getSaldo() {
        return saldo;
    }

    public synchronized void depositar(float valor) { // toda vez que for iniciado o metodo depositar, ele será finalizado para depois trocar de procedimento (Threads), tipo um semaforo
        tmp = getSaldo();
        saldo = tmp + valor;
    }

    public synchronized void sacar(float valor) {
        tmp = getSaldo();
        saldo = tmp - valor;
    }

}
