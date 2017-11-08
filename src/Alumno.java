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
		miCarrera = new Carrera();
                miNuevaCarrera = new Carrera();
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
	
	public void llenarCarrera(String name, String clase1_1, String clase1_2, 
            String clase1_3, String clase1_4, String clase1_5, String clase1_6, String clase1_7,
            String clase2_1, String clase2_2, String clase2_3, String clase2_4, String clase2_5, 
            String clase2_6, String clase3_1, String clase3_2, String clase3_3, String clase3_4, 
            String clase3_5, String clase3_6, String clase4_1, String clase4_2, String clase4_3, 
            String clase4_4, String clase4_5, String clase4_6, String clase5_1, String clase5_2,
            String clase5_3, String clase5_4, String clase5_5, String clase5_6, String clase6_1, 
            String clase6_2, String clase6_3, String clase6_4, String clase6_5, String clase6_6,
            String clase7_1, String clase7_2, String clase7_3, String clase7_4, String clase7_5, 
            String clase7_6, String clase8_1, String clase8_2, String clase8_3, String clase8_4,
            String clase8_5, String clase8_6, String clase9_1, String clase9_2, String clase9_3, 
            String clase9_4, String clase9_5, String clase9_6, String clase10_1, String clase10_2, 
            String clase10_3, String clase10_4, String clase10_5, String clase10_6){
		miCarrera.setNombre(name);
		miCarrera.setclase1_1(clase1_1);
		miCarrera.setclase1_2(clase1_2);
		miCarrera.setclase1_3(clase1_3);
                miCarrera.setclase1_4(clase1_4);
                miCarrera.setclase1_5(clase1_5);
                miCarrera.setclase1_6(clase1_6);
                miCarrera.setclase1_7(clase1_7);
                
		miCarrera.setclase2_1(clase2_1);
		miCarrera.setclase2_2(clase2_2);
		miCarrera.setclase2_3(clase2_3);
                miCarrera.setclase2_4(clase2_4);
                miCarrera.setclase2_5(clase2_5);
                miCarrera.setclase2_6(clase2_6);
                
                miCarrera.setclase3_1(clase3_1);
		miCarrera.setclase3_2(clase3_2);
		miCarrera.setclase3_3(clase3_3);
                miCarrera.setclase3_4(clase3_4);
                miCarrera.setclase3_5(clase3_5);
                miCarrera.setclase3_6(clase3_6);
                
                miCarrera.setclase4_1(clase4_1);
	        miCarrera.setclase4_2(clase4_2);
                miCarrera.setclase4_3(clase4_3);
                miCarrera.setclase4_4(clase4_4);
                miCarrera.setclase4_5(clase4_5);
                miCarrera.setclase4_6(clase4_6);
                
                miCarrera.setclase5_1(clase5_1);
	        miCarrera.setclase5_2(clase5_2);
                miCarrera.setclase5_3(clase5_3);
                miCarrera.setclase5_4(clase5_4);
                miCarrera.setclase5_5(clase5_5);
                miCarrera.setclase5_6(clase5_6);
                
                miCarrera.setclase6_1(clase6_1);
	        miCarrera.setclase6_2(clase6_2);
                miCarrera.setclase6_3(clase6_3);
                miCarrera.setclase6_4(clase6_4);
                miCarrera.setclase6_5(clase6_5);
                miCarrera.setclase6_6(clase6_6);

                miCarrera.setclase7_1(clase7_1);
	        miCarrera.setclase7_2(clase7_2);
                miCarrera.setclase7_3(clase7_3);
                miCarrera.setclase7_4(clase7_4);
                miCarrera.setclase7_5(clase7_5);
                miCarrera.setclase7_6(clase7_6);

                
                miCarrera.setclase8_1(clase8_1);
	        miCarrera.setclase8_2(clase8_2);
                miCarrera.setclase8_3(clase8_3);
                miCarrera.setclase8_4(clase8_4);
                miCarrera.setclase8_5(clase8_5);
                miCarrera.setclase8_6(clase8_6);
                
                miCarrera.setclase9_1(clase9_1);
	        miCarrera.setclase9_2(clase9_2);
                miCarrera.setclase9_3(clase9_3);
                miCarrera.setclase9_4(clase9_4);
                miCarrera.setclase9_5(clase9_5);
                miCarrera.setclase9_6(clase9_6);
                
                miCarrera.setclase10_1(clase10_1);
	        miCarrera.setclase10_2(clase10_2);
                miCarrera.setclase10_3(clase10_3);
                miCarrera.setclase10_4(clase10_4);
                miCarrera.setclase10_5(clase10_5);
                miCarrera.setclase10_6(clase10_6);
                



	}
        public void llenarNuevaCarrera(String name, String clase1_1, String clase1_2, 
            String clase1_3, String clase1_4, String clase1_5, String clase1_6, String clase1_7,
            String clase2_1, String clase2_2, String clase2_3, String clase2_4, String clase2_5, 
            String clase2_6, String clase3_1, String clase3_2, String clase3_3, String clase3_4, 
            String clase3_5, String clase3_6, String clase4_1, String clase4_2, String clase4_3, 
            String clase4_4, String clase4_5, String clase4_6, String clase5_1, String clase5_2, 
            String clase5_3, String clase5_4, String clase5_5, String clase5_6, String clase6_1, 
            String clase6_2, String clase6_3, String clase6_4, String clase6_5, String clase6_6,
            String clase7_1, String clase7_2, String clase7_3, String clase7_4, String clase7_5, 
            String clase7_6, String clase8_1, String clase8_2, String clase8_3, String clase8_4, 
            String clase8_5, String clase8_6, String clase9_1, String clase9_2, String clase9_3, 
            String clase9_4, String clase9_5, String clase9_6, String clase10_1, String clase10_2, 
            String clase10_3, String clase10_4, String clase10_5, String clase10_6){
		miNuevaCarrera.setNombre(name);
		miNuevaCarrera.setclase1_1(clase1_1);
		miNuevaCarrera.setclase1_2(clase1_2);
		miNuevaCarrera.setclase1_3(clase1_3);
                miNuevaCarrera.setclase1_4(clase1_4);
                miNuevaCarrera.setclase1_5(clase1_5);
                miNuevaCarrera.setclase1_6(clase1_6);
                miNuevaCarrera.setclase1_7(clase1_7);
                
		miNuevaCarrera.setclase2_1(clase2_1);
		miNuevaCarrera.setclase2_2(clase2_2);
		miNuevaCarrera.setclase2_3(clase2_3);
                miNuevaCarrera.setclase2_4(clase2_4);
                miNuevaCarrera.setclase2_5(clase2_5);
                miNuevaCarrera.setclase2_6(clase2_6);
                
                miNuevaCarrera.setclase3_1(clase3_1);
		miNuevaCarrera.setclase3_2(clase3_2);
		miNuevaCarrera.setclase3_3(clase3_3);
                miNuevaCarrera.setclase3_4(clase3_4);
                miNuevaCarrera.setclase3_5(clase3_5);
                miNuevaCarrera.setclase3_6(clase3_6);
                
                miNuevaCarrera.setclase4_1(clase4_1);
	        miNuevaCarrera.setclase4_2(clase4_2);
	        miNuevaCarrera.setclase4_3(clase4_3);
                miNuevaCarrera.setclase4_4(clase4_4);
                miNuevaCarrera.setclase4_5(clase4_5);
                miNuevaCarrera.setclase4_6(clase4_6);

                miNuevaCarrera.setclase5_1(clase5_1);
	        miNuevaCarrera.setclase5_2(clase5_2);
	        miNuevaCarrera.setclase5_3(clase5_3);
                miNuevaCarrera.setclase5_4(clase5_4);
                miNuevaCarrera.setclase5_5(clase5_5);
                miNuevaCarrera.setclase5_6(clase5_6);
                
                miNuevaCarrera.setclase6_1(clase6_1);
	        miNuevaCarrera.setclase6_2(clase6_2);
	        miNuevaCarrera.setclase6_3(clase6_3);
                miNuevaCarrera.setclase6_4(clase6_4);
                miNuevaCarrera.setclase6_5(clase6_5);
                miNuevaCarrera.setclase6_6(clase6_6);
                
                miNuevaCarrera.setclase7_1(clase7_1);
	        miNuevaCarrera.setclase7_2(clase7_2);
	        miNuevaCarrera.setclase7_3(clase7_3);
                miNuevaCarrera.setclase7_4(clase7_4);
                miNuevaCarrera.setclase7_5(clase7_5);
                miNuevaCarrera.setclase7_6(clase7_6);

                miNuevaCarrera.setclase8_1(clase8_1);
	        miNuevaCarrera.setclase8_2(clase8_2);
	        miNuevaCarrera.setclase8_3(clase8_3);
                miNuevaCarrera.setclase8_4(clase8_4);
                miNuevaCarrera.setclase8_5(clase8_5);
                miNuevaCarrera.setclase8_6(clase8_6);
                
                miNuevaCarrera.setclase9_1(clase9_1);
	        miNuevaCarrera.setclase9_2(clase9_2);
	        miNuevaCarrera.setclase9_3(clase9_3);
                miNuevaCarrera.setclase9_4(clase9_4);
                miNuevaCarrera.setclase9_5(clase9_5);
                miNuevaCarrera.setclase9_6(clase9_6);

                miNuevaCarrera.setclase10_1(clase10_1);
	        miNuevaCarrera.setclase10_2(clase10_2);
	        miNuevaCarrera.setclase10_3(clase10_3);
                miNuevaCarrera.setclase10_4(clase10_4);
                miNuevaCarrera.setclase10_5(clase10_5);
                miNuevaCarrera.setclase10_6(clase10_6);

	}
	
	public String toString(){
		String cadena = "El nombre del Alumno es: "+nombre+"\n"+"Edad: "+edad+
                "\n"+"Sexo: "+sexo+"\n"+"Numero de carnet: "+Carnet;
		return cadena;
	}
}
