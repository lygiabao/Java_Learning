package Java_Lesson_09;
import java.util.ArrayList;
import java.util.List;

public class TestAnimalBuilder {
    public static void main(String[] args){
        AnimalBuilder.Builder horse = new AnimalBuilder.Builder();
        horse.Withwings(false);
        horse.withMaxspeed(75);
        horse.withName("Horse");
        AnimalBuilder animalWithBuilder_horse = horse.build();

        AnimalBuilder.Builder tiger = new AnimalBuilder.Builder();
        tiger.Withwings(false);
        tiger.withMaxspeed(100);
        tiger.withName("Tiger");
        AnimalBuilder animalWithBuilder_tiger = tiger.build();

        AnimalBuilder.Builder dog = new AnimalBuilder.Builder();
        dog.Withwings(false);
        dog.withMaxspeed(60);
        dog.withName("Dog");
        AnimalBuilder animalWithBuilder_dog = dog.build();

        AnimalBuilder.Builder hawk = new AnimalBuilder.Builder();
        hawk.Withwings(true);
        hawk.withMaxspeed(80);
        hawk.withName("Hawk");
        AnimalBuilder animalWithBuilder_hawk = hawk.build();

        AnimalBuilder.Builder eagle = new AnimalBuilder.Builder();
        eagle.Withwings(true);
        eagle.withMaxspeed(75);
        eagle.withName("Eagle");
        AnimalBuilder animalWithBuilder_eagle = eagle.build();

        List<AnimalBuilder> animalbuilderList = new ArrayList<>();
        animalbuilderList.add(animalWithBuilder_horse);
        animalbuilderList.add(animalWithBuilder_tiger);
        animalbuilderList.add(animalWithBuilder_dog);
        animalbuilderList.add(animalWithBuilder_hawk);
        animalbuilderList.add(animalWithBuilder_eagle);

        List<AnimalBuilder> competed_animal_list = new ArrayList<>();
        for (AnimalBuilder list:animalbuilderList){
            if(!(list.isWithwings())){
                competed_animal_list.add(list);
            }
        }

        int max = competed_animal_list.get(0).getSpeed();
        String winner = "Horse";
        for (AnimalBuilder list_animal : competed_animal_list){
            if(max < list_animal.getSpeed()){
                max = list_animal.getSpeed();
                winner = list_animal.getName();
            }
        }

        System.out.println("Winner is: " + winner);
    }
}
