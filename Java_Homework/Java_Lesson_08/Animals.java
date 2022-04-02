package Java_Lesson_08;

import java.security.SecureRandom;

public class Animals {
    private int maxSpeed;
    private int count;
    private int randomSpeed;

    protected Animals(int max) {
        this.maxSpeed = max;
    }

    protected int speed() {
        if (count == 0) {
            this.randomSpeed = new SecureRandom().nextInt(this.maxSpeed);
            count++;
            return this.randomSpeed;
        } else {
            try {
                throw new IllegalArgumentException("Can not call this function more than one time");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this.randomSpeed;
    }

    public int getCount() {
        return this.count;
    }
}
