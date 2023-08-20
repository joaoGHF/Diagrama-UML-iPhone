/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.classes;

import com.sun.source.tree.Tree;
import java.util.TreeMap;
import org.interfaces.InterfaceNavegadorInternet;

/**
 *
 * @author joaoGHF
 */
public class NavegadorInternet implements InterfaceNavegadorInternet {
    private TreeMap<Integer, String> paginas = new TreeMap<>();
    private int paginaSelecionada = 0;
    

    @Override
    public String exibirPagina(int id) {
        return paginas.get(id);
    }

    @Override
    public String adicionarNovaAba(int id, String titulo) {
        paginas.put(id, titulo);
        return "Add pagina " + id + ": " + titulo; 
    }

    @Override
    public String atualizarPagina() {
        return "atualizando a pagina" + paginaSelecionada + ": "
                + paginas.get(paginaSelecionada);
    }
    
}
