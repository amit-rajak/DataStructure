package com.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Entity {
    private int id;
    private String name;

    // Constructor, getters, and setters

    public Entity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

 class Main {
    public static void main(String[] args) {
        // Example input list
        List<Entity> entities = List.of(
                new Entity(1, "Entity1"),
                new Entity(2, "Entity2"),
                new Entity(1, "Entity1_Duplicate"),
                new Entity(3, "Entity3")
        );

        // Eliminate duplicate entities based on the id field
        List<Entity> uniqueEntities = entities.stream()
                .collect(Collectors.toMap(Entity::getId,Function.identity(),(existing, replacement) -> existing))
                .values()
                .stream()
                .collect(Collectors.toList());

        // Print the unique entities
        uniqueEntities.forEach(entity ->
                System.out.println("ID: " + entity.getId() + ", Name: " + entity.getName())
        );
    }
}
