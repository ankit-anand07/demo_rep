import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String text = new String();
        text = sc.nextLine();
        char[] letters = new char[26];
        int[] freqarray = new int[26];

        for (int i = 0; i < text.length(); i++) {
            letters[text.charAt(i) - 'a'] = text.charAt(i);
            freqarray[text.charAt(i) - 'a']++;
        }
        for (int i = 0; i < letters.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (freqarray[j - 1] < freqarray[j]
                        || freqarray[j - 1] == freqarray[j] && letters[j - 1] > letters[j]) {
                    int temp = freqarray[j - 1];
                    freqarray[j - 1] = freqarray[j];
                    freqarray[j] = temp;

                    char temp2 = letters[j - 1];
                    letters[j - 1] = letters[j];
                    letters[j] = temp2;
                }
            }
        }
        System.out.println("Letters\tFrequency\n");
        for (int i = 0; i < letters.length; i++) {
            if (freqarray[i] == 0)
                continue;
            else
                System.out.println(letters[i] + "\t" + freqarray[i]);
        }
    }
}