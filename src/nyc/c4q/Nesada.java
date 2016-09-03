package nyc.c4q;

/**
 * Created by nesadakoca on 9/3/16.
 */
public class Nesada implements C4QStudent{

    private String mName ="Nesada";
    private String mNickName = "Nesi";
    int mStepsForDay =  18000;
    public String mYourFavoriteColor = "Brown";
    @Override
    public String name() {
        return mName;
    }

    @Override
    public String nickName() {

        return mNickName;
    }

    @Override
    public int stepsForDay() {
        return 0;
    }

    @Override
    public String yourFavoriteColor() {
        return mYourFavoriteColor;
    }


}
