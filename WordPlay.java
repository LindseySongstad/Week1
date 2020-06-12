
/**
 * Write a description of WordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//import edu.duke.*;



public class WordPlay {
    public boolean isVowel(char ch){
        String vowels = "AEIOUaeiou";
        String str = Character.toString(ch);
        if (vowels.contains(str)){
            return true;
        }
        else {
            return false;
        }
    }
    public void testVowel(){
        System.out.println(isVowel('a'));
        System.out.println(isVowel('s'));
        System.out.println(isVowel('O'));
        System.out.println(isVowel('t'));
    }
    public String replaceVowels(String phrase, char ch){
        StringBuilder sb = new StringBuilder(phrase);
        for (int i = 0; i < phrase.length(); i++){
            if (isVowel(phrase.charAt(i))){
                //System.out.println(phrase.charAt(i));
                sb.setCharAt(i, ch);
            }
        }
        return sb.toString();
    }
    public void testReplace(){
        String phrase = "Hello World";
        char ch = '*';
        System.out.println(replaceVowels(phrase, ch));
    }
    public String emphasize(String phrase, char ch){
        StringBuilder sb = new StringBuilder(phrase);
        for (int i =0; i < sb.length(); i++){
            
            if (sb.charAt(i) == ch) {
                if (i%2 == 0){
                    sb.setCharAt(i, '*');
                }
                else {
                   sb.setCharAt(i, '+');
                }
                
            }
        }
        return sb.toString();
    }
    public void emphTest(){
        String phrase = "Mary Bella Abracadabra";
        char ch = 'a';
        
        System.out.println(emphasize(phrase, ch));
    }

}
