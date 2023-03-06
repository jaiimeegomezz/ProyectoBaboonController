	package application;
	import java.io.FileReader;

import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.Month;
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
import application.controladorlogin;
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
	    
	    public String usuario;
	    public String apellido;
	    public String correo;

	    @FXML
	    void initialize() {
	    	
		    ComboBoxSexo.setItems(FXCollections.observableArrayList("Hombre", "Mujer", "Otro"));
		    ComboBoxSexo.setValue("Hombre");
		    
		    DatePicker DatePerfil = new DatePicker();

		    DatePicker DatePerfil2 = new DatePicker(LocalDate.now());
		    DatePerfil2.setEditable(false);
	    	
		    DatePerfil.setValue(LocalDate.of(2000, Month.JANUARY, 1));    
		    LocalDate date = DatePerfil.getValue();
		  
	    }
		public void getUsuario(String usuario2) {
		    usuario=usuario2;
		    NombrePerfil.setText(usuario);

		}
		public void getApellido(String apellido2) {
			    apellido = apellido2;
			   ApellidosPerfil.setText(apellido);
	  
	  }
	  
		public void getCorreo(String correo2) {
			    correo = correo2;
			    CorreoPerfil.setText(correo);
		}
  }
  	    
	   



