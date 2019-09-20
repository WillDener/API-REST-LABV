package com.fatec.labv.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@Component("Livro")
public class Livro {
    private String nome;
    private String ISBN;
    private LocalDate anoPublicacao;
    private Autor autor;
    private Editora editora;
    private int NumPag;
    private int edicao;
}
