package Java_Lesson_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Speed {

    public static void main(String[] args) {
        Dogs dog = new Dogs();
        Horses horse = new Horses();
        Tigers tiger = new Tigers();

        racing(dog, horse, tiger);

    }

    private static void racing(Animals... animals) {
        HashMap<String, Integer> mapAnimal = new HashMap<>();
        for (int i = 0; i < animals.length; i++) {
            int speed = animals[i].speed();
            mapAnimal.put(animals[i].getClass().getSimpleName() + " with index is " + i, speed);
            System.out.println("name: " + animals[i].getClass().getSimpleName() + " with index is " + i + ", speed: " + speed);
        }
        int maxValueInMap = (Collections.max(mapAnimal.values()));

        List<String> animalNames = new ArrayList<>(mapAnimal.keySet());

        for (int i = 0; i < mapAnimal.size(); i++) {
            if (mapAnimal.get(animalNames.get(i)) == maxValueInMap) {
                System.out.println("Winner is " + animalNames.get(i) + ", with speed: " + maxValueInMap);
            }
        }

    }
}

