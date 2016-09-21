package nyc.c4q;

/**
 * Created by root on 9/2/16.
 */
public class RafatKhandaker implements C4QStudent{

    @Override
    public String name() {
        return "Rafat";
    }

    @Override
    public String nickName() {
        return "Black Jack";
    }

    @Override
    public int stepsPerDay() {
        return 25000;
    }

    @Override
    public String yourFavoriteColor() {
        return "Black & Orange";
    }
}
