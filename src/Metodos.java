/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 * @author Alexander Trujillo, Carné 17189
 * @author Mariana Morales, Carné 17235
 * @author Estefania Barrio, Carné 17927
 * @version 11/16/201
 */
public class Metodos {
    Carrera matematica = new Carrera("matematica");
    Carrera mecanica = new Carrera("mecanica");
    Carrera civil = new Carrera("civil");
    Carrera computacion = new Carrera("computacion");
    Carrera administracion = new Carrera("administracion");
    ArrayList<String> aprobadas = new ArrayList<String>();
    ArrayList<String> nuevaCarrera = new ArrayList<String>();
    ArrayList<String> pendientes = new ArrayList<String>();



    
    public Metodos(){
    //Semestres de MATEMATICA:    
        matematica.agregarSemestre("Semestre1", "pensamiento cuantitativo", "ciencias de la vida", "comunicacion efectiva", "algoritmos y programacion basica", "geometria elemental", "quimica general");
        matematica.agregarSemestre("Semestre2", "ciudadania global", "estadistica 1", "geometria moderna", "fisica 1", "calculo 1", "programacion orientada a objetos");
        matematica.agregarSemestre("Semestre3","guatemala en el contexto mundial", "algebra lineal 1", "fisica 2", "matematica discreta 1", "calculo 2", "herramientas tecnologicas para matematica");
        matematica.agregarSemestre("Semestre4","retos ambientales y sostenibilidad", "investgacion y pensamiento cientifico", "ecuaciones diferenciales 1", "teoria de conjuntos", "calculo 3", "algebra lineal 2");
        matematica.agregarSemestre("Semestre5","analisis de variabale real 1", "algebra moderna 1", "ecuaciones diferenciales 2",  "estadisticas matematica", "estadistica 2", "curso selectivo de desarrollo profesional");
        matematica.agregarSemestre("Semestre6","emprendimiento e innovacion", "analisis de variable real 2", "algebra moderna 2", "fisica 3", "data mining", "curso selectivo de desarrollo profesional");
        matematica.agregarSemestre("Semestre7","metodos numericos 1", "algoritmos y estructuras de datos", "seminario 1 de matematica aplicada", "teoria de la medida", "topologia", "investigacion de operaciones");
        matematica.agregarSemestre("Semestre8","modelacion y simulacion", "data science 1", "seminario 2 de matematica aplicada", "teoria de probabilidades", "metodos numericos 2", "administracion financiera");
        matematica.agregarSemestre("Semestre9","geometria diferencial", "analisis de variable compleja", "seminario 3 de matematica aplicada", "analisis funcional", "practica profesional", "trabajo de graduacion");
        matematica.agregarSemestre("Semestre10","","","","","","");
        
    //Semestres de MECANICA:
        mecanica.agregarSemestre("Semestre1", "pensamiento cuantitativo", "introduccion a la ingeniería mecanica","dibujo mecanico", "algoritmos y programación basica", "Quimica general","ciudadania global");
        mecanica.agregarSemestre("Semestre2", "calculo1", "fisica 1", "manufactura digital", "ciencias dela vida", "estadistica 1", "comunicacion efectiva");
        mecanica.agregarSemestre("Semestre3","calculo 2", "algebra Lineal 1", "fisica 2", "materiales 1", "soldadura industrial", "investigación y pensamiento cientifico" );
        mecanica.agregarSemestre("Semestre4", "guatemala en el contexto mundial", "ecuaciones diferenciales 1", "mecanica 1: estatica", "introduccion a ingenieria electrica", "maquinas herramienta", "retos ambientes y sostenibilidad");
        mecanica.agregarSemestre("Semestre5","metodos numéricos en ingenieria mecanica", "termodinamica 1", "mecanica 2: dinamica", "resistencia de materiales 1", "selectivo (formacion general)", "emprendimiento e innovacion");
        mecanica.agregarSemestre("Semestre6","mecanica de fluidos 1", "termodinamica 2", "resistencia de materiales 2", "materiales 2", "mecanismos", "selectivo (formacion general)");
        mecanica.agregarSemestre("Semestre7", "mecanica de fluidos 2", "diseno de ingenieria mecanica 1", "transferencia de calor", "introduccion a diseno y manufactura cad cam", "procesos industriales", "economia de empresas");
        mecanica.agregarSemestre("Semestre8","maquinas electromecanicas", "vibraciones mecanicas", "motores de combustion interna", "diseño de ingenieria mecanica 2", "sistemas hidraulicos y neumaticos", "curso selectivo (area de ingenieria para el desarrollo)");
        mecanica.agregarSemestre("Semestre9", "generacion de potencia", "ingenieria economica", "energia renovable (ingenieria mecanica)", "refrigeracion y acondicionamiento de aire", "diseño e innovacion en ingenieria 1", "elementos finitos");
        mecanica.agregarSemestre("Semestre10", "sistemas de control", "gestion de mantenimiento industrial", "curso selectivo (area profesional)","gestion de proyectos", "diseno e innovacion en ingenieria 2", "practica profesional");
       
    //Semestres de ADMINISTRACION
        administracion.agregarSemestre("Semestre1","pensamiento cuantitativo", "algoritmos y programacion basica", "ciencias de la vida","contabilidad 1", "ciudadania global", "introduccion a la innovacion y los negocios");
        administracion.agregarSemestre("Semestre2","calculo 1", "fisica 1", "estadistica 1", "quimica general", "comunicacion efectiva", "contabilidad 2");
        administracion.agregarSemestre("Semestre3","calculo 2", "fisica 2", "estadistica 2", "guatemala en el contexto mundial", "microeconomia", "");
        administracion.agregarSemestre("Semestre4", "ecuaciones diferenciales 1", "retos ambientales y sostenibilidad2", "anthropology culture and bussiness", "investigacion y pensamiento cientifico 2","macroeconomia", "contabilidad de costos");
        administracion.agregarSemestre("Semestre5","metodos numericos 1", "ingenieria economica", "curso selectivo", "design thinking", "mercadotecnia 1", "investigacion de operaciones");
        administracion.agregarSemestre("Semestre6","emprendimiento e innovacion", "data mining", "administracion de empresas familiares", "formulacion y evaluacion de proyectos", "practica profesional",  "administracion financiera");
        administracion.agregarSemestre("Semestre7","entorno legal de negocios", "gestion de proyectos", "diseño e innovacion en ingenieria 1", "valuacion de activos", "administracion de la cadena de suministro", "comercio internacional");
        administracion.agregarSemestre("Semestre8","desarrollo agil de negocios", "tecnologicos", "gestion y administracion de talentos", "diseño e innovacion en ingenieria 2", "finanzas corporativas internacionales", "administracion global y geopolitica");
        administracion.agregarSemestre("Semestre9","","","","","","");
        administracion.agregarSemestre("Semestre10","","","","","","");
        
    //Semestres de CIVIL
        civil.agregarSemestre("Semestre1","dibujo cad", "pensamiento cuantitativo", "ciencias de la vida", "comunicacion efectiva",  "quimica general", "introduccion a la ingenieria civil");
        civil.agregarSemestre("Semestre2","estadistica 1", "algoritmos y programacion basica", "ciudadania global", "fisica 1", "calculo 1", "materiales 1");
        civil.agregarSemestre("Semestre3","guatemala en el contexto mundial", "fisica 2", "geologia", "calculo 2", "algebra lineal 1", "modelado de informacion para edificaciones");
        civil.agregarSemestre("Semestre4","retos ambientales y sostenibilidad", "selectivo microeconomia o investigacion de operaciones", "mecanica 1 (estatica)", "carpinteria", "ecuaciones diferenciales", "investigacion y pensamiento cientifico");
        civil.agregarSemestre("Semestre5","resistencia de materiales 1", "topografia general","mecanica de fluidos 1", "analisis estructural 1", "mecanica de suelos", "curso selectivo (formacion general)");
        civil.agregarSemestre("Semestre6","resistencia de materiales 2", "sig y geodesia", "analisis estructural 2", "cimentaciones", "curso selectivo (formacion general)", "emprendimiento e innovacion");
        civil.agregarSemestre("Semestre7","hidraulica general", "gestion de proyectos", "estructuras de madera", "concreto 1", "estructuras de acero 1", "dispositivos electricos");
        civil.agregarSemestre("Semestre8","concreto 2", "estructuras de acero 2", "hidrologia", "ingenieria sanitaria", "dispositivos electromecanicos", "curso selectivo");
        civil.agregarSemestre("Semestre9","introduccion a la ingenieria sismo resistente", "diseño de carreteras", "ingenieria economica", "administracion", "energia renovable (ingenieria mecanica)", "diseño e innovacion 1");
        civil.agregarSemestre("Semestre10","diseño de obras hidraulicas", "diseño estructural", "diseño de infraestructura vial", "elementos finitos", "eficiencia energetica en edificaciones", "diseno e innovacion 2");
      
    //Semestres de COMPUTACION
        computacion.agregarSemestre("Semestre1", "ciencias de la Vida","algoritmos y programación Básica","pensamiento cuantitativo","comunicación efectiva", "quimica general","introduccion a la ingenieria");
        computacion.agregarSemestre("Semestre2","programación orientada a objetos", "estadística 1", "ciudadanía global", "fisica 1","calculo1", "algebra lineal 1");
        computacion.agregarSemestre("Semestre3","org. de computadoras y assembler", "fisica 2", "calculo 2", "programación plataformas moviles y juegos", "algoritmos y estructuras de datos","guatemala en el contexto mundial");
        computacion.agregarSemestre("Semestre4","fisica 3", "matematica discreta 1", "retos ambientales y sostenibilidad", "ecuaciones diferenciales 1", "investigacion y pensamiento cientifico", "programación de microprocesadores");
        computacion.agregarSemestre("Semestre5","bases de datos", "ingeniería de software 1", "graficaspor computadora", "interacción humano computador", "diseño de videojuegos", "selectivo de desarrollo profesional");
        computacion.agregarSemestre("Semestre6","emprendimiento e innovacion", "ingenieria de software 2", "sistemas y tecnologias web","selectivo de desarrollo profesional", "logica matematica", "programacion avanzada de videojuegos");
        computacion.agregarSemestre("Semestre7","inteligencia artificial", "mineria de datos", "selectivo: ingenieria financiera o microeconomia","analisis y diseno de algoritmos", "sistemas operativos", "desarrollo agil de negocios tecnologicos");
        computacion.agregarSemestre("Semestre8","administracion de proyectos de t", "data science 1", "selectivo", "redes", "arquitectura empresarial", "modelación y simulación");
        computacion.agregarSemestre("Semestre9","siseño e innovación en ingenieria 1", "computacion paralela y distribuida", "practica profesional","diseño de lenguajes de programación", "selectivo", "seguridad en sistemas de computacion");
        computacion.agregarSemestre("Semestre10","administracion y mantenimiento sistemas", "seguridad ofensiva", "construccion de compiladores", "gestion y admon detalentos", "planeacion sstrategica y operacional", "diseño e innovación en ingeniería 2");
    }
    
    public String compararCarreras(String nueva,String actual, int semestre){
       //aprobadas = matematica.buscarSemestre(1);
       pendientes.clear();
       Carrera n= buscar(nueva);
       Carrera actualc = buscar(actual);
       nuevaCarrera = n.imprimirCarrera();
       String c;
       for (int x=0; x<nuevaCarrera.size();x++){
           c = nuevaCarrera.get(x);
           if (!actualc.buscarCurso(c,semestre)){
               //Lo metes al nuevo array
               pendientes.add(c);
               
           }
       }
       String s = "";
       for (int i = 0; i < pendientes.size(); i++){
           s = s + pendientes.get(i) + "\n";
       }
       return s;

    }
    
    public Carrera buscar(String c){
        if (c == "mecanica"){
            return mecanica;
        }
        if (c == "computacion"){
            return computacion;
        }
        if (c == "matematica"){
            return matematica;
        }
        if (c == "civil"){
            return civil;
        }
        if (c == "administracion"){
            return administracion;
        }
        return null;
        
    }
}
