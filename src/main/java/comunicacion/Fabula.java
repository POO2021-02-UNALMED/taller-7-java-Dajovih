package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas,String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza=ensenanza;
		this.interpretacion=interpretacion;}
	
	public int palabrasTotales(int parametro) {
		return parametro*this.getPaginas()*1;}
	
	public String interpretacion() {
		return interpretacion;}
	
	public String toString() {
		return this.getOrigen()+"\n"+
				this.getTitulo()+"\n"+
				this.getAutor()+"\n"+
				this.getPaginas()+"\n"+
				ensenanza;}
	public String getEnsenanza() {
		return ensenanza;}
	
	public String getInterpretacion() {
		return interpretacion;}
	
	public void setEnsenanza(String nuevo) {
		ensenanza=nuevo;}
	
	public void setInterpretacion(String nuevo) {
		interpretacion=nuevo;}}
