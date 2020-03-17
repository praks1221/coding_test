
/**
 * Count the number of vowel and consonant in a given string of only alphabets
 * and return in two element array first contains number of vowels
 * second the number of consonants
 * eg. "HelloWorld" => [3, 7]
 * "KuebikoIt" => [5, 4]
 */

package prakriti;

public class CountVowelConsonant {

    public static void main(String[] args) {
        int [] newArr=countVowelConsonant("HelloWorld");
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+ " ");
        }

    }
    public static int []  countVowelConsonant(String input1) {
        String input=input1.toLowerCase();
        char[] vowel = {'a','e', 'i', 'o', 'u'};
        char[] consonant = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r','s','t','v', 'w' ,'x','y','z'};

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < vowel.length; j++) {
                if (input.charAt(i) == vowel[j]) {
                    vowelCount++;
                }
            }
        }
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < consonant.length; j++) {

                if (input.charAt(i) == consonant[j]) {
                    consonantCount++;
                }
            }
        }

        int[] VArray = new int[2];

        VArray[0]=vowelCount;
        VArray[1]=consonantCount;

        return  VArray;
    }

}
