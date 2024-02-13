package ru.akhmedyanov.homework08.hw08.services;

import org.springframework.stereotype.Service;
import ru.akhmedyanov.homework08.hw08.aspects.ToLog;
import ru.akhmedyanov.homework08.hw08.models.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class AnimalService {

    private Logger logger = Logger.getLogger(AnimalService.class.getName());
    List<Animal> animals = new ArrayList<>();

    /**
     * Добавить животное
     * @param animal
     */
    @ToLog
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    /**
     * Получить всех животных
     * @return
     */
    public List<Animal> getAllAnimals() {
        return animals;
    }
}
