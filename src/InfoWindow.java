import javax.swing.*;
import java.awt.*;

public class InfoWindow extends JFrame{

       public InfoWindow(int timeToCook, int timeInOven, int numberOfLayers,int prepTime,int timeLeft, int totalTime){
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.setTitle("Joan's Yummy Lasagna Preparation Info");
           this.setLayout(new FlowLayout());
           JLabel label = new JLabel("Time to cook the lasagna is: " + timeToCook
                   +"m The lasagna has been in the oven for "+ timeInOven
                   + "m You have added " + numberOfLayers
                   + "layers that makes the preparation time " + prepTime
                   + "m time left to cook is " + timeLeft +
                   "m. You have spend a total of " + totalTime + " minutes to prepare.");


           this.add(label);
           this.pack();
           this.setLocationRelativeTo(null);
           this.setVisible(true);


       }
}
