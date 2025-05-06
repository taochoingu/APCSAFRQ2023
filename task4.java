import java.util.*;
import java.util.ArrayList;

class Candy{
  public String getFlavor(){
    
  }
}
public class BoxOfCandy{
  private Candy[][] box;
  public boolean moveCandyToFirstRow(int col){
    if(box[0][col]!= null) return true;
    else{
      for(int i = 1; i < box.length;i++){
        if(box[i][col] != null){
          box[0][col] = box[i][col];
          box[i][col] = null;
          return true;
        }
      }
      return false;
    }
  }
  public Candy removeNextByFlavor(String flavor){
    for(int i = box.length -1;i >= 0;i--){
      for(int j = 0; j<box[0].length;j++){
        if(box[i][j].getFlavor.equals(flavor)){
          box[i][j] = null;
          return box[i][j];
        }
      }
    }
    return null;
  }
}
