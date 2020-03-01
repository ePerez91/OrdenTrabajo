package org.micomupu.ot.repository;

import java.util.List;

import org.micomupu.ot.model.Trabajo;

public interface OrdenTrabajoRepository {

	/**
	 * Metodo para registrar una nueva orden de trabajo
	 * @param ot
	 * @return
	 */
	Trabajo ingresarOrden(Trabajo ot);
	
	/**
	 * Metodo para consultar todas lar ordenes de trabajo
	 * @return
	 */
	List<Trabajo> consultarOrdenTrabajo();

}
