import edu.duke.*;
import java.util.Scanner;

/**
 * Write a description of CaesarCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaesarCipher {
    public String encrypt(String input, int key) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder encrypted = new StringBuilder(input);
        String encryptedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);
        for(int i = 0; i < encrypted.length(); i++) {
            char currChar = encrypted.charAt(i);
            int idx = alphabet.indexOf(Character.toUpperCase(currChar));
            if (idx != -1) {
                char newChar = encryptedAlphabet.charAt(idx);
                if(Character.isUpperCase(encrypted.charAt(i))) {
                    newChar = Character.toUpperCase(newChar);
                }
                else {
                    newChar = Character.toLowerCase(newChar);
                }
                encrypted.setCharAt(i, newChar);
            }
        }
        return encrypted.toString();
    }
    
    public void testEncrypt() {
        //System.out.println( encrypt("FIRST LEGION ATTACK EAST FLANK!", 23));
        //System.out.println( encrypt("First Legion", 23));
        //System.out.println( encrypt("First Legion", 17));
        FileResource fr = new FileResource();
        String message = fr.asString();
        Scanner input = new Scanner(System.in);
        int key = input.nextInt();
        String encrypted = encrypt(message, key);
        System.out.println("key is " + key + "\n" + encrypted);
    }
    
    public static void main(String[] args) {
        CaesarCipher cc = new CaesarCipher();
        cc.testEncrypt();
    }

}
