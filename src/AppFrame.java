import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppFrame extends JFrame implements ActionListener {
    private JButton button;
    private JTextField textField;
    private JTextField textField2;

    private int minutesInOven;
    private int numberOfLayers;

    public int getMinutesInOven() {
        return minutesInOven;
    }

    public void setMinutesInOven(int minutesInOven) {
        this.minutesInOven = minutesInOven;
    }

    public int getNumberOfLayers() {
        return numberOfLayers;
    }

    public void setNumberOfLayers(int numberOfLayers) {
        this.numberOfLayers = numberOfLayers;
    }

    public AppFrame(){
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setTitle("Joan's Yummy Lasagna");
//        this.setLayout(new FlowLayout());
//        this.setPreferredSize(new Dimension(450,250));
//        button = new JButton("Submit");
//        button.addActionListener(this);
//
//        JLabel minutesLabel = new JLabel("How many minutes has the lasagna been in the oven");
//        textField = new JTextField();
//        textField.setPreferredSize(new Dimension(100,40));
//        JLabel layerLabel = new JLabel("How many layers are in the lasagna");
//        textField2 = new JTextField();
//        textField2.setPreferredSize((new Dimension(100,40)));
//
//
//
//
//        this.add(minutesLabel);
//        this.add(textField);
//        this.add(layerLabel);
//        this.add(textField2);
//        this.add(button);
//        this.pack();
//        this.setLocationRelativeTo(null);
//        this.setVisible(true);
        JLabel jLabel1 = new javax.swing.JLabel();
        JLabel jLabel2 = new javax.swing.JLabel();
        textField = new javax.swing.JTextField();
        textField2 = new javax.swing.JTextField();
        JLabel jLabel3 = new javax.swing.JLabel();
        button = new javax.swing.JButton();
        button.addActionListener(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("How many minutes has the lasagna been in the oven?");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Joan's Yummy Lasagna");

        textField.setText("Minutes");
        textField2.setText("Layers");
        jLabel3.setText("How many layers are in the lasagna?");
        button.setText("Submit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(69, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(56, 56, 56))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(button)
                                                .addGap(160, 160, 160))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button)
                                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        this.setTitle("Joan's Yummy Lasagna");
        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            int tmpMin = Integer.parseInt(textField.getText());
            System.out.println(tmpMin);
            int tmpLayer = Integer.parseInt(textField2.getText());
            System.out.println(tmpLayer);
            this.setMinutesInOven(tmpMin);
            this.setNumberOfLayers(tmpLayer);
            Kitchen kitchen = new Kitchen();
            int timeleft = kitchen.remainingMinutesInOven(tmpMin);
            int prepTime = kitchen.preparationTimeInMinutes(tmpLayer);
            int totalTime = kitchen.totalTimeInMinutes(tmpLayer,tmpMin);
            InfoWindow infoWindow = new InfoWindow
                    (kitchen.EXPECTED_MINUTES_IN_OVEN,tmpMin,tmpLayer,prepTime,timeleft,totalTime);
        }

    }
}
