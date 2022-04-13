package net.gama.ejempleos.service;

import java.util.List;
import net.gama.ejempleos.model.Categoria;

public interface ICategoriasService {
	void guardar(Categoria categoria);
	List<Categoria> buscarTodas();
	Categoria buscarPorId(Integer idCategoria);	
}