package nyc.c4q;

/**
 * Created by Hyun on 9/3/16.
 */
public class Hyunjoo implements C4QStudent{

    @Override
    public String name() {
        return "Hyunjoo";
    }

    @Override
    public String nickName() {
        return "Hyun";
    }

    @Override
    public int stepsPerDay() {
        return 100;
    }

    @Override
    public String yourFavoriteColor() {
        return "blue";
    }
}
