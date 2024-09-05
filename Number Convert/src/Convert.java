import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Convert extends JFrame {
    final String[] SelectionBox = {"Decimal to Binary", "Decimal to Octal", "Decimal to Hexadecimal", "Binary to Decimal", "Binary to Octal", "Binary to Hexadecimal"};
    JComboBox<String> selectionBox;
    JButton convertBtn;
    JTextField fromText, toText;

    public Convert() {
        super("Number Converter");

        Border border = BorderFactory.createLineBorder(Color.black, 2);
        JLabel header = new JLabel("Number Converter");
        header.setForeground(new Color(0, 0, 130));
        header.setFont(new Font("PingFang SC", Font.BOLD, 26));
        header.setBounds(270, 30, 300, 50);
        header.setHorizontalAlignment(SwingConstants.CENTER);
        add(header);


//  FROM :
        JLabel fromNum = new JLabel("From >>");
        fromNum.setOpaque(true);
        fromNum.setHorizontalAlignment(SwingConstants.CENTER);
        fromNum.setForeground(new Color(255, 255, 255));
        fromNum.setBackground(new Color(0, 0, 130));
        fromNum.setBounds(120, 140, 140, 30);
        fromNum.setFont(new Font("Arial", Font.BOLD, 20));
        add(fromNum);

        selectionBox = new JComboBox<>(SelectionBox);
        selectionBox.setBounds(300, 200, 236, 30);
        selectionBox.setFont(new Font("Kodchasan", Font.PLAIN, 18));
        add(selectionBox);

        fromText = new JTextField();
        fromText.setBounds(46, 280, 300, 30);
        fromText.setFont(new Font("Arial", Font.PLAIN, 18));
        add(fromText);

//  TO :
        JLabel toNum = new JLabel(">> To");
        toNum.setOpaque(true);
        toNum.setHorizontalAlignment(SwingConstants.CENTER);
        toNum.setForeground(new Color(255, 255, 255));
        toNum.setBackground(new Color(0, 0, 130));
        toNum.setBounds(580, 140, 140, 30);
        toNum.setFont(new Font("Arial", Font.BOLD, 20));
        add(toNum);


        toText = new JTextField();
        toText.setBounds(500, 280, 300, 30);
        toText.setFont(new Font("Arial", Font.PLAIN, 18));
        toText.setEditable(false);
        add(toText);

        
        convertBtn = new JButton("Convert");
        convertBtn.setForeground(new Color(0, 0, 130));
        convertBtn.addActionListener(e -> convert());
        convertBtn.setBounds(348, 400, 160, 40);
        convertBtn.setFont(new Font("Kodchasan", Font.BOLD, 20));
        add(convertBtn);

        setLayout( null);
        setResizable(false);
        convertBtn.setBorder(border);
        setSize(850,600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void convert() {
        String input = fromText.getText();
        String type = (String) selectionBox.getSelectedItem();

        if (type.equals("Decimal to Binary")) {
            try {
                int decimal = Integer.parseInt(input);
                String binary = Integer.toBinaryString(decimal);
                toText.setText(binary);
            } catch (Exception e) {
                toText.setText("Enter a valid input");
            }
        } else if (type.equals("Decimal to Octal")) {
           try{
                int decimal = Integer.parseInt(input);
                String octal = Integer.toOctalString(decimal);
                toText.setText(octal);
           }catch (Exception e) {
               toText.setText("Enter a valid input");
           }
        } else if (type.equals("Decimal to Hexadecimal")) {
            try{
                int decimal = Integer.parseInt(input);
                String hex = Integer.toHexString(decimal);
                toText.setText(hex);
            }catch (Exception e) {
                toText.setText("Enter a valid input");
            }
        } else if (type.equals("Binary to Decimal")) {
            try{
                int binary = Integer.parseInt(input, 2);
                String decimal = String.valueOf(binary);
                toText.setText(decimal);
            }catch (Exception e) {
                toText.setText("Enter a valid input");
            }
        } else if (type.equals("Binary to Octal")) {
            try{
                int binary = Integer.parseInt(input, 2);
                String octal = Integer.toOctalString(binary);
                toText.setText(octal);
            }catch (Exception e) {
                toText.setText("Enter a valid input");
            }
        }else if (type.equals("Binary to Hexadecimal")) {
            try{
                int binary = Integer.parseInt(input, 2);
                String hex = Integer.toHexString(binary);
                toText.setText(hex);
            }catch (Exception e) {
                toText.setText("Enter a valid input");
            }
        }

    }

    public static void main(String[] args) {
        new Convert();
    }
}
