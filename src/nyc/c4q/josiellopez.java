package nyc.c4q;

/**
 * Created by Josiel on 9/3/16.
 */
public class josiellopez implements C4QStudent{
    @Override
    public String name() {
        return "Josiel Lopez";
    }

    @Override
    public String nickName() {
        return "DOOM is my name.";
    }

    @Override
    public int stepsPerDay() {
        return 5000;
    }

    @Override
    public String yourFavoriteColor() {
        return "Blue";
    }
}
