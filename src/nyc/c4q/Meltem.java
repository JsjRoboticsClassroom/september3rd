package nyc.c4q;

/**
 * Created by meltemyildirim on 9/3/16.
 */
public class Meltem  implements C4QStudent{
    @Override
    public String name() {
      return "Meltem";
    }

    @Override
    public String nickName() {
      return "Mel";
    }

    @Override
    public String yourFavoriteColor() {
      return "Green";
    }

    @Override
    public int stepsPerDay() {
      return 1000;
    }
}
