/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

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

    public void depositar(float valor) {
        tmp = getSaldo();
        saldo = tmp + valor;
    }

    public void sacar(float valor) {
        tmp = getSaldo();
        saldo = tmp - valor;
    }

}
