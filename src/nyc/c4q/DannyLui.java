package nyc.c4q;

public class DannyLui implements C4QStudent {
    @Override
    public String name() {
        return "Danny Lui";
    }

    @Override
    public String nickName() {
        return "Dan";
    }

    @Override
    public int stepsPerDay() {
        return 10;
    }

    @Override
    public String yourFavoriteColor() {
        return "No one will know";
    }
}
