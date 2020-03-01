package org.micomupu.ot.model;

public class Trabajo {
	
	private Equipo equipoIngreso; 
	private String fechaIngreso; 
	private String causaIngreso; 
	private String personaIngreso; 
	private String personaAtiende; 
	private String fechaEntrega; 

	public Equipo getEquipoIngreso() {
		return equipoIngreso;
	}
	public void setEquipoIngreso(Equipo equipoIngreso) {
		this.equipoIngreso = equipoIngreso;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getCausaIngreso() {
		return causaIngreso;
	}
	public void setCausaIngreso(String causaIngreso) {
		this.causaIngreso = causaIngreso;
	}
	public String getPersonaIngreso() {
		return personaIngreso;
	}
	public void setPersonaIngreso(String personaIngreso) {
		this.personaIngreso = personaIngreso;
	}
	public String getPersonaAtiende() {
		return personaAtiende;
	}
	public void setPersonaAtiende(String personaAtiende) {
		this.personaAtiende = personaAtiende;
	}
	public String getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

}
