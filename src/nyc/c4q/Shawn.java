package nyc.c4q;

/**
 * Created by shawnspeaks on 9/3/16.
 */
public class Shawn implements C4QStudent {
    @Override
    public String name() {
        return "Shawn";
    }

    @Override
    public String nickName() {
        return "McFly";
    }

    @Override
    public int stepsPerDay() {
        return 9001;
    }

    @Override
    public String yourFavoriteColor() {
        return "Scarlet";
    }
}
