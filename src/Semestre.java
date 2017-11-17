
import java.util.ArrayList;


public class Semestre{
	public String nombre;
	ArrayList<String> cursos = new ArrayList<String>();

	public Semestre(String nombre, String curso1, String curso2, String curso3, String curso4, String curso5, String curso6){
		this.nombre= nombre;
		cursos.add(curso1);
		cursos.add(curso2);
                cursos.add(curso3);
                cursos.add(curso4);
                cursos.add(curso5);
                cursos.add(curso6);
                
	}
        public Semestre(){}
        
        public String getNombre(){
            return nombre;
        }
}
