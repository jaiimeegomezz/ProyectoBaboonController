	package application;
	import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Vector;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jfoenix.controls.JFXButton;
	import com.jfoenix.controls.JFXComboBox;
	import com.jfoenix.controls.JFXTextField;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

  public class ControladorPerfil {

	    @FXML
	    private JFXButton BotonSalir;

	    @FXML
	    private JFXButton BotonPerfil;

	    @FXML
	    private JFXComboBox<String> ComboBoxSexo;

	    @FXML
	    private DatePicker DatePerfil;

	    @FXML
	    private JFXTextField NombrePerfil;

	    @FXML
	    private JFXTextField ApellidosPerfil;

	    @FXML
	    private JFXTextField CorreoPerfil;
	    
	    
	    @FXML
	    void initialize() {
	    	
		    ComboBoxSexo.setItems(FXCollections.observableArrayList("Hombre", "Mujer", "Otro"));
		    ComboBoxSexo.setValue("Hombre");
		    controladorlogin cl =  new controladorlogin();
		    NombrePerfil.setText(cl.usuario);
	    	
		 
		  
	    }
	   
	    }
	    
	   



