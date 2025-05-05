import java.util.*;

public class Sign {
  private String message;
  private int width;
  public Sign(String message, int width){
      this.message = message;
      this.width = width;
  }
  public int numberOfLine(){
    if(message.length() % width == 0) return (message.length() / width);
    return message.length() / width +1;
  }
  public String getLines(){
    if(message.length() == 0) return null;
    String a = message;
    String temp = "";
    while(a.length()>width){
      temp = temp + a.substring(0,width) + ";" ;
      a = a.substring(width);
    }
    temp = temp + a;
    return temp;
    }
    /*public static void main(String[] args){
      String str;
      int x;
      Sign sign1 = new Sign("ABC222DE",3);
      System.out.println(sign1.numberOfLine());
      System.out.println(sign1.getLines());
    }*/
  }
  
