package find_occurance_and_find_letter;

public class TestImpl implements Test {

  private final int[] frequency = new int[26];      // stores frequency of each letter (a-z)
  private final char[] indexToChar = new char[1000]; // stores letters by index position
  private int indexCount = 0;                 // tracks current insertion index

  @Override public void Initialize(char[] array) {
    // Manually initialize frequency to 0
    for (int i = 0; i < 26; i++) {
      frequency[i] = 0;
    }

    // Build frequency table and indexed char array
    for (char c : array) {
      int idx = c - 'a';
      frequency[idx]++;

      // Store the character in order
      indexToChar[indexCount++] = c;
    }
  }

  @Override public int FindOccurrence(char input) {
    return frequency[input - 'a'];
  }

  @Override public char FindLetter(int input) {
    // Input assumed to be valid
    return indexToChar[input];
  }
}

