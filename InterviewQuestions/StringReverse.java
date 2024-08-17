package InterviewQuestions;

public class StringReverse {
  public static void main(String[] args) {

    // first way to reverse the string
    String name = "hello";
    String revString = "";
    for (int i = name.length() - 1; i >= 0; i--) {
      revString += name.charAt(i);
    }
    System.out.print(revString);

    // second way to reverse the string

    String rString = new StringBuilder(name).reverse().toString();
    System.out.print(rString);

  }

}
