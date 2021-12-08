package comunicacion;

public class Periodico extends Escrito{
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.fecha=fecha;
		this.primicia=primicia;
		this.interpretacion=interpretacion;}
	
	public int palabrasTotales(int parametro) {
		return parametro*this.getPaginas()*10;}
	
	public String interpretacion() {
		return interpretacion;}
	
	public String toString() {
		return this.getOrigen()+"\n"+
				this.getTitulo()+"\n"+
				this.getAutor()+"\n"+
				this.getPaginas()+"\n"+
				fecha+"\n"+
				primicia;}
	
	public String getFecha() {
		return fecha;}
	
	public String getPrimicia() {
		return primicia;}
	
	public String getInterpretacion() {
		return interpretacion;}
	
	public void setFecha(String nuevo) {
		fecha=nuevo;}
	
	public void setPrimicia(String nuevo) {
		primicia=nuevo;}
	
	public void setInterpretacion(String nuevo) {
		interpretacion=nuevo;}}
