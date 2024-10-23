package Observer;

import java.util.List;

public interface SuscriptorDeDeportes {
	public void suscribriseAAplicación(AplicaciónDistributiva app, List<Deporte> deportes);

	public void enviarPartido(Partido partido);
}
