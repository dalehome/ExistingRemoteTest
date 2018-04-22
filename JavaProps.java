/**
  *  Print out all Java System Properties
  */
  
  public class JavaProps {
    public static void main(String[] args) {
      System.getProperties().list(System.out);
    }
  }
