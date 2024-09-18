package tpsolid.email;

import java.util.ArrayList;

public class SesiónEmail {
	
	private IServidor servidor;
	private String nombreUsuario;
	private String passusuario;
	private ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;
	
	
	public SesiónEmail(IServidor servidor, String nombreUsuario, String pass){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		this.conectar();
	}
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
	}
	
	public void enviarCorreo(Correo correo){
		this.servidor.enviar(correo);
	}

	public ArrayList<Correo> getInbox() {
		
		return this.inbox;
	}

	public ArrayList<Correo> getBorrados() {
		
		return this.getBorrados();
	}

}
