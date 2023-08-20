/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.app;

import org.classes.AparelhoTelefonico;
import org.classes.NavegadorInternet;
import org.classes.ReprodutorMusical;
import org.iphone.Iphone;

/**
 * Este programa foi apenas feito para a implementação de um diagrama de classes
 * do iPhone. Não foi devidamente testado e refatorado, podendo conter instabilidades
 * ou falhas grotescas.
 * @author joaoGHF
 */
public class App {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        ReprodutorMusical reprodutor = Iphone.getReprodutorMusical();
        AparelhoTelefonico telefone =  Iphone.getAparelhoTelefonico();
        NavegadorInternet navegador = Iphone.getNavegadorInternet();
        
        System.out.println(reprodutor.addMusica(0, "AAA"));
        System.out.println(reprodutor.addMusica(1, "BAB"));
        System.out.println(reprodutor.getMusicas());
        
        System.out.println(telefone.ligar(99898989));
        System.out.println(telefone.iniciarCorreioDeVoz(99898989,
                "Inicio correio de voz"));
        
        System.out.println(navegador.adicionarNovaAba(0, "pZZZ"));
        System.out.println(navegador.adicionarNovaAba(1, "pYZX"));
        System.out.println(navegador.exibirPagina(1));
        
    }
}
