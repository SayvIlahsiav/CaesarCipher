
/**
 * Write a description of WordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordPlay {
    
    public boolean isVowel(char ch) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char v : vowels) {
            if (Character.toLowerCase(ch) == v)
                return true;    
        }
        return false;
    }
    
    public void testIsVowel() {
        System.out.println(isVowel('F'));
        System.out.println(isVowel('f'));
        System.out.println(isVowel('a'));
        System.out.println(isVowel('A'));
    }
    
    public static void main(String[] args) {
        WordPlay wp = new WordPlay();
        wp.testIsVowel();
    }

}
