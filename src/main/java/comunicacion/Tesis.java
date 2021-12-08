package comunicacion;

public class Tesis extends Escrito {
	private String idea;
	private static String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.idea=idea;
		Tesis.argumentos=argumentos;
		this.conclusion=conclusion;
		this.referencias=referencias;
		this.interpretacion=interpretacion;}
	
	public int palabrasTotales(int parametro) {
		return parametro*this.getPaginas()*5;}
	
	public String interpretacion() {
		return interpretacion;}
	
	public String toString() {
		return this.getOrigen()+"\n"+
				this.getTitulo()+"\n"+
				this.getAutor()+"\n"+
				this.getPaginas()+"\n"+
				idea+"\n"+
				argumentos.length+"\n"+
				conclusion+"\n"+
				referencias;}
	
	public String getIdea() {
		return idea;}
	
	public int getArgumentos() {
		return argumentos.length;}
	
	public String getConclusion() {
		return conclusion;}
	
	public String getReferencias() {
		return referencias;}
	
	public String getInterpretacion() {
		return interpretacion;}
	
	public void setIdea(String nuevo) {
		idea=nuevo;}
	
	public void setArgumentos(String[] nuevo) {
		argumentos=nuevo;}
	
	public void setConclusion(String nuevo) {
		conclusion=nuevo;}
	
	public void setReferencias(String nuevo) {
		referencias=nuevo;}
	
	public void setInterpretacion(String nuevo) {
		interpretacion=nuevo;}}
