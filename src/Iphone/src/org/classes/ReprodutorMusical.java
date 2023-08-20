/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.classes;

import java.util.TreeMap;
import org.interfaces.InterfaceReprodutorMusical;

/**
 *
 * @author joaoGHF
 */
public class ReprodutorMusical implements InterfaceReprodutorMusical {
    private TreeMap<Integer, String> musicas;
    private int musicaSelecionada;
    private boolean tocando;
    
    
    public ReprodutorMusical() {
        this.musicas = new TreeMap<>();
        this.musicaSelecionada  = 0;
        this.tocando  = false;
    }
    
    public String addMusica(int id, String titulo) {
        musicas.put(id, titulo);
        return "Add musica " + id + ": " + musicas.get(id);
    }
    
    public String getMusicas() {
        StringBuilder sb = new StringBuilder();
        
        for (Integer id: musicas.keySet()) {
            sb.append("[" + id + ", " + musicas.get(id) + "]\n");
        }
        
        return sb.toString();
    }

    @Override
    public String tocar() {
        tocando = true;
        return "Tocando musica " + musicas.get(musicaSelecionada);
    }

    @Override
    public String pausar() {
        tocando = false;
        return "Pausando musica " + musicas.get(musicaSelecionada);
    }

    @Override
    public String selecionarMusica(int id) {
        musicaSelecionada = id;
        return "Selecionada musica " + id + ": " + musicas.get(id);
    }
}
