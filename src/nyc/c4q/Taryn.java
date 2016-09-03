package nyc.C4Q;

import nyc.C4Q.C4QStudent;

/**
 * Created by tarynking on 9/3/16.
 */
class Taryn implements C4QStudent {
    @Override
    public String name() {
        return "Taryn";
    }

    @Override
    public String nickName() {
        return "Tee";
    }

    @Override
    public int stepsPerDay() {
        return 1000;
    }

    @Override
    public String yourFavoriteColor() {
        return "Hot Pink";
    }
}
