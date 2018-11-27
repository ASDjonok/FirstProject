import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GraphicalMain {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("My Super Program!!!"){
            @Override
            public void paint(Graphics g) {
                super.paint(g);
//                g.drawLine(0,20,100,300);
                for (int i = 0; i < 6; i++) {
                    g.drawOval(20 + (10 + 50) * i, 80, 50, 50);
                    g.fillOval(30 + (10 + 50) * i, 100, 10, 10);
                    g.fillOval(50 + (10 + 50) * i, 110, 12, 12);
                    g.fillOval( 50 + (10 + 50) * i, 90, 13, 13);
                    g.fillOval( 30 + (10 + 50) * i, 85, 14, 12);
                    g.drawOval(20 + (10 + 50) * i, 180, 50, 50);
                }
            }
        };
        jFrame.setSize(400, 300);
        jFrame.setLocation(500, 200);

       /* jFrame.setLayout(null);
        JLabel jLabel = new JLabel("My Super Label");
        jLabel.setLocation(10, 10);
        jLabel.setSize(100, 20);
        jFrame.add(jLabel*//*, BorderLayout.NORTH*//*);

        JTextField jTextField = new JTextField();
        jTextField.setSize(160, 40);
        jTextField.setLocation(30, 80);
        jFrame.add(jTextField);

        JButton jButton = new JButton("Push Me!");
        jButton.setSize(160, 40);
        jButton.setLocation(30, 40);
        jFrame.add(jButton);
        jButton.addActionListener(e -> jLabel.setText(jTextField.getText()));
*/
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
