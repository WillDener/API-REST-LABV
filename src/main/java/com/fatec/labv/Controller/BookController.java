package com.fatec.labv.Controller;

import com.fatec.labv.Model.Livro;
import com.fatec.labv.Repository.Estante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/livro")
public class BookController {
    @Autowired
    private Estante estante;

    @PostMapping(value = "/save")
    public void save (@RequestBody Livro livro) {

    }
}
