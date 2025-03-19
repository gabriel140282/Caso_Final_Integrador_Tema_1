package org.example.cuidado;

import org.example.habitats.Habitat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

class AnimalTest {

    @Test
    void testConstructor() {
        Habitat habitat = new Habitat("Selva Tropical", 28.0,90,"Húmedo");

        Animal animal = new Animal("Leo", "León", habitat);

        assertEquals("Leo", animal.getNombre(), "El nombre del animal debería ser 'Leo'");
        assertEquals("León", animal.getEspecies(), "La especie debería ser 'León'");
        assertEquals(habitat, animal.getHabitat(), "El hábitat debería coincidir con el asignado");
        assertEquals(100, animal.getSalud(), "La salud inicial debería ser 100");
        assertNull(animal.getHoraUltimaComida(), "La hora de la última comida debería ser null al inicio");
    }

    @Test
    void testAlimentacion() {
        Habitat habitat = new Habitat("Sabana", 35.0,50,"Limpio");
        Animal animal = new Animal("Dumbo", "Elefante", habitat);

        animal.alimentacion();

        assertNotNull(animal.getHoraUltimaComida(),
                "La hora de la última comida no debería ser null después de alimentar");

        LocalDateTime now = LocalDateTime.now();
        assertTrue(!animal.getHoraUltimaComida().isAfter(now),
                "La hora de la última comida debería ser anterior o igual al momento actual");
    }

    @Test
    void testMonitorAnimal() {
        Habitat habitat = new Habitat("Desierto", 40.0,10,"Sucio");
        Animal animal = new Animal("Rex", "Iguana", habitat);

        animal.monitorAnimal();
    }
}
