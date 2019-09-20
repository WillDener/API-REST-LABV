package com.fatec.labv.Repository;

import com.fatec.labv.Model.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component("Estande")
public class Estante {
    @Autowired
    private final ArrayList<Livro> livros = new ArrayList();

    public void addLivro (Livro livro) {
        livros.add(livro);
    }

    public Livro buscarPorNome (String nome) {
        for (Livro livro : livros) {
            if (livro.getNome().equals(nome)) return livro;
        }
        return null;
    }

    public ArrayList<Livro> buscarPorAutorDoLivro (String nome) {
        ArrayList<Livro> obras = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getAutor().getNome().equals(nome)) obras.add(livro);
        }
        if (!obras.isEmpty()) return obras;
        return null;
    }

    public ArrayList<Livro> buscarPorEditoraDoLivro (String nome) {
        ArrayList<Livro> livroArrayList = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getEditora().getNome().equals(nome)) livroArrayList.add(livro);
        }
        if (!livroArrayList.isEmpty()) return livroArrayList;
        return null;
    }

    public ArrayList<Livro> getAll () {
        return livros;
    }
}
