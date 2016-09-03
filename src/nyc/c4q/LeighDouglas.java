package nyc.c4q;

/**
 * Created by leighdouglas on 9/3/16.
 */
public class LeighDouglas implements C4QStudent {

    @Override
    public String name() {
        return "Leigh";
    }

    @Override
    public String nickName() {
        return "Lolly";
    }

    @Override
    public int stepsPerDay() {
        return 5000;
    }

    @Override
    public String yourFavoriteColor() {
        return "purple";
    }
}
