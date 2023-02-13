package application;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javafx.fxml.FXML;
import model.user;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
public class controladorregistro {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField registronombre;

    @FXML
    private JFXTextField registroapellido;

    @FXML
    private JFXTextField registrousuario;

    @FXML
    private JFXTextField registrocorreo;

    @FXML
    private JFXPasswordField registropassword;

    @FXML
    public static void registrousuario() {

		user usuarioadmin = new user("Isma","Alvarez", "isma@isma.com", "isma", "123", "vigia");
		Vector<user> usuarios = new Vector<user>();
		usuarios.add(usuarioadmin);		
		Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
		String representacionBonita = prettyGson.toJson(usuarios);
		System.out.println(representacionBonita);
		
		try(FileWriter writer = new FileWriter("usuarios.json")){
			prettyGson.toJson(usuarios, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
    
    @FXML
    void initialize() {
      
    }
}











