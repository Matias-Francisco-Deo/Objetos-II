package parcial2;

public interface BonificationService {
	public boolean códigoVálido(int código);

	public void anularCódigo(int código);

	public void notificarTitular(String mailTitular, int código);
}
