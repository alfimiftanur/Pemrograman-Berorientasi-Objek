package latihan21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tugas extends JFrame implements ActionListener {
    private JTextField textField1, textField2;
    private JLabel label;
    private JButton button;

    public Tugas(){
        label = new JLabel();
        label.setText("Masukkan angka di bawah ini untuk melakukan pertamabahan:");
        textField1 = new JTextField();
        textField2 = new JTextField();
        button = new JButton("Jumlah");
        button.addActionListener(this);

        setLayout(new GridLayout(4, 1));
        add(label);
        add(textField1);
        add(textField2);
        add(button);

        setTitle("Menghitung");
        setVisible(true);
        setSize(400, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int angka1 = Integer.parseInt(textField1.getText());
        int angka2 = Integer.parseInt(textField2.getText());
        int hasil = angka1 + angka2;

        JOptionPane.showMessageDialog(this, "Jumlah: "+ hasil);
    }
}
