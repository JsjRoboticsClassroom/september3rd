package nyc.c4q;

/**
 * Created by maxrosado on 9/3/16.
 */
public class MaxRosado implements C4QStudent {
    @Override
    public String name() {
        return "Max Rosado";
    }

    @Override
    public String nickName() {
        return "Maximus";
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
