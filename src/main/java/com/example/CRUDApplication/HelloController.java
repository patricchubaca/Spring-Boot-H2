package com.example.CRUDApplication;

import com.example.CRUDApplication.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/")
   public List<Book> helloWorld() {
        // Criando uma lista de livros para retornar como JSON
        return List.of(
            new Book(1L, "O Senhor dos Anéis", "J.R.R. Tolkien"),
            new Book(2L, "Dom Casmurro", "Machado de Assis"),
            new Book(3L, "O Hobbit", "J.R.R. Tolkien")
        );
    }
}