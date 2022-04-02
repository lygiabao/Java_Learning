package Java_Lesson_09;
import java.security.SecureRandom;

public class AnimalBuilder {
    private int maxspeed;
    private int speed;
    private boolean withwings;
    private String name;
    protected AnimalBuilder(Builder builder){
        withwings = builder.withwings;
        maxspeed = builder.maxspeed;
        speed = new SecureRandom().nextInt(maxspeed);
        name = builder.name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isWithwings() {
        return withwings;
    }

    public String getName() {
        return name;
    }

    public static class Builder{
        private int maxspeed;
        private int speed;
        private boolean withwings;
        private String name;

        public void Withwings(boolean withwings) {
            this.withwings = withwings;
        }

        public void withMaxspeed(int maxspeed) {
            this.maxspeed = maxspeed;
        }

        public void withName(String name) {
            this.name = name;
        }

        public AnimalBuilder build() {
            return new AnimalBuilder(this);
        }
    }
}

