//Pham Viet Hai 20215044

package lab_01;

import javax.swing.JOptionPane;

public class TwoDoubles {

    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You just entered: ";

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum, diff, product, quo;
        sum = num1 + num2;
        diff = num1 - num2;
        product = num1 * num2;
        quo = num1 / num2;

        String strSum = Double.toString(sum);
        String strDiff = Double.toString(diff);
        String strProduct = Double.toString(product);
        String strQuo = Double.toString(quo);

        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Sum: " + strSum +
                "\nDifference: " + strDiff +
                "\nProduct: " + strProduct +
                "\nQuotient: " + strQuo);
        System.exit(0);
    }
}
