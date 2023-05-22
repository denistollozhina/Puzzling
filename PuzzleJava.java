import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

    // Method to generate and return an array with 10 random numbers between 1 and 20 inclusive.
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(20) + 1;
            rolls.add(num);
        }

        return rolls;
    }

    // Method to generate and return a random letter from the alphabet.
    public char getRandomLetter() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Random rand = new Random();
        int index = rand.nextInt(26);
        return alphabet[index];
    }

    // Method to generate and return a random string of eight characters.
    public String generatePassword() {
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            char randomLetter = getRandomLetter();
            password.append(randomLetter);
        }

        return password.toString();
    }

    // Method to create an array of random eight-character words.
    public String[] getNewPasswordSet(int length) {
        String[] passwordSet = new String[length];

        for (int i = 0; i < length; i++) {
            String password = generatePassword();
            passwordSet[i] = password;
        }

        return passwordSet;
    }

    // Method to shuffle an array in a pseudo-random way.
    public void shuffleArray(Object[] arr) {
        Random rand = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Object temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
