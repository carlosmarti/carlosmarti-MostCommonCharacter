import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {

        HashMap<Character, Integer> charMap = new HashMap<>();

        //add each character from string into the map
        for(char c : str.toCharArray()){
            charMap.put(c, 0);
        }

        for(int i = 0; i < str.length(); i++){
            int val = charMap.get(str.charAt(i));
            val++;

            charMap.replace(str.charAt(i), val);
        }

        char rChar = ' ';
        int mostChar = 0;
        for(char key : charMap.keySet()){
            if(mostChar < charMap.get(key)){
                rChar = key;
                mostChar = charMap.get(key);
            }
        }

        return rChar;
    }
}
