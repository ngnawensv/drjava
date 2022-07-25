import java.util.*;
public class Main1{
  List<String> list = Arrays.asList("A","B","C","D"); 
  static List<String> listes= Arrays.asList("C","B","A","D","E","F");
  public static void main(String...args){
    System.out.println(Main1.listes);
    Optional<String> op=Main1.listes.stream().sorted().findFirst();
    System.out.println(op);
    
    
  }
}