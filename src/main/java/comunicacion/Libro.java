package comunicacion;

public class Libro extends Escrito {
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.co_autor=co_autor;
		this.editorial=editorial;
		this.edicion=edicion;
		this.interpretacion=interpretacion;}
	
	public int palabrasTotales(int parametro) {
		return parametro*this.getPaginas()*2;}
	
	public String interpretacion() {
		return interpretacion;}
	
	public String toString() {
		return this.getOrigen()+"\n"+
				this.getTitulo()+"\n"+
				this.getAutor()+"\n"+
				this.getPaginas()+"\n"+
				co_autor+"\n"+
				editorial+"\n"+
				edicion;}
	
	public String getCo_autor() {
		return co_autor;}
	
	public String getEditorial() {
		return editorial;}
	
	public String getEdicion() {
		return edicion;}
	
	public String getInterpretacion() {
		return interpretacion;}
	
	public void setCo_autor(String nuevo) {
		co_autor=nuevo;}
	
	public void setEditorial(String nuevo) {
		editorial=nuevo;}
	
	public void setEdicion(String nuevo) {
		edicion=nuevo;}
	
	public void setInterpretacion(String nuevo) {
		interpretacion=nuevo;}}