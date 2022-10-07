package com.knf.dev.AnimalsSpecies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "*", maxAge = 4800)
@RequestMapping("api/auth/books")
public class BookController {




        @Autowired
        private BookService service;

    @GetMapping("/bookdata")
    public List<Books> List()
    {
        return service.getProductList();
    }

    }

