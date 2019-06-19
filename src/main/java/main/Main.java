package main;

public class Main {
  private final String codeword;

  public Main(String codeword) {
    this.codeword = codeword;
  }

  public String getCodeword() {
    if (codeword != null) {
      return codeword;
    } else {
      return "codeword is null";
    }
  }
}
