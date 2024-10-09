package com.example.CRUD.API;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/all")
    public List<Animal> getAllAnimals(){
        return animalService.getAllAnimals();
    }

    @GetMapping("/{animalId}")
    public Animal getOneAnimal(@PathVariable int animalId) {
        return animalService.getAnimalById(animalId);
    }

    @GetMapping("") 
    public List<Animal> getAnimalsBySpecies(@RequestParam(name = "species") String species) {
        return animalService.getAnimalsBySpecies(species);
    }
    
    @PostMapping("/new")
    public List<Animal> addAnimal(@RequestBody Animal animal) {
        animalService.addAnimal(animal);
        return animalService.getAllAnimals();
    }

    @GetMapping("/search")
    public List<Animal> getAnimalsbyName(@RequestParam("name") String name) {
        return animalService.searchAnimalsByName(name);
    }

    @GetMapping("/habitat")
    public List<Animal> findByHabitat(@RequestParam(name = "habitat") String habitat) {
        return animalService.findByHabitat(habitat);
    }
    @PutMapping("/update/{animalId}")
    public Animal updateAnimal(@PathVariable int animalId, @RequestBody Animal animal){
        animalService.updateAnimal(animalId, animal);
        return animalService.getAnimalById(animalId);
    }

    @DeleteMapping("/delete/{animalId}")
    public List<Animal> deleteAnimalsById(@PathVariable int animalId) {
        animalService.deleteAnimal(animalId);
        return animalService.getAllAnimals();
    }
 

}
