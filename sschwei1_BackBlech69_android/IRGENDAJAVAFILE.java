package task01.sschwei1_BackBlech69_android;

import java.util.Random;

class IRGENDAJAVAFILE {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("Some other changes.");
        theseAreOnlyRandomNumbers();
    }

    public static void thisIsANewMehtod() {
        int x = 0;

        while (x < 6969) {
            System.out.println("Still less than 6969");
            x++;
        }

        int EineZahl = 420;
        EineZahl *= 187;
        EineZahl += 69;
    }


    public static void theseAreOnlyRandomNumbers() {
        Random random = new Random(441287210);
        for (int i = 0; i < 10; i++)
            System.out.print(random.nextInt(10) + " ");
    }
}


