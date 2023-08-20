/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.classes;

import org.interfaces.InterfaceAparelhoTelefonico;

/**
 *
 * @author joaoGHF
 */
public class AparelhoTelefonico implements InterfaceAparelhoTelefonico {

    @Override
    public String ligar(int numero) {
        return "ligando para " + numero;
    }

    @Override
    public String atender() {
        return "atendendo ligacao";
    }

    @Override
    public String iniciarCorreioDeVoz(int numero, String mensagem) {
        return "iniciando correio de voz para " + numero + ": " + mensagem;
    }
}
