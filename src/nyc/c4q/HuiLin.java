package nyc.c4q;

/**
 * Created by huilin on 9/3/16.
 */

public class HuiLin implements C4QStudent {

    @Override
    public String name() {
        return "Hui";
    }

    @Override
    public String nickName() {
        return "Lily";
    }

    @Override
    public int stepsPerDay() {
        return 400;
    }

    @Override
    public String yourFavoriteColor() {
        return "Blue";
    }
}

