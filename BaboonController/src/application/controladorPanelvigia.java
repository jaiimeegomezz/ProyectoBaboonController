package application;

import com.jfoenix.controls.JFXButton;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class controladorPanelvigia {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton BotonSalir;

    @FXML
    private JFXButton BotonPerfil;

    @FXML
    private JFXButton BotonLuz;

    @FXML
    private JFXButton BotonHumedad;

    @FXML
    private JFXButton BotonSonido;

    @FXML
    private JFXButton BotonTemperatura;
    public String usuario, apellido, correo;

    @FXML
    void VerDatosPerfil(ActionEvent event) throws IOException {
    	
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/PerfilUsuario.fxml"));	
    	ControladorPerfil ControladorPerfil = new ControladorPerfil();
		
		loader.setController(ControladorPerfil);
		Parent root = loader.load();
		System.out.println(usuario);
		System.out.println(apellido);
		System.out.println(correo);
		
		ControladorPerfil.getUsuario(usuario);
		ControladorPerfil.getApellido(apellido);
		ControladorPerfil.getCorreo(correo);
			Stage stage = new Stage();
			stage = (Stage)(((Node) (event.getSource())).getScene().getWindow());
			stage.setScene(new Scene(root));
			stage.show();
    	
    	
    }

    

    @FXML
    void initialize() {
     

    }
    public void getUsuario(String usuario2) {
	    usuario = usuario2;

	}



	public void getApellido(String apellido1) {
		apellido = apellido1;
		
	}

	public void getCorreo(String correo2) {
		correo = correo2;
		
	}
}


