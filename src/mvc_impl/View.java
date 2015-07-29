/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_impl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jonathan
 */
public class View{
    private JFrame frame;
    private JButton butInvoke;
    private JPanel background;
    private Controller control;
    private ViewListener listener;
    
    public View(){
        buildGUI();
    }
    
    public View passCurrentView(){
        return this;
    }
    
    public void buildGUI(){
        frame = new JFrame();
        background = new JPanel();
        butInvoke = new JButton("Invoke");
        butInvoke.addActionListener(new ButListener());
        
        background.add(butInvoke);
        frame.add(background);
        frame.setSize(800,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public void setViewListener(ViewListener vl){
        this.listener = vl;
    }
    
    private class ButListener implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
            listener.butPressed();
        }
    }
}
