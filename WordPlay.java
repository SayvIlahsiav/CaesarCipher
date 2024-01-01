
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
    
    public String replaceVowels(String phrase, char ch) {
        StringBuilder replaced = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            if (isVowel(phrase.charAt(i))) {
                replaced.append(ch);
            }
            else replaced.append(phrase.charAt(i));
        }
        return replaced.toString();
    }
    
    public String emphasize(String phrase, char ch) {
        StringBuilder emphasized = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            if (Character.toLowerCase(phrase.charAt(i)) == Character.toLowerCase(ch)) {
                if (i%2 == 0) emphasized.append('*');
                else emphasized.append('+');
            }
            else emphasized.append(phrase.charAt(i));
        }
        return emphasized.toString();
    }
    
    public void testIsVowel() {
        System.out.println(isVowel('F'));
        System.out.println(isVowel('f'));
        System.out.println(isVowel('a'));
        System.out.println(isVowel('A'));
    }
    
    public void testReplaceVowels() {
        System.out.println(replaceVowels("Hello World", '*'));
        System.out.println(replaceVowels("Hello World", 'y'));
    }
    
    public void testEmphasize() {
        System.out.println(emphasize("Hello World", 'o'));
        System.out.println(emphasize("Hello World", 'l'));
        System.out.println(emphasize("dna ctgaaactga", 'a'));
        System.out.println(emphasize("Mary Bella Abracadabra", 'a'));
    }
    
    public static void main(String[] args) {
        WordPlay wp = new WordPlay();
        wp.testEmphasize();
    }

}
