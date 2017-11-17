/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author marianam
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
        mecanica.agregarSemestre("Semestre1", "Pensamiento cuantitativo", "introducción a la ingeniería mecánica","dibujo mecánico", "algoritmos y programación básica", "Química general","ciudadanía global");
        mecanica.agregarSemestre("Semestre2", "cálculo1", "física 1", "manufactura digital", "ciencias dela vida", "estadística 1", "comunicación efectiva");
        mecanica.agregarSemestre("Semestre3","Cálculo 2", "Álgebra Lineal 1", "Física 2", "Materiales 1", "Soldadura industrial", "Investigación y pensamiento científico" );
        mecanica.agregarSemestre("Semestre4", "guatemala en el contexto mundial", "ecuaciones diferenciales 1", "mecanica 1: estatica", "introduccion a ingenieria electrica", "maquinas herramienta", "retos ambientes y sostenibilidad");
        mecanica.agregarSemestre("Semestre5","metodos numéricos en ingenieria mecanica", "termodinamica 1", "mecanica 2: dinamica", "resistencia de materiales 1", "selectivo (formacion general)", "emprendimiento e innovacion");
        mecanica.agregarSemestre("Semestre6","mecanica de fluidos 1", "termodinamica 2", "resistencia de materiales 2", "materiales 2", "mecanismos", "selectivo (formacion general)");
        mecanica.agregarSemestre("Semestre7", "mecanica de fluidos 2", "diseño de ingenieria mecanica 1", "transferencia de calor", "introduccion a diseño y manufactura cad cam", "procesos industriales", "economia de empresas");
        mecanica.agregarSemestre("Semestre8","máquinas electromecanicas", "vibraciones mecanicas", "motores de combustion interna", "diseño de ingenieria mecanica 2", "sistemas hidraulicos y neumaticos", "curso selectivo (area de ingenieria para el desarrollo)");
        mecanica.agregarSemestre("Semestre9", "generacion de potencia", "ingenieria economica", "energia renovable (ingenieria mecanica)", "refrigeracion y acondicionamiento de aire", "diseño e innovacion en ingenieria 1", "elementos finitos");
        mecanica.agregarSemestre("Semestre10", "sistemas de control", "gestion de mantenimiento industrial", "curso selectivo (área profesional)","gestion de proyectos", "diseño e innovacion en ingeniería 2", "practica profesional");
       
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
        civil.agregarSemestre("Semestre4","retos ambientales y sostenibilidad", "selectivo microeconomia o investigacion de operaciones", "mecanica 1 (estatica)", "carpinteria", "ecuaciones diferenciales", "Investigacion y pensamiento cientifico");
        civil.agregarSemestre("Semestre5","resistencia de materiales 1", "topografia general","mecanica de fluidos 1", "analisis estructural 1", "mecanica de suelos", "curso selectivo (formacion general)");
        civil.agregarSemestre("Semestre6","resistencia de materiales 2", "sig y geodesia", "analisis estructural 2", "cimentaciones", "curso selectivo (formacion general)", "emprendimiento e innovavion");
        civil.agregarSemestre("Semestre7","hidraulica general", "gestion de proyectos", "estructuras de madera", "concreto 1", "estructuras de acero 1", "dispositivos electricos");
        civil.agregarSemestre("Semestre8","concreto 2", "estructuras de acero 2", "hidrologia", "ingenieria sanitaria", "dispositivos electromecanicos", "curso selectivo");
        civil.agregarSemestre("Semestre9","introduccion a la ingenieria sismo resistente", "diseño de carreteras", "ingenieria economica", "administracion", "energia renovable (ingenieria mecanica)", "diseño e innovacion 1");
        civil.agregarSemestre("Semestre10","diseño de obras hidraulicas", "diseño estructural", "diseño de infraestructura vial", "elementos finitos", "eficiencia energetica en edificaciones", "diseño e innovacion 2");
      
    //Semestres de COMPUTACION
        computacion.agregarSemestre("Semestre1", "Ciencias de la Vida","Algoritmos y Programación Básica","Pensamiento Cuantitativo","Comunicación efectiva", "Química General","Introducción a la Ingeniería");
        computacion.agregarSemestre("Semestre2","Programación Orientada a Objetos", "Estadística 1", "Ciudadanía global", "Física 1","Cálculo1", "Algebra Lineal 1");
        computacion.agregarSemestre("Semestre3","Org. De Computadoras y Assembler", "Física 2", "Cálculo 2", "Programación Plataformas Móviles y Juegos", "Algoritmos y Estructuras de Datos","Guatemala en el contexto mundial");
        computacion.agregarSemestre("Semestre4","Física 3", "Matemática Discreta 1", "Retos Ambientales y sostenibilidad", "Ecuaciones Diferenciales 1", "Investigación y Pensamiento Científico", "Programación de Microprocesadores");
        computacion.agregarSemestre("Semestre5","Bases de Datos", "Ingeniería de Software 1", "Gráficaspor computadora", "Interacción Humano Computador", "Diseño de Videojuegos", "Selectivo de Desarrollo Profesional");
        computacion.agregarSemestre("Semestre6","Emprendimiento e Innovación", "Ingeniería de Software 2", "Sistemas y Tecnologías Web","Selectivo de Desarrollo Profesional", "Lógica Matemática", "Programación Avanzada de Videojuegos");
        computacion.agregarSemestre("Semestre7","Inteligencia Artificial", "Minería de Datos", "Selectivo: Ingeniería Financiera o Microeconomia","Análisis y Diseño de Algoritmos", "Sistemas Operativos", "Desarrollo Ágil de negocios tecnológicos");
        computacion.agregarSemestre("Semestre8","Administración de Proyectos de T", "Data Science 1", "Selectivo", "Redes", "Arquitectura Empresarial", "Modelación y Simulación");
        computacion.agregarSemestre("Semestre9","Diseño e Innovación en Ingeniería 1", "Computación Paralela y DistribuÍda", "Práctica Profesional","Diseño de Lenguajes de Programación", "Selectivo", "Seguridad en Sistemas de Computación");
        computacion.agregarSemestre("Semestre10","Administración y Mantenimiento sistemas", "Seguridad Ofensiva", "Construcción de Compiladores", "Gestion y admon detalentos", "Planeación Estratégica y Operacional", "Diseño e Innovación en Ingeniería 2");
    }
    
    public ArrayList<String> compararCarreras(){
       //aprobadas = matematica.buscarSemestre(1);
       pendientes.clear();;
       nuevaCarrera = mecanica.imprimirCarrera();
       String c;
       for (int x=0; x<nuevaCarrera.size();x++){
           c = nuevaCarrera.get(x);
           if (!matematica.buscarCurso(c,1)){
               //Lo metes al nuevo array
               pendientes.add(c);
               
           }
       }
       return pendientes;
        }
    
}
