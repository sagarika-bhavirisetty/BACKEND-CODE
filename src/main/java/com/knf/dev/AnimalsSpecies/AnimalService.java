package com.knf.dev.AnimalsSpecies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {
    @Autowired
    private  final AnimalRepository repository;

    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
    }
    public void addProduct(Animals data)
    {
        repository.save(data);
    }
    public Animals productbyid(long Id)
    {

        return repository.findById(Id).get();
    }
    public List<Animals> productbytype(String type)
    {

        return repository.findByType(type);
    }


    public List<Animals> getProductList() {
        return repository.findAll();
    }
}
