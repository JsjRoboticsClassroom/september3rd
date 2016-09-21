package nyc.c4q;

public class Main {

    public static void main(String[] args) {
        C4QStudent student = new RafatKhandaker();
        System.out.println(student.name());
        System.out.println(student.nickName());
        System.out.println(student.stepsPerDay());
        System.out.println(student.yourFavoriteColor());

    }
}
