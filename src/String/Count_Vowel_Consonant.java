package String;

public class Count_Vowel_Consonant {
    public static void main(String[] args) {

        String str = "Programming".toLowerCase();

        int vowels = 0, consonants = 0;

        for (char ch : str.toCharArray()) {

            if (Character.isLetter(ch)) {

                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}
