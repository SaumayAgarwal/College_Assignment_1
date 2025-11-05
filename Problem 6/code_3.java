class solution {


  public static void main(String[] args) {
    String str = "Hello I am Saumay";
    int n = str.length();
    int spaces = 0;

    for (int i = 0; i < n; i++) {
      if (str.charAt(i) == ' ')
        spaces = spaces + 1;
    }

    System.out.print("Number of words are ");
    System.out.print(spaces + 1);
  }
}
