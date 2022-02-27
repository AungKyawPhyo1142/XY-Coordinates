
package xy.coordinates;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    
  public static  int WIDTH = 700;
  public static  int HEIGHT = 700;
    
    //x 310,y 10
    
 public static int[][]point;
 public static int[][]show = MainFrame.draw_points;
    
    public static int row=0;
    
 public static int x0 = WIDTH/2;
 public static int y0 = HEIGHT/2;

    
    public DrawPanel() {
        
        
    
        
    }
    
    
    public void paint(Graphics g) {
    //    repaint();
        
        // X Y Line
        
        g.setColor(Color.black);
        g.drawLine(50,y0,WIDTH-50,y0); // x-axis
        g.drawLine(x0,50,x0,HEIGHT-50); // y-axis

 
                /* Numbers */
        
        g.setColor(Color.black);

        int StringX=50;
        
        for (int i=-10;i<=10;i++) {
            
        
            g.drawString(""+i, StringX, y0+15);
        
            StringX+=30;
  //      repaint();
        }

                int StringY=650;
        
        for (int i=-10;i<=10;i++) {
            
        
            g.drawString(""+i, x0+15, StringY);
        
            StringY-=30;
//       repaint();
        }
        
        /*
        
        If you want to go Up -y
        If you want to go Down +y
        
        */


        draw(g);
        
    }

    public static void changePoints(int[][]p,int r) {
    
        row = r;
        
        for (int i=0;i<row;i++) {

        p[i][0] = p[i][0] * 30;
        p[i][1] = (-1) * p[i][1] * 30;

        }//i


        for (int i=0;i<row;i++) {

        p[i][0] = x0+p[i][0];
        p[i][1] = y0+p[i][1];

        }

        
        point = new int[row][2];
        
        for (int i=0;i<row;i++) {
            
            point[i][0] = p[i][0];
            point[i][1] = p[i][1];
            
        }
        
        
        
    }

    
    public static void draw(Graphics g) {

for (int i=0;i<row;i++) {

    g.setColor(Color.BLACK);
    
g.fillOval(point[i][0],point[i][1],5,5); // draw all the points

g.drawString("Point "+(i+1),point[i][0]+15,point[i][1]);

if (i==row-1) { 
    

    break; }

else { g.setColor(Color.RED);
        g.drawLine(point[i][0],point[i][1],point[i+1][0],point[i+1][1]); }


}



/*
for (int i=0;i<show.length;i++) {

g.drawString("Point "+(i+1)+" : ("+show[i][0]+","+show[i][1]+")",SX,SY);
SY+=15;

}
*/
        
    }
    
}
