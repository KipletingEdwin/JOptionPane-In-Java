import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        //JOptionPane =  pop up a standard dialog box that prompts the user for a value
         //                or informs them of something

        //JOptionPane.showMessageDialog(null,"This is some useless info", "title",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is some useless info", "title",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is some useless info", "title",JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is some useless info", "title",JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is some useless info", "title",JOptionPane.ERROR_MESSAGE);

        //JOptionPane.showConfirmDialog(null,"Bro,do you even code?","This is my title",JOptionPane.YES_NO_CANCEL_OPTION);
       // String  name = JOptionPane.showInputDialog("What is your name?");
       // System.out.println("Hello "+ name);

        String[] responses = {"No, you're awesome","thank you","*blush*"};
        ImageIcon icon = new ImageIcon("smile.jpeg");

        JOptionPane.showOptionDialog(null,"You are awesome!","secret message",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,icon,null,0);


    }
}