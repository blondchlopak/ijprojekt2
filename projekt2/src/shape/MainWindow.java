package shape;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainWindow extends JFrame{
    private JPanel MainPanel;
    private JPanel canvasPanel;
    private JPanel controlPanel;
    private JButton chooseColorButton;
    private JButton addShapeButton;
    private JButton clearButton;
    private JButton listOfShapesButton;
    private JButton closeButton;
    private JButton creditsButton;
    private JLabel CenterLabel;
    private JLabel ColorLabel;
    @SuppressWarnings("unchecked")


    public MainWindow() {

        chooseColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        addShapeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        listOfShapesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        creditsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(creditsButton,"Developed by MŻ","Credits",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ;
            }
        });
    }

}
