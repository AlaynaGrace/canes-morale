import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 * Created by alayn on 10/9/2016.
 */

public class Morale extends JPanel implements WindowListener,ActionListener {

    public void actionPerformed(ActionEvent event){
        String morale = ""; //gets mad if I don't do this
        if("1".equals(event.getActionCommand())){
            //If the command is 1 then morale = 1 and basically same for everything else
            morale = "1";
        }
        if("2".equals(event.getActionCommand())){
            morale = "2";
        }
        if("3".equals(event.getActionCommand())){
            morale = "3";
        }
        if("4".equals(event.getActionCommand())){
            morale = "4";
        }
        if("5".equals(event.getActionCommand())){
            morale = "5";
        }
        Date date = new Date(); //need this to get the date
        PrintWriter p = null;
        try {
            p = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/alayn/Documents/morale.txt",true))); //have to change this
        } catch (Exception e){}//Need a try catch because if the file isn't there we are in trouble
        p.println(morale +","+date.toString()+"\n");//Writes to file
        p.close(); //have to close the file otherwise we lose everything
        System.exit(0);//Closes the window after the file has been written so we don't lose what morale is
    }
    public Morale(){
        //Change paths
        ImageIcon i1 = new ImageIcon("C:/Users/alayn/Downloads/heads1.jpg");
        ImageIcon i2 = new ImageIcon("C:/Users/alayn/Downloads/heads2.jpg");
        ImageIcon i3 = new ImageIcon("C:/Users/alayn/Downloads/heads3.jpg");
        ImageIcon i4 = new ImageIcon("C:/Users/alayn/Downloads/heads4.jpg");
        ImageIcon i5 = new ImageIcon("C:/Users/alayn/Downloads/heads5.jpg");

        JButton b1 = new JButton(i1);//creates a button
        b1.setActionCommand("1"); //This is what sets the command so that the above method works properly
        b1.addActionListener(this); //Have to listen to it otherwise it won't work

        JButton b2 = new JButton(i2);
        b2.setActionCommand("2");
        b2.addActionListener(this);

        JButton b3 = new JButton(i3);
        b3.setActionCommand("3");
        b3.addActionListener(this);

        JButton b4 = new JButton(i4);
        b4.setActionCommand("4");
        b4.addActionListener(this);

        JButton b5 = new JButton(i5);
        b5.setActionCommand("5");
        b5.addActionListener(this);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

    }
    private static void createAndShowGUI(){
        JFrame frame = new JFrame(""); //Creates the window
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true); //Can't be decorated otherwise people can exit out of it
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Close when you close

        Morale m = new Morale();
        m.setOpaque(true); //Used to see the buttons
        frame.setContentPane(m);
        frame.setVisible(true); //Also used to see the buttons I think
    }
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createAndShowGUI();

            }
        }); //I don't know what this means but we need it
    }
    //Ignore everything from here down. It was put in due to implementation but we don't actually need any of it
    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
