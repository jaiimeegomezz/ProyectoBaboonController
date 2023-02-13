package model;

public class user {
	
public String nombre, apellido1, correo, usuario, password, tipo;

public user() {
	super();
	// TODO Auto-generated constructor stub
}

public user(String nombre, String apellido1, String correo, String usuario, String password, String tipo) {
	super();
	this.nombre = nombre;
	this.apellido1 = apellido1;
	this.correo = correo;
	this.usuario = usuario;
	this.password = password;
	this.tipo = tipo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido1() {
	return apellido1;
}

public void setApellido1(String apellido1) {
	this.apellido1 = apellido1;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}

public String getUsuario() {
	return usuario;
}

public void setUsuario(String usuario) {
	this.usuario = usuario;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}



}
