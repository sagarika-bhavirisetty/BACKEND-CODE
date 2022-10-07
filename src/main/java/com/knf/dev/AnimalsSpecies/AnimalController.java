package com.knf.dev.AnimalsSpecies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 4800)
@RequestMapping("api/auth/animals")
public class AnimalController {
    @Autowired
    private AnimalService service;

    public AnimalController(AnimalService service) {
        this.service = service;
    }

    @PostMapping("/insert")
    public void insert(@RequestBody Animals data)
    {

        service.addProduct(data);
    }
    @GetMapping("/{id}")
    public Animals productbyid(@PathVariable long id)
    {
        return service.productbyid(id);

    }
    @GetMapping("type/{type}")
    public List< Animals> productbytype(@PathVariable String type)
    {
        return service.productbytype(type);

    }
    @GetMapping("/data")
    public List<Animals> List()
    {
        return service.getProductList();
    }


}
