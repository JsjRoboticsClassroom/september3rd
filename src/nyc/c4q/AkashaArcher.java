package nyc.c4q;

/**
 * Created by akashaarcher on 9/3/16.
 */

public class AkashaArcher implements C4QStudent {
    @Override
    public String name() {
        return "Akasha Archer";
    }

    @Override
    public String nickName() {
        return "Kasha";
    }

    @Override
    public int stepsPerDay() {
        return 8000;
    }

    @Override
    public String yourFavoriteColor() {
        return "Navy Blue";
    }
}
