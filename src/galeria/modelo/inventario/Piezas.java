package galeria.modelo.inventario;

import galeria.modelo.compras.OfertaOpcion;

public abstract class Piezas {
	
	private String titulo;
	private String año;
	private String lugar;
	private String autores;
	private Deposito deposito;
	private OfertaOpcion ofertaOpcion;
	private String propietario;
	private String estado;
	
	public Piezas(String titulo, String año, String autores, String lugar, Deposito deposito, OfertaOpcion ofertaOpcion, String propietario) {
		
		this.titulo = titulo;
		this.año = año;
		this.lugar = lugar;
		this.autores = autores;
		this.deposito = deposito;
		this.ofertaOpcion = ofertaOpcion;
		this.propietario = propietario;
	}
	
	public abstract String getTipo();
	
	public String getAutores() {
		return autores;	
	}
	
	public String getPropietario() {
		return propietario;
	}
	
	public OfertaOpcion getOfertaOpcion() {
		return ofertaOpcion;	
	}
	
	public Deposito getDeposito() {
		return deposito;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAño() {
		return año;
	}
	
	public String getLugar() {
		return lugar;
	}
	
	public String getEstado(String estados) {
		
		this.estado = estados;
		return estado;
	}
}