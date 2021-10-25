import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.AbstractQueue;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class TicketGUI extends JFrame{
    private JPanel mainPanel;
    private JLabel startLabel;
    private JComboBox startComboBox;
    private JLabel endLabel;
    private JComboBox endComboBox;
    private JRadioButton a1;
    private JRadioButton a2;
    private JRadioButton a3;
    private JRadioButton a4;
    private JRadioButton a5;
    private JRadioButton a6;
    private JRadioButton a7;
    private JRadioButton a8;
    private JRadioButton a9;
    private JRadioButton a10;
    private JRadioButton a0;
    private JRadioButton c1;
    private JRadioButton c2;
    private JRadioButton c3;
    private JRadioButton c4;
    private JRadioButton c5;
    private JRadioButton c6;
    private JRadioButton c7;
    private JRadioButton c8;
    private JRadioButton c9;
    private JRadioButton c10;
    private JRadioButton c0;
    private JRadioButton oneWay;
    private JRadioButton roundTrip;
    private JButton BuyButton;


    public TicketGUI(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        ImageIcon icon = new ImageIcon("icon.jpg");
        this.setIconImage(icon.getImage());

        startComboBox.addItem("南港");
        startComboBox.addItem("台北");
        startComboBox.addItem("板橋");
        startComboBox.addItem("桃園");
        startComboBox.addItem("新竹");
        startComboBox.addItem("苗栗");
        startComboBox.addItem("台中");
        startComboBox.addItem("彰化");
        startComboBox.addItem("雲林");
        startComboBox.addItem("嘉義");
        startComboBox.addItem("台南");
        startComboBox.addItem("左營");

        endComboBox.addItem("南港");
        endComboBox.addItem("台北");
        endComboBox.addItem("板橋");
        endComboBox.addItem("桃園");
        endComboBox.addItem("新竹");
        endComboBox.addItem("苗栗");
        endComboBox.addItem("台中");
        endComboBox.addItem("彰化");
        endComboBox.addItem("雲林");
        endComboBox.addItem("嘉義");
        endComboBox.addItem("台南");
        endComboBox.addItem("左營");

        ButtonGroup TicketType = new ButtonGroup();
        TicketType.add(oneWay);
        TicketType.add(roundTrip);

        ButtonGroup Adult = new ButtonGroup();
        Adult.add(a0);
        Adult.add(a1);
        Adult.add(a2);
        Adult.add(a3);
        Adult.add(a4);
        Adult.add(a5);
        Adult.add(a6);
        Adult.add(a7);
        Adult.add(a8);
        Adult.add(a9);
        Adult.add(a10);

        ButtonGroup Children = new ButtonGroup();
        Children.add(c0);
        Children.add(c1);
        Children.add(c2);
        Children.add(c3);
        Children.add(c4);
        Children.add(c5);
        Children.add(c6);
        Children.add(c7);
        Children.add(c8);
        Children.add(c9);
        Children.add(c10);

        BuyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int adult, children = 0;
                String[] ticketType ={"單程票","去回票"};
                int choice = 0;

                if(a1.isSelected()){
                    adult=1;
                }else if(a2.isSelected()){
                    adult=2;
                }else if(a3.isSelected()){
                    adult=3;
                }else if(a4.isSelected()){
                    adult=4;
                }else if(a5.isSelected()){
                    adult=5;
                }else if(a6.isSelected()){
                    adult=6;
                }else if(a7.isSelected()){
                    adult=7;
                }else if(a8.isSelected()){
                    adult=8;
                }else if(a9.isSelected()){
                    adult=9;
                }else if(a10.isSelected()){
                    adult=10;
                }else{
                    adult=0;
                }

                if(c1.isSelected()){
                    children=1;
                }else if(c2.isSelected()){
                    children=2;
                }else if(c3.isSelected()){
                    children=3;
                }else if(c4.isSelected()){
                    children=4;
                }else if(c5.isSelected()){
                    children=5;
                }else if(c6.isSelected()){
                    children=6;
                }else if(c7.isSelected()){
                    children=7;
                }else if(c8.isSelected()){
                    children=8;
                }else if(c9.isSelected()){
                    children=9;
                }else if(c10.isSelected()){
                    children=10;
                }else{
                    children=0;
                }

                if(oneWay.isSelected()){
                    choice=0;
                }else {
                    choice=1;
                }

                    JOptionPane.showMessageDialog(mainPanel,"您要訂的是\n出發站：" +startComboBox.getSelectedItem()
                        +"\n到達站：" +endComboBox.getSelectedItem()
                        +"\n票種：" +ticketType[choice]
                        +"\n成人："+ adult
                        +"\n孩童："+ children,"訂票結果", INFORMATION_MESSAGE, new ImageIcon("src/icon.jpg")
                );

                System.out.println(startComboBox.getSelectedItem()+"到"+endComboBox.getSelectedItem());
                System.out.println("票種："+ticketType[choice]);
                System.out.println("成人："+adult);
                System.out.println("孩童："+children);

            }
        });

    }
    public static void main(String[] args){
        JFrame frame = new TicketGUI("高鐵訂票系統");
        frame.setVisible(true);

    }



}
