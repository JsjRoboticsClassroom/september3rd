package nyc.c4q;

/**
 * Created by queenabergen on 9/3/16.
 */
public class Cue implements C4QStudent{
    @Override
    public String name() {
        return "Queena";
    }

    @Override
    public String nickName() {
        return "Cue";
    }

    @Override
    public int stepsPerDay() {
        return 500;
    }

    @Override
    public String yourFavoriteColor() {
        return "black";
    }
}
