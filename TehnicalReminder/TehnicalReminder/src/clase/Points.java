/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author HP
 */
public class Points {
    
    
    
    public  String type = null;
    public   int x1 = 0,y1=0;
    public  int x2 = 0,y2=0;
    
    public void setType(String name) {
        type = name;
    }
    
    public void setx1y1(int v1,int v2) {
        x1=v1;
        y1=v2;
    }
    
    public void setx2y2(int v1,int v2) {
       x2=v1;
       y2=v2;
    }
    
    public String getType(){
        return type;
    }
    public int getx1(){
        return x1;
    }
     public int gety1(){
        return y1;
    }
      public int getx2(){
        return x2;
    }
       public int gety2(){
        return y2;
    }

    
}
