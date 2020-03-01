package org.micomupu.ot.service;

import java.util.List;

import javax.jws.WebService;

import org.micomupu.ot.model.Trabajo;
import org.micomupu.ot.repository.OrdenTrabajoRepository;
import org.micomupu.ot.repository.OrdenTrabajoRepositoryImpl;


@WebService(endpointInterface="org.micomupu.ot.service.OrdenService")
public class OrdenServiceImpl implements OrdenService {
	
	OrdenTrabajoRepository tarjetaRepository=new OrdenTrabajoRepositoryImpl(); 

	@Override
	public Trabajo ingresarOrden(Trabajo ot) {
		tarjetaRepository.ingresarOrden(ot);
		return ot;
	}

	@Override
	public List<Trabajo> consultarOrdenTrabajo() {
		return tarjetaRepository.consultarOrdenTrabajo();
	}
}
