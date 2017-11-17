/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottoalexander
 */
public class Alumno {
    
	private float edad;
	private String sexo;
	private String nombre;
	private long Carnet;
	private Carrera miCarrera;
        private Carrera miNuevaCarrera;
	
	//Metodos
	/**Constructor: Inicializar los elementos
	* de un objeto y reservar memoria
	*/
	public Alumno(){
		edad = 0;
		sexo = "";
		nombre = "";
		Carnet = 0;
	}
        
	public void setEdad(float edad){
		this.edad = edad;}
	public float getEdad(){
		return edad;}

	public void setSexo(String sexo){
		this.sexo = sexo;}
	public String getSexo(){
		return sexo;}

	public void setNombre(String nombre){
		this.nombre = nombre;}
	public String getNombre(){
		return nombre;}
	
	public void setCarnet(long Carnet){
		this.Carnet = Carnet;}
	public long getCarnet(){
		return Carnet;}

	public void setCarrera(Carrera suCarrera){
		miCarrera = suCarrera;}
	public Carrera getCarrera(){
		return miCarrera;}
        
        public void setNuevaCarrera(Carrera suNuevaCarrera){
		miNuevaCarrera = suNuevaCarrera;}
	public Carrera getNuevaCarrera(){
		return miNuevaCarrera;}
	
	public String toString(){
		String cadena = "El nombre del Alumno es: "+nombre+"\n"+"Edad: "+edad+
                "\n"+"Sexo: "+sexo+"\n"+"Numero de carnet: "+Carnet;
		return cadena;
	}
}
