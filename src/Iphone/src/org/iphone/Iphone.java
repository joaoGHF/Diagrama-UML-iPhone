package org.iphone;

import org.classes.AparelhoTelefonico;
import org.classes.NavegadorInternet;
import org.classes.ReprodutorMusical;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joaoGHF
 */
public class Iphone {
    private static ReprodutorMusical reprodutorMusical;
    private static AparelhoTelefonico aparelhoTelefonico;
    private static NavegadorInternet navegadorInternet;
    
    public Iphone() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
    }

    public static ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public static AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public static NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }
    
    

}
