package nyc.c4q;

/**
 * Created by mathcore on 9/3/16.
 */
public class JoseGonzalez implements C4QStudent {
    @Override
    public String name() {
        return "Jose Gonzalez";
    }

    @Override
    public String nickName() {
        return "The other Jose";
    }

    @Override
    public int stepsPerDay() {
        return 12000;
    }

    @Override
    public String yourFavoriteColor() {
        return "Seafoam Green";
    }
}
