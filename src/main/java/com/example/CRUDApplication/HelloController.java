package com.example.CRUDApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/")
   public List<Livro> helloWorld() {
        // Criando uma lista de livros para retornar como JSON
        return List.of(
            new Livro(1L, "O Senhor dos Anéis", "J.R.R. Tolkien"),
            new Livro(2L, "Dom Casmurro", "Machado de Assis"),
            new Livro(3L, "O Hobbit", "J.R.R. Tolkien")
        );
    }
}