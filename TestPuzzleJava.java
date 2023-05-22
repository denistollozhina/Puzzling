import java.util.ArrayList;

public class TestPuzzleJava {

    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();

        // Test getTenRolls method
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        // Test getRandomLetter method
        char randomLetter = generator.getRandomLetter();
        System.out.println(randomLetter);

        // Test generatePassword method
        String password = generator.generatePassword();
        System.out.println(password);

        // Test getNewPasswordSet method
        int length = 5;
        String[] passwordSet = generator.getNewPasswordSet(length);
        for (String pass : passwordSet) {
            System.out.println(pass);
        }

        // Test shuffleArray method
        Integer[] numbers = {1, 2, 3, 4, 5};
        generator.shuffleArray(numbers);
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
