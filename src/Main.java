import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //JOptionPane =  pop up a standard dialog box that prompts the user for a value
         //                or informs them of something

        //JOptionPane.showMessageDialog(null,"This is some useless info", "title",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is some useless info", "title",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is some useless info", "title",JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is some useless info", "title",JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is some useless info", "title",JOptionPane.ERROR_MESSAGE);

        JOptionPane.showConfirmDialog(null,"Bro,do you even code?","This is my title",JOptionPane.YES_NO_CANCEL_OPTION);

    }
}