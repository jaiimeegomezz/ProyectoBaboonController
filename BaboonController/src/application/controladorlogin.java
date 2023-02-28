package application;
import model.user;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Vector;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class controladorlogin {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXPasswordField textopassword;

    @FXML
    private JFXTextField textousuario;

    @FXML
    private JFXButton botonentrar;
    
    public String usuario;

   
    @FXML
   	void comprobarLogIn(ActionEvent event) throws IOException{
   		Vector<user> usuarios = new Vector<user>();
   		try (Reader reader = new FileReader("usuarios.json")) {
   			Gson gson = new Gson();
   			Type tipoLista = new TypeToken<Vector<user>>() {
   			}.getType();
   			usuarios = gson.fromJson(reader, tipoLista);
   		} catch (IOException e) {
   			e.printStackTrace();
   		}
   		for (int i = 0; i<usuarios.size(); i++ ) {
   			if (usuarios.get(i).getUsuario().equals(textousuario.getText()) && usuarios.get(i).getPassword().equals(textopassword.getText()) ) {
   				
   			String usuario = usuarios.get(i).getUsuario();	
   			String nombre = usuarios.get(i).getNombre();
   			String apellido1 = usuarios.get(i).getApellido1();
   			String correo = usuarios.get(i).getCorreo();
   			String tipo = usuarios.get(i).getTipo();
   			
   			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/PanelvigiaVista.fxml"));
   			
   			
   			controladorPanelvigia controladorPanelvigia = new controladorPanelvigia();
			
			loader.setController(controladorPanelvigia);
			Parent root = loader.load();
   			Stage stage = new Stage();
   			stage = (Stage)(((Node) (event.getSource())).getScene().getWindow());
   			stage.setScene(new Scene(root));
   			stage.show();
   			}
   			
   		}
	}
    @FXML
    void goregistro (ActionEvent event) throws IOException{
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/registroVista.fxml"));	
    	controladorregistro controladorregistro = new controladorregistro();
		
		loader.setController(controladorregistro);
		Parent root = loader.load();
			Stage stage = new Stage();
			stage = (Stage)(((Node) (event.getSource())).getScene().getWindow());
			stage.setScene(new Scene(root));
			stage.show();
    	
    	
    }
    @FXML
    void initialize() {
    	usuario = textousuario.getText();
        
    }
	public String getUsuario() {
		return usuario;
	}
    
}








