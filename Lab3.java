public class Lab3 {

  public static void main(String[] args) {

    String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    
    // Best-case: matches immediately at index 0
    String bestCase = "A";

    long startTime = System.nanoTime();   // start timing
    int index = match(text, bestCase);
    long endTime = System.nanoTime();     // end timing
    long elapsedTime = endTime - startTime;

    System.out.println("Best-case elapsed time: " + elapsedTime + " nanoseconds");

    if (index >= 0)
      System.out.println("best-case input matched at index " + index);
    else
      System.out.println("best-case input unmatched");   


    // Worst-case: forces maximum comparisons before failing
    String worstCase = "0123456789X";

    startTime = System.nanoTime();        // start timing
    index = match(text, worstCase);
    endTime = System.nanoTime();          // end timing
    elapsedTime = endTime - startTime;

    System.out.println("Worst-case elapsed time: " + elapsedTime + " nanoseconds");

    if (index >= 0)
      System.out.println("worst-case input matched at index " + index);
    else
      System.out.println("worst-case input unmatched");  
  }


  // Return the index of the first match. -1 otherwise.
  public static int match(String text, String pattern) {
    for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
      if (isMatched(i, text, pattern))
        return i;
    }

    return -1;
  }
	
  // Test if pattern matches text starting at index i
  private static boolean isMatched(int i, String text, String pattern) {
    for (int k = 0; k < pattern.length(); k++) {
      if (pattern.charAt(k) != text.charAt(i + k)) {
        return false;
      }
    }
    
    return true;
  }
}