package org.micomupu.ot.repository;

import java.util.ArrayList;
import java.util.List;

import org.micomupu.ot.model.Trabajo;

public class OrdenTrabajoRepositoryImpl implements OrdenTrabajoRepository {
	
	private static List<Trabajo> lista=new ArrayList<Trabajo>();

	@Override
	public Trabajo ingresarOrden(Trabajo ot) {
		lista.add(ot);
		return null;
	}

	@Override
	public List<Trabajo> consultarOrdenTrabajo() {
		return lista;
	}

}
