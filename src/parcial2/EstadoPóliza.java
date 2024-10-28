package parcial2;

public interface EstadoPóliza {
	public void agregarÍtem(Póliza póliza, ÍtemPóliza ítem);

	public void cerrarInventario(Póliza póliza);

	public void pagar(Póliza póliza);

	public void cancelar(Póliza póliza);

	public void aplicarDescuento(Póliza póliza);
}
