package org.micomupu.ot.service;

import java.util.List;

import javax.jws.WebService;

import org.micomupu.ot.model.Trabajo;


@WebService
public interface OrdenService {
	
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
