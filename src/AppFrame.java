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
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Joan's Yummy Lasagna");
        this.setLayout(new FlowLayout());
        this.setPreferredSize(new Dimension(450,250));
        button = new JButton("Submit");
        button.addActionListener(this);

        JLabel minutesLabel = new JLabel("How many minutes has the lasagna been in the oven");
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(100,40));
        JLabel layerLabel = new JLabel("How many layers are in the lasagna");
        textField2 = new JTextField();
        textField2.setPreferredSize((new Dimension(100,40)));




        this.add(minutesLabel);
        this.add(textField);
        this.add(layerLabel);
        this.add(textField2);
        this.add(button);
        this.pack();
        this.setLocationRelativeTo(null);
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
