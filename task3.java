import java.util.*;
import java.util.ArrayList;

public class WeatherData{
  private ArrayList<Double> temperatures;
  /*public WeatherData(ArrayList<Double> temperatures){
    this.temperatures = temperatures;
  }*/
  public void cleanData(double lower,double upper){//a
    for(int i =0;i < temperatures.size();i++){
      if(temperatures.get(i)<lower || temperatures.get(i)>upper) temperatures.remove(i);
    }
  }
public int longestHeatWave(double threshold) {//b
    int c = 0;
    int max = 0;
    for (int i = 0; i < temperatures.size(); i++) {
        if (temperatures.get(i) > threshold) {
            c++;
            if (c > max) {
                max = c;
            }
        } else {
            c = 0;
        }
    }
    return max;
}
  /*public ArrayList<Double> getTemp(){
    return temperatures;
  }
  public static void main(String[] args){
    ArrayList<Double> temp = new ArrayList<Double>();
    ArrayList<Double> temp1 = new ArrayList<Double>();
    temp.add(99.1);
    temp.add(142.0);
    temp.add(85.0);
    temp.add(85.1);
    temp.add(84.6);
    temp.add(94.3);
    temp.add(124.9);
    temp.add(98.0);
    temp.add(101.0);
    temp.add(102.5);
    
    temp1.add(100.5);
    temp1.add(98.5);
    temp1.add(102.0);
    temp1.add(103.9);
    temp1.add(87.5);
    temp1.add(105.2);
    temp1.add(90.3);
    temp1.add(94.8);
    temp1.add(109.1);
    temp1.add(102.1);
    temp1.add(107.4);
    temp1.add(93.2);
    WeatherData a = new WeatherData(temp);
    WeatherData b = new WeatherData(temp1);
    System.out.println(a.getTemp());
    a.cleanData(85.0,120.0);
    System.out.println(a.getTemp());
    System.out.println(b.getTemp());
    System.out.println(b.longestHeatWave(100.5));
    System.out.println(b.longestHeatWave(95.2));
  }*/
}
