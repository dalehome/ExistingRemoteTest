/**
  *  Print out all Java System Properties
  */
  
  public class JavaProps {
    public static void main(String[] args) {
      System.out.println("\nList of all Java System Properties");
      System.out.println("==================================\n");
      System.getProperties().list(System.out);
    }
  }
