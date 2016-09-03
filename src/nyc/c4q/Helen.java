package nyc.c4q;

/**
 * Created by helenchan on 9/3/16.
 */
public class Helen implements C4QStudent{
    @Override
    public String name() {
        return "Helen";
    }

    @Override
    public String nickName() {
        return "Thats classified";
    }

    @Override
    public int stepsPerDay() {
        return 200;
    }

    @Override
    public String yourFavoriteColor() {
        return "blue";
    }
}
