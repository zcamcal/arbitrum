/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.gz;

import cl.gz.controller.controller.ControladorMaestro;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author rednation
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        ControladorMaestro.iniciarServer();
        ControladorMaestro.setStage(primaryStage);
        ControladorMaestro.setSceneOnStage("Principal");
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
