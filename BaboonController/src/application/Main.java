package application;
	
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.user;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/loginVista.fxml"));
			
			controladorlogin control = new controladorlogin();
			loader.setController(control);
			
			Parent root = loader.load();
			
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void createsampleuser() {

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
	
	public static void main(String[] args) {
		createsampleuser();
		launch(args);
	}
}
