import javax.swing.*;
import java.awt.*;

public class InfoWindow extends JFrame{

       public InfoWindow(int timeToCook, int timeInOven, int numberOfLayers,int prepTime,int timeLeft, int totalTime){
           this.setTitle("Joan's Yummy Lasagna Preparation Info");


           JLabel jLabel2 = new javax.swing.JLabel();
           JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
           JTextArea jTextArea1 = new javax.swing.JTextArea();

           this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
           this.setLocationRelativeTo(null);
           this.setVisible(true);
           jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
           jLabel2.setText("Yummy Lasagna Info");

           jTextArea1.setColumns(20);
           jTextArea1.setLineWrap(true);
           jTextArea1.setRows(5);
           jTextArea1.setText(" Time it takes to cook the lasagna is : " + timeToCook
                   +" minutes. The lasagna has been in the oven for "+ timeInOven
                   + " minutes. You have added " + numberOfLayers
                   + " layers, that makes the preparation time " + prepTime
                   + " minutes(2 min per layer). Time left to cook is " + timeLeft +
                   " minutes. You have spent a total of " + totalTime + " minutes to prepare the lasagna.");
           jScrollPane1.setViewportView(jTextArea1);

           javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
           getContentPane().setLayout(layout);
           layout.setHorizontalGroup(
                   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                   .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                   .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addGap(56, 56, 56))
                           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                   .addContainerGap(20, Short.MAX_VALUE)
                                   .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addContainerGap(33, Short.MAX_VALUE))
           );
           layout.setVerticalGroup(
                   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                   .addGap(30, 30, 30)
                                   .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                   .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addContainerGap(32, Short.MAX_VALUE))
           );

           this.pack();
       }


       }
