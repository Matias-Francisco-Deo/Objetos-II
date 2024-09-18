package tpsolid.email;

import java.util.ArrayList;

public class UsuarioEmail {
	
	private String nombreUsuario;
	private String passusuario;
	private ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;
	private SesiónEmail sesiónEmail;
	
	public UsuarioEmail(String nombreUsuario, String pass){
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
	}
	
	public void conectar(IServidor servidor){
		this.sesiónEmail = new SesiónEmail(servidor, nombreUsuario, passusuario);
		this.inbox = sesiónEmail.getInbox();
		this.borrados = sesiónEmail.getBorrados();
	}
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(){
		this.sesiónEmail.recibirNuevos();
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.sesiónEmail.enviarCorreo(correo);
	}

}
