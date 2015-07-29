/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_impl;

/**
 *
 * @author Jonathan
 */
public class Controller{

    View currentView;
    
    public Controller(){
        currentView = new View();
        currentView.setViewListener(new ViewListener() {

            @Override
            public void butPressed() {
                actionDone();
            }
        });
    }
    
    public void actionDone(){
        System.out.println("Invoked from Controller!!");
    }
    /*
    @Override
    public void butPressed(View view) {
        actionDone();
    }
    */
}
