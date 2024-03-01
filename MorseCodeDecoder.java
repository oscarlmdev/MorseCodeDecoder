import java.util.ArrayList;
public class MorseCodeDecoder {
   public static String decode(String morseCode) {
        String[] morseWords = morseCode.trim().split("\\s{3}");
        String[] morseChars;
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < morseWords.length; i++) {
            morseChars = morseWords[i].split("\\s{1}");
            for(int j=0; j<morseChars.length;j++){
                word.append(MorseCode.get(morseChars[j]));
            }
            if(i!=morseWords.length-1)word.append(" ");
        }
        return word.toString();
    }
}
