package lesson07;

public class Block {
    public static void main(String[] args) {

        int x = 10;

        {
            int y = 5;
            x = x + y;
            System.out.println("x: " +x);
            System.out.println("y: " +y);
        }

        int y = 124;
        x = x + y;
        System.out.println("x: " + x);

    }
}
