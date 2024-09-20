package tpsolid.email;

public class ClienteBorradorDeMails {
	
	private ServidorPop servidor;
	private String nombreUsuario;
	private String passusuario;
	private BandejaDeEntrada bandejaEntrada;
	
	public ClienteBorradorDeMails(ServidorPop servidor, String nombreUsuario, String pass){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.bandejaEntrada = new BandejaDeEntrada(servidor, nombreUsuario, pass);
		this.conectar();
	}
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	
	public void borrarCorreo(Correo correo){
		this.bandejaEntrada.borrarCorreo(correo);
	}
	
	public void eliminarBorrado(Correo correo){
		this.bandejaEntrada.eliminarBorrado(correo);
	}
	

}
