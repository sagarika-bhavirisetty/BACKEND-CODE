package com.knf.dev.AnimalsSpecies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService {
    @Autowired
    private  final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }


    public List<Books> getProductList() {

        return repository.findAll();
    }

}
