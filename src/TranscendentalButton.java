import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * this is the TranscendentalButton class.
 */
class TranscendentalButton extends JButton implements ActionListener {
    Calculator calculator;

    /**
     * parameterized constructor for TranscendentalButton.
     * @param x the x-coordinate of the button's position on the screen.
     * @param y the y-coordinate of the button's position on the screen.
     * @param width the width of the button.
     * @param height the height of the button.
     * @param label the label text displayed on the button.
     * @param calc the Calculator instance with which this button will be associated.
     */
    public TranscendentalButton(int x, int y, int width, int height, String label, Calculator calc) {
        super(label);
        setBounds(x, y, width, height);
        setMargin(new Insets(0, 0, 0, 0));
        this.calculator = calc;
        this.calculator.add(this);
        addActionListener(this);
    }

    //put all transcendental function implementation here **PLEASE SHOW YOUR IMPLEMENTATION WITH YOUR REVIEWER BEFORE MAKING A PULL REQUEST**
    /**
     * this method processes an action event triggered by a user interface component.
     * @param e the event to be processed.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String transcendentalText = ((TranscendentalButton) e.getSource()).getText();
        double value = Double.parseDouble(calculator.displayLabel.getText()), result;

        try {
            switch(transcendentalText) {
                case "st.dev":
//                    result = calculator.functions.standardDeviation(value);
//                    calculator.displayLabel.setText(Calculator.getFormattedText(result));
                    break;
                case "x^y":
//                    result = calculator.functions.xPowerY(value);
//                    calculator.displayLabel.setText(Calculator.getFormattedText(result));
                    break;
                case "(ab)^x":
//                    result = calculator.functions.powerOfProduct(value);
//                    calculator.displayLabel.setText(Calculator.getFormattedText(result));
                    break;
                case "mad":
//                    result = calculator.functions.meanAbsoluteDeviation(value);
//                    calculator.displayLabel.setText(Calculator.getFormattedText(result));
                    break;
                case "arccos(x)":
                    result = calculator.functions.arcCosX(value);
                    calculator.displayLabel.setText(Calculator.getFormattedText(result));
                    break;
                case "log_b(x)":
//                    result = calculator.functions.logarithm(value);
//                    calculator.displayLabel.setText(Calculator.getFormattedText(result));
                    break;
                case "sinh(x)":
//                    result = calculator.functions.logarithm(value);
//                    calculator.displayLabel.setText(Calculator.getFormattedText(result));
                    break;
            }
        } catch (IllegalArgumentException err) { calculator.displayLabel.setText(err.getMessage());
        } catch(Exception err) { calculator.displayLabel.setText("An error occurred: " + err.getMessage()); }
    }
}