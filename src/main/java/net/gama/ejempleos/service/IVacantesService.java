package net.gama.ejempleos.service;

import java.util.List;
import net.gama.ejempleos.model.Vacante;

public interface IVacantesService {
	List<Vacante> buscarTodas();
	Vacante buscarPorId(Integer idVacante);
	void guardar(Vacante vacante);
}
