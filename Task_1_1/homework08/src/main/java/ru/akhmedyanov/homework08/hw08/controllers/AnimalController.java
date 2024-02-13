package ru.akhmedyanov.homework08.hw08.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.akhmedyanov.homework08.hw08.models.Animal;
import ru.akhmedyanov.homework08.hw08.services.AnimalService;

@RestController
@AllArgsConstructor
public class AnimalController {

    private AnimalService animalService;

    /**
     * Получить всех животных
     * @param model
     * @return
     */
    @GetMapping("/animals")
    public String getAnimal(Model model) {
        model.addAttribute("animals", animalService.getAllAnimals());
        return "animals";
    }

    /**
     * Добавить животное
     * @param animal
     * @param model
     * @return
     */
    @PostMapping("/animals")
    public String addAnimal(Animal animal, Model model) {
        animalService.addAnimal(animal);
        model.addAttribute("animals", animalService.getAllAnimals());
        return "animals";
    }
}
