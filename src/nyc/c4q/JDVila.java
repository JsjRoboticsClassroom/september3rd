package nyc.c4q;

/**
 * Created by josevila on 9/3/16.
 */
public class JDVila implements C4QStudent {
    @Override
    public String name() {
        return "Jose Daniel Vila";
    }

    @Override
    public String nickName() {
        return "Joey";
    }

    @Override
    public int stepsPerDay() {
        return 10000;
    }

    @Override
    public String yourFavoriteColor() {
        return "Orange";
    }
}