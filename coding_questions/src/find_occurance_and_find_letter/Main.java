package find_occurance_and_find_letter;

public class Main {
  public static void main(String[] args) {
    Test test = new TestImpl();
    test.Initialize(new char[] {'a', 'a', 'b', 'b', 'c', 'a'});

    System.out.println("Occurrence of letter 'a' : " + test.FindOccurrence('a')); // 3
    System.out.println("Occurrence of letter 'b' : " + test.FindOccurrence('b')); // 2
    System.out.println("Occurrence of letter 'c' : " + test.FindOccurrence('c')); // 1

    System.out.println("Letter at position '0' : " + test.FindLetter(0)); // a
    System.out.println("Letter at position '3' : " + test.FindLetter(3)); // b
    System.out.println("Letter at position '5' : " + test.FindLetter(5)); // a
  }
}

