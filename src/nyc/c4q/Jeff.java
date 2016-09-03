package nyc.c4q;

/**
 * Created by c4q on 9/3/16.
 */
public class Jeff implements C4QStudent {

    @Override
    public String name() {
        return "Jeffrey Avila";
    }

    @Override
    public String nickName() {
        return "Jeff";
    }

    @Override
    public int stepsPerDay() {
        return 10000;
    }

    @Override
    public String yourFavoriteColor() {
        return "Blue";
    }
}

