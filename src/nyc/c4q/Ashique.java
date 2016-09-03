package nyc.c4q;

/**
 * Created by ashiquechowdhury on 9/3/16.
 */
public class Ashique implements C4QStudent {
    @Override
    public String name() {
        return "Ashique";
    }

    @Override
    public String nickName() {
        return "ash";
    }

    @Override
    public int stepsPerDay() {
        return 100;
    }

    @Override
    public String yourFavoriteColor() {
        return "White";
    }
}
