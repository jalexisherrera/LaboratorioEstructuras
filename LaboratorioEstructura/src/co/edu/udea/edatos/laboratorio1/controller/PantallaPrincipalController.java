/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.edatos.laboratorio1.controller;

import co.edu.udea.edatos.laboratorio1.vista.Main;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Alexis Herrera
 */
public class PantallaPrincipalController {

   /**
    * Initializes the controller class.
    */
   private Main ProgramaPrincipal;
   ClienteDAO clienteDAO = new FileClienteDAO();
   ConductorDAO conductorDAO = new FileConductorDAO();
   LicorDAO licorDAO = new FileLicor();
   PedidoDAO pedidoDAO = new FilePedidoDAO();
   ProveedorDAO proveedorDAO = new FileProveedorDAO();
   
   
   
   
   public void setProgramaPrincipal(Main ProgramaPrincipal) {
        this.ProgramaPrincipal = ProgramaPrincipal;
    }

}
