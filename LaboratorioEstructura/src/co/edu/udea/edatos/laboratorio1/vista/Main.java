/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.edatos.laboratorio1.vista;

import co.edu.udea.edatos.laboratorio1.controller.PantallaPrincipalController;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Alexis Herrera
 */
public class Main extends Application {
   
   private Stage stagePrincipal;
   private AnchorPane rootPane;
   
   @Override
   public void start(Stage stagePrincipal)  throws Exception {
        this.stagePrincipal = stagePrincipal;
        mostrarVentanaPrincipal();
   }

    /*
     * cargamos la ventana principal
     */
    public void mostrarVentanaPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("PantallaPrincipal.fxml"));
            rootPane=(AnchorPane) loader.load();
            Scene scene = new Scene(rootPane);
            stagePrincipal.setTitle("Ventana Principal");
            stagePrincipal.setScene(scene);
            PantallaPrincipalController controller = loader.getController();
            controller.setProgramaPrincipal(this);
            stagePrincipal.show();
        } catch (IOException e) {
        }
    }
	
   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
	  launch(args);
   }
   
}
