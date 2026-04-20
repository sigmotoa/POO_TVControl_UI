package Control;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control_UI {
    private JProgressBar volProgress;
    private JPanel mainPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel vol_text;
    private JComboBox<InputSourceTV> comboBoxInput;
    private JLabel inputSource;

    public int vol = 0;

    public Control_UI() {

        volProgress.setMinimum(0);
        volProgress.setMaximum(10);
        volProgress.setValue(vol);
        comboBoxInput.setModel(new DefaultComboBoxModel<>(InputSourceTV.values()));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                vol = vol - 1;
                vol_text.setText(String.valueOf(vol));
                volProgress.setValue(vol);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vol = vol + 1;
                vol_text.setText(String.valueOf(vol));
                volProgress.setValue(vol);
            }
        });
        comboBoxInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputSourceTV selected = (InputSourceTV) comboBoxInput.getSelectedItem();
                inputSource.setText(selected.name());

                switch (selected)
                {
                    case AV -> inputSource.setForeground(Color.BLACK);
                    case Netflix -> inputSource.setForeground(Color.BLUE);
                    case HBO -> inputSource.setForeground(Color.RED);
                    case Youtube -> inputSource.setForeground(Color.GREEN);
                    case RTVC -> inputSource.setForeground(Color.YELLOW);
                    case HDMI -> inputSource.setForeground(Color.CYAN);
                    case WIFI -> inputSource.setForeground(Color.PINK);
                }

            }
        });
    }
        public JPanel getMainPanel()
        {
            return mainPanel;
        }


}



