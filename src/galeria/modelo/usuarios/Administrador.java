package galeria.modelo.usuarios;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import galeria.modelo.compras.Oferta;

public class Administrador{
	
	/*CONSIDERAR LA ELIMINACIÓN DE ESTE ATRIBUTO PUES YA NO HACE PARTE DE LA CLASE ABSTRACTA*/
	private static final String ADMINISTRADOR = "Administrador";
	
	private String usuario;
	private String contrasena;
	private String rol;
	private String nombre;
	private Inversores comprador;
	
	private List<Usuarios> nuevosUsuarios = new ArrayList<Usuarios>();
	private List<Usuarios> usuariosConfirmados = new ArrayList<Usuarios>();
	private List<Oferta> piezasConOferta = new LinkedList<Oferta>();
	
	public Administrador(String usuario, String contrasena, String rol, String nombre) {
		
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.rol = rol;
		this.nombre = nombre;
	}
	
	public String getTipoUsuario() {
		return ADMINISTRADOR;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public String getRol() {
		return rol;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public List<Usuarios> nuevosUsuarios(Usuarios usuarios){
		
		nuevosUsuarios.add(usuarios);
		return nuevosUsuarios;
	}
	
	public List<Usuarios> listaUsuarios(Usuarios usuarios, int posUsuario, int monto) {
		
		Usuarios usuario = nuevosUsuarios.get(posUsuario);
		if(usuario.getRol().equals("Inversor")) {
			comprador.asignarValorMaximo(monto);
		}
		usuariosConfirmados.add(usuario);
		nuevosUsuarios.remove(posUsuario);
		return usuariosConfirmados;
	}
	
	public List<Oferta> agregarOferta(Oferta ofertas){
		
		piezasConOferta.add(ofertas);
		return piezasConOferta;
	}
}