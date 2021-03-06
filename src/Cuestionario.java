
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Alexander Trujillo, Carné 17189
 * @author Mariana Morales, Carné 17235
 * @author Estefania Barrio, Carné 17927
 * @version 11/16/201
 */
public class Cuestionario extends javax.swing.JFrame {
DB db;
DBCollection tabla;
    /**
     * Creates new form Cuestionario
     */
        
    JFreeChart Grafica; 
    DefaultCategoryDataset Datos = new DefaultCategoryDataset();
    JFreeChart Grafica2; 
    DefaultCategoryDataset Datos2 = new DefaultCategoryDataset();
    JFreeChart Grafica3; 
    DefaultCategoryDataset Datos3 = new DefaultCategoryDataset();
    JFreeChart Grafica4; 
    DefaultCategoryDataset Datos4 = new DefaultCategoryDataset();
    JFreeChart Grafica5; 
    DefaultCategoryDataset Datos5 = new DefaultCategoryDataset();
    JFreeChart Grafica6; 
    DefaultCategoryDataset Datos6 = new DefaultCategoryDataset();
    Base b = new Base();
     
    public Cuestionario() throws UnknownHostException {
        
        MongoClient mongo = new MongoClient();//Permite el accesso a la base de datos
        Morphia morphia = new Morphia();//crea un objeto tipo morphia
        morphia.mapPackage("default package");////Permite usar morphia para poder traducir de java a mongo
        Datastore ds = morphia.createDatastore((MongoClient) (Mongo) mongo, "BaseE"); // Base Dato
        Query<Base> query;// crea un query 
        
        query = ds.createQuery(Base.class);//crea el query 
        List<Base> bases = query.asList();//mete la lita de query en la base de datos
        Base Respuestas = bases.get(0);//saca el pimer valor de la base 
        
        for (Base miBase: bases){
            ds.delete(miBase);//borra la base vieja
        }
        ds.save(Respuestas);//Guarda la nueva base
        //observar la base de datos
        query = ds.createQuery(Base.class);
        bases = query.asList();
        for (Base miBase: bases){
            System.out.println(miBase.numeroP1_1);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        P1_1 = new javax.swing.JRadioButton();
        P1_3 = new javax.swing.JRadioButton();
        P1_2 = new javax.swing.JRadioButton();
        P1_4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        P2_1 = new javax.swing.JRadioButton();
        P2_3 = new javax.swing.JRadioButton();
        P2_2 = new javax.swing.JRadioButton();
        P2_4 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        P3_1 = new javax.swing.JRadioButton();
        P3_2 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        P4_1 = new javax.swing.JRadioButton();
        P4_2 = new javax.swing.JRadioButton();
        P4_3 = new javax.swing.JRadioButton();
        P4_4 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        P5_1 = new javax.swing.JRadioButton();
        P5_2 = new javax.swing.JRadioButton();
        P5_3 = new javax.swing.JRadioButton();
        P5_4 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        P6_1 = new javax.swing.JRadioButton();
        P6_2 = new javax.swing.JRadioButton();
        P6_3 = new javax.swing.JRadioButton();
        P6_4 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cuestionario de cambio de carrera ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 286, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        jLabel2.setText("-Cuanto tiempo a meditado esta decisión: ");

        buttonGroup1.add(P1_1);
        P1_1.setText("Una semana ");
        P1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1_1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(P1_3);
        P1_3.setText("Hace un mes aproximadamente");

        buttonGroup1.add(P1_2);
        P1_2.setText("Desde este semestre ");

        buttonGroup1.add(P1_4);
        P1_4.setText("Desde el semestre pasado");

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar Respuestas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Revisar la gráfica");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("-Con quien más lo hablado: ");

        buttonGroup2.add(P2_1);
        P2_1.setText("Con mis papas");
        P2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2_1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(P2_3);
        P2_3.setText("Con mis profesores y director de carrera");

        buttonGroup2.add(P2_2);
        P2_2.setText("Con mis amigos");
        P2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2_2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(P2_4);
        P2_4.setText("Con nadie");

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Revisar la gráfica");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("-¿Tienen una buena relación con el jefe de carrera?");

        buttonGroup3.add(P3_1);
        P3_1.setText("Si");
        P3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3_1ActionPerformed(evt);
            }
        });

        buttonGroup3.add(P3_2);
        P3_2.setText("No");

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Revisar la gráfica");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Revisar la gráfica");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        buttonGroup4.add(P4_1);
        P4_1.setText("Muy poco");
        P4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4_1ActionPerformed(evt);
            }
        });

        buttonGroup4.add(P4_2);
        P4_2.setText("Creo tener una idea");

        buttonGroup4.add(P4_3);
        P4_3.setText("Lo suficiente");

        buttonGroup4.add(P4_4);
        P4_4.setText("Me he informado bien");

        jLabel8.setText("-¿Que tan conoces de la nueva carrera? ");

        jButton6.setBackground(new java.awt.Color(153, 153, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Revisar la gráfica");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        buttonGroup5.add(P5_1);
        P5_1.setText("Siento mucha dificultad");
        P5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P5_1ActionPerformed(evt);
            }
        });

        buttonGroup5.add(P5_2);
        P5_2.setText("Me parece aburrida la actual");
        P5_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P5_2ActionPerformed(evt);
            }
        });

        buttonGroup5.add(P5_3);
        P5_3.setText("Alguien mas me obligo a llevarla");

        buttonGroup5.add(P5_4);
        P5_4.setText("Mas de una de las razones anteriores");

        jLabel9.setText("-¿Por que razon lo hace?");

        jButton7.setBackground(new java.awt.Color(153, 153, 255));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Revisar la gráfica");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        buttonGroup6.add(P6_1);
        P6_1.setText("Muchas diferencia");
        P6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P6_1ActionPerformed(evt);
            }
        });

        buttonGroup6.add(P6_2);
        P6_2.setText("Alejarme de un tema en especifico");

        buttonGroup6.add(P6_3);
        P6_3.setText("Alejarme de los compañeros de la anterior carrera");

        buttonGroup6.add(P6_4);
        P6_4.setText("Pocas diferencias");

        jLabel10.setText("-¿Que esperas de la nueva carrera?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(P1_1)
                                    .addComponent(P1_2)
                                    .addComponent(jButton1))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(P1_4)
                                    .addComponent(P1_3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P3_1)
                                .addGap(21, 21, 21)
                                .addComponent(P3_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(P4_3)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(P4_4)
                                            .addComponent(P4_2)))
                                    .addComponent(P4_1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(P6_1)
                                    .addComponent(P6_3))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P6_2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P6_4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton7))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(P5_1)
                                    .addComponent(P5_3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(P5_4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P5_2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton6))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P2_1)
                            .addComponent(P2_2))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P2_4)
                            .addComponent(P2_3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(15, 66, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(P1_1)
                            .addComponent(P1_3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(P1_2)
                            .addComponent(P1_4))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(P2_1)
                            .addComponent(P2_3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(P2_2)
                            .addComponent(P2_4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(P3_1)
                            .addComponent(P3_2)
                            .addComponent(jButton4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton2)
                        .addGap(59, 59, 59)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(P4_1)
                            .addComponent(P4_2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(P4_3)
                            .addComponent(P4_4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton5)))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P5_1)
                    .addComponent(P5_2)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P5_3)
                    .addComponent(P5_4))
                .addGap(13, 13, 13)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P6_1)
                    .addComponent(P6_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P6_3)
                    .addComponent(P6_4)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void P1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1_1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_P1_1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BasicDBObject document= new BasicDBObject();
        
        if(P1_1.isSelected()){
         b.numeroP1_1 = b.numero +1;
         document.put("p1_1", ""+b.numeroP1_1+"");
         tabla.insert(document);}
        if(P1_2.isSelected()){
            b.numeroP1_2 = b.numero +1;}
        if(P1_3.isSelected()){
            b.numeroP1_3 = b.numero +1;}
        if(P1_4.isSelected()){
            b.numeroP1_4 = b.numero +1;}
        
        Datos.addValue(b.numeroP1_1,"Cuestionario", "Una semana ");
        Datos.addValue(b.numeroP1_2,"Cuestionario", "Hace un mes aproximadamente");
        Datos.addValue(b.numeroP1_3,"Cuestionario", "Desde este semestre ");
        Datos.addValue(b.numeroP1_4,"Cuestionario", "Desde el semestre pasado");
        Grafica = ChartFactory.createBarChart("Respuestas de la pregunta", 
                "Opciones", "Número de respuestas", Datos,
        PlotOrientation.HORIZONTAL , true, true, false);
        
          if(P2_1.isSelected()){
           b.numeroP2_1 = b.numero +1;}
        if(P2_2.isSelected()){
            b.numeroP2_2 = b.numero +1;}
        if(P2_3.isSelected()){
            b.numeroP2_3 = b.numero +1;}
        if(P2_4.isSelected()){
            b.numeroP2_4 = b.numero +1;}
        
        Datos2.addValue(b.numeroP2_1,"Cuestionario", "Con mis papas");
        Datos2.addValue(b.numeroP2_2,"Cuestionario", "Con mis amigos");
        Datos2.addValue(b.numeroP2_3,"Cuestionario", "Con mis profesores y director de carrera");
        Datos2.addValue(b.numeroP2_4,"Cuestionario", "Con nadie");
        Grafica2 = ChartFactory.createBarChart("Respuestas de la pregunta", 
                "Opciones", "Número de respuestas", Datos2,
        PlotOrientation.HORIZONTAL , true, true, false);
        
        if(P3_1.isSelected()){
           b.numeroP3_1 = b.numero +1;}
        if(P3_2.isSelected()){
            b.numeroP3_2 = b.numero +1;}
       
        Datos3.addValue(b.numeroP3_1,"Cuestionario", "Si");
        Datos3.addValue(b.numeroP3_2,"Cuestionario", "No");
        Grafica3 = ChartFactory.createBarChart("Respuestas de la pregunta", 
                "Opciones", "Número de respuestas", Datos3,
        PlotOrientation.HORIZONTAL , true, true, false);
        
        if(P4_1.isSelected()){
           b.numeroP4_1 = b.numero +1;}
        if(P4_2.isSelected()){
            b.numeroP4_2 = b.numero +1;}
        if(P4_3.isSelected()){
            b.numeroP4_3 = b.numero +1;}
        if(P4_4.isSelected()){
            b.numeroP4_4 = b.numero +1;}
       
        Datos4.addValue(b.numeroP4_1,"Cuestionario", "Muy poco");
        Datos4.addValue(b.numeroP4_2,"Cuestionario", "Creo tener una idea");
        Datos4.addValue(b.numeroP4_3,"Cuestionario", "Lo suficiente");
        Datos4.addValue(b.numeroP4_4,"Cuestionario", "Me he informado bien");
        Grafica4 = ChartFactory.createBarChart("Respuestas de la pregunta", 
                "Opciones", "Número de respuestas", Datos4,
        PlotOrientation.HORIZONTAL , true, true, false);
        
        if(P5_1.isSelected()){
           b.numeroP5_1 = b.numero +1;}
        if(P5_2.isSelected()){
            b.numeroP5_2 = b.numero +1;}
        if(P5_3.isSelected()){
            b.numeroP5_3 = b.numero +1;}
        if(P5_4.isSelected()){
            b.numeroP5_4 = b.numero +1;}
       
        Datos5.addValue(b.numeroP5_1,"Cuestionario", "Siento mucha dificultad");
        Datos5.addValue(b.numeroP5_2,"Cuestionario", "Alguien mas me obligo a llevarla");
        Datos5.addValue(b.numeroP5_3,"Cuestionario", "Me parece aburrida la actual");
        Datos5.addValue(b.numeroP5_4,"Cuestionario", "Mas de una de las razones anteriores");
        Grafica5 = ChartFactory.createBarChart("Respuestas de la pregunta", 
                "Opciones", "Número de respuestas", Datos5,
        PlotOrientation.HORIZONTAL , true, true, false);
        
         if(P6_1.isSelected()){
           b.numeroP6_1 = b.numero +1;}
        if(P6_2.isSelected()){
            b.numeroP6_2 = b.numero +1;}
        if(P6_3.isSelected()){
            b.numeroP6_3 = b.numero +1;}
        if(P6_4.isSelected()){
            b.numeroP6_4 = b.numero +1;}
       
        Datos6.addValue(b.numeroP6_1,"Cuestionario", "Muchas diferencia");
        Datos6.addValue(b.numeroP6_2,"Cuestionario", "Alejarme de un tema en especifico");
        Datos6.addValue(b.numeroP6_3,"Cuestionario", "Alejarme de los compañeros de la anterior carrera");
        Datos6.addValue(b.numeroP6_4,"Cuestionario", "Pocas diferencias");
        Grafica6 = ChartFactory.createBarChart("Respuestas de la pregunta", 
                "Opciones", "Número de respuestas", Datos6,
        PlotOrientation.HORIZONTAL , true, true, false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ChartPanel Panel = new ChartPanel(Grafica);
        JFrame Ventana = new JFrame();
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void P2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2_1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ChartPanel Panel2 = new ChartPanel(Grafica2);
        JFrame Ventana = new JFrame();
        Ventana.getContentPane().add(Panel2);
        Ventana.pack();
        Ventana.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void P3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3_1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ChartPanel Panel3 = new ChartPanel(Grafica3);
        JFrame Ventana = new JFrame();
        Ventana.getContentPane().add(Panel3);
        Ventana.pack();
        Ventana.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ChartPanel Panel4 = new ChartPanel(Grafica4);
        JFrame Ventana = new JFrame();
        Ventana.getContentPane().add(Panel4);
        Ventana.pack();
        Ventana.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void P4_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P4_1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        ChartPanel Panel5 = new ChartPanel(Grafica5);
        JFrame Ventana = new JFrame();
        Ventana.getContentPane().add(Panel5);
        Ventana.pack();
        Ventana.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void P5_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P5_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P5_1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        ChartPanel Panel6 = new ChartPanel(Grafica6);
        JFrame Ventana = new JFrame();
        Ventana.getContentPane().add(Panel6);
        Ventana.pack();
        Ventana.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void P6_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P6_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P6_1ActionPerformed

    private void P5_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P5_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P5_2ActionPerformed

    private void P2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2_2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Cuestionario().setVisible(true);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton P1_1;
    private javax.swing.JRadioButton P1_2;
    private javax.swing.JRadioButton P1_3;
    private javax.swing.JRadioButton P1_4;
    private javax.swing.JRadioButton P2_1;
    private javax.swing.JRadioButton P2_2;
    private javax.swing.JRadioButton P2_3;
    private javax.swing.JRadioButton P2_4;
    private javax.swing.JRadioButton P3_1;
    private javax.swing.JRadioButton P3_2;
    private javax.swing.JRadioButton P4_1;
    private javax.swing.JRadioButton P4_2;
    private javax.swing.JRadioButton P4_3;
    private javax.swing.JRadioButton P4_4;
    private javax.swing.JRadioButton P5_1;
    private javax.swing.JRadioButton P5_2;
    private javax.swing.JRadioButton P5_3;
    private javax.swing.JRadioButton P5_4;
    private javax.swing.JRadioButton P6_1;
    private javax.swing.JRadioButton P6_2;
    private javax.swing.JRadioButton P6_3;
    private javax.swing.JRadioButton P6_4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables
}
