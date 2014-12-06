package d;

import java.awt.*;
import java.math.*;
import java.text.*;
import javax.swing.*;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFormattedTextField.AbstractFormatterFactory;
import javax.swing.text.InternationalFormatter;

public class CaretPositionListener {

    public CaretPositionListener() {
        JFrame frame = new JFrame("AbstractTextField Test");
        final JFormattedTextField textField1 = new JFormattedTextField(new Float(10.01));
        textField1.setFormatterFactory(new AbstractFormatterFactory() {
            @Override
            public AbstractFormatter getFormatter(JFormattedTextField tf) {
                NumberFormat format = DecimalFormat.getInstance();
                format.setMinimumFractionDigits(2);
                format.setMaximumFractionDigits(2);
                format.setRoundingMode(RoundingMode.HALF_UP);
                InternationalFormatter formatter = new InternationalFormatter(format);
                formatter.setAllowsInvalid(false);
                formatter.setMinimum(0.0);
                formatter.setMaximum(1000.00);
                return formatter;
            }
        });
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setRoundingMode(RoundingMode.HALF_UP);
        final JFormattedTextField textField2 = new JFormattedTextField(numberFormat);
        textField2.setValue(new Float(10.01));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(textField1, BorderLayout.EAST);
        frame.add(textField2, BorderLayout.SOUTH);
        frame.setVisible(true);
        frame.pack();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CaretPositionListener();
            }
        });
    }
}