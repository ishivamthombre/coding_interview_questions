public class StringExample {
  public static void main(String[] args) {
    String s1 = "java";              // String literal, stored in String Constant Pool
    String s2 = new String("java");  // New object, stored in heap memory
    String s3 = s2.intern();         // Returns the reference from the String Constant Pool
    System.out.println(s1 == s3);    // true: both refer to the same pooled string
    System.out.println(s1.equals(s3)); // true: content is the same
    System.out.println(s1 == s2);    // false: s2 is a heap object
    System.out.println(s1.equals(s2)); // true: content is the same

  }
}
