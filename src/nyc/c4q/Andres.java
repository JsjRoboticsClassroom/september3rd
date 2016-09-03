package nyc.c4q;

/**
 * Created by andresarango on 9/3/16.
 */
public class Andres implements C4QStudent{
    @Override
    public String name() {
        return "Andres";
    }

    @Override
    public String nickName() {
        return "Aye Rico";
    }

    @Override
    public int stepsPerDay() {
        return 4000;
    }

    @Override
    public String yourFavoriteColor() {
        return "Orange";
    }
}
