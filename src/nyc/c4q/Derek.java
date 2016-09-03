package nyc.c4q;

public class Derek implements C4QStudent {
    @Override
    public String name() {
        return "Derek";
    }

    @Override
    public String nickName() {
        return "D-Wreck";
    }

    @Override
    public int stepsPerDay() {
        return 7000;
    }

    @Override
    public String yourFavoriteColor() {
        return "blue";
    }
}