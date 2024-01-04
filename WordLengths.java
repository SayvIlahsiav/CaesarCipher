import edu.duke.*;
/**
 * Write a description of WordLengths here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordLengths {
    public void countWordLengths(FileResource resource, int[] counts) {
        for (String word : resource.words()) {
            int letterCount = 0;
            for (char ch : word.toCharArray()) {
                if (Character.isLetter(ch)) {
                    letterCount++;
                }
            }
            if (letterCount < counts.length) {
                counts[letterCount]++;
            } else {
                counts[counts.length - 1]++;
            }
        }
    }
    
    public void testCountWorldLengths() {
        FileResource resource = new FileResource();
        int[] counts = new int[31];
        countWordLengths(resource, counts);
        System.out.println("Length\tCount");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] !=0){
                System.out.println(i + "\t" + counts[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        WordLengths wl = new WordLengths();
        wl.testCountWorldLengths();
    }
}
