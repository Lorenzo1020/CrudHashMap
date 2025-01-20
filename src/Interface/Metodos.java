package Interface;


import Model.Libros;

public interface Metodos {
	// Crud
	public void guardar(Libros libro);

	public void mostrar();

	public Libros buscar(String titulo);

	public void editar(Libros libro);

	public void eliminar(String titulo);

}
