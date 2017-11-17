import java.util.ArrayList;

public class Carrera{
	public ArrayList<Semestre> semestres;
        public String nombre;
        ArrayList<String> comparar = new ArrayList<String>();
        ArrayList<String> imprimir = new ArrayList<String>();
        ArrayList<String> aprobar = new ArrayList<String>();
	public Carrera(String nombre){
        this.nombre= nombre;
        semestres = new ArrayList<Semestre>();
            
	}

	public void agregarSemestre(String nombre, String curso1, String curso2, String curso3, String curso4, String curso5, String curso6){
            Semestre semestre1 = new Semestre(nombre, curso1, curso2, curso3, curso4, curso5, curso6);
            semestres.add(semestre1);
        }
        
        public boolean buscarCurso(String c, int s){
                ArrayList<String> aprobadas = new ArrayList<String>();
                aprobadas = buscarSemestre(s);
                    for (int x=0;x<aprobadas.size();x++){
                        String curso = aprobadas.get(x);
                        if (curso.equalsIgnoreCase(c)){
                            return true;
                        }
                    }
                return false;
        }
        
        public ArrayList<String> imprimirCarrera(){
            imprimir.clear();
            for(Semestre i: semestres){
                for(int x =0; x<i.cursos.size();x++){
                    String z = i.cursos.get(x);
                    imprimir.add(z);
                }
            }
            return imprimir;
        }
        
        public ArrayList<String> buscarSemestre(int j){
            Semestre i = new Semestre();
            for(int y=0;y<j;y++){
                i = semestres.get(y);
                for(int x =0; x<i.cursos.size();x++){
                    aprobar.add(i.cursos.get(x)); 
                    System.out.println(i.cursos.get(x));
                }
            }
        return aprobar;   
        }
        
        public ArrayList<String> getComparar(){
            return comparar;
        }
         
}