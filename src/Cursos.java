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
public class Cursos extends javax.swing.JFrame {

    /**
     * Creates new form Cursos
     */
    Metodos_cursos metodos = new Metodos_cursos();
    public Cursos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        o1_1 = new javax.swing.JRadioButton();
        o1_2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        o2_1 = new javax.swing.JRadioButton();
        o2_2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        o3_1 = new javax.swing.JRadioButton();
        o3_2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        o4_1 = new javax.swing.JRadioButton();
        o4_2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        o5_1 = new javax.swing.JRadioButton();
        o5_2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        o6_1 = new javax.swing.JRadioButton();
        o6_2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        o7_1 = new javax.swing.JRadioButton();
        o7_2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        o8_1 = new javax.swing.JRadioButton();
        o8_2 = new javax.swing.JRadioButton();
        Respuesta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setText("Descubre");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel3.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("En este cuestionario, le puede ayudar a eleguir una nueva carrera ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
        );

        jLabel4.setText("1.) En tu tiempo libre prefieres:");

        o1_1.setText("Ver películas, escuchar música, cantar en el karaoke, disfrutar del teatro o de la pintura.");

        o1_2.setText("Realizar trabajos de bricolaje, por ejemplo reparaciones electrónicas o jardinería, o practicar deportes, como por ejemplo fútbol, correr, ciclismo o natación. ");

        jLabel5.setText("2.) ¿Qué tipo de trabajo se adapta mejor a ti?");

        o2_1.setText("Trabajos con jornadas laborales fijas.");

        o2_2.setText("Trabajos con jornadas laborales flexibles.");

        jLabel6.setText("3.) ¿Qué te hace sentirte más realizado?");

        o3_1.setText("Hacer un buen trabajo por mí mismo.");

        o3_2.setText("Dirigir a un grupo para conseguir mis objetivos.");

        jLabel7.setText("4.) Preferirías ser:");

        o4_1.setText("Artesano y vivir de tus habilidades profesionales.");

        o4_2.setText("Profesor o alguna profesión en la que pueda ayudar a los demás, ya que esto me aporta una gran satisfacción. ");

        jLabel8.setText("5.) Si tuvieras la oportunidad de conocer a un genio del pasado, preferirías:");

        o5_1.setText("Hablar con Einstein, preguntarle su opinión sobre algunos asuntos científicos y aprender de él su manera de pensar.");

        o5_2.setText("Hablar con Freud y sus alumnos, y conocer más sobre sus vidas y teorías como grandes psicólogos.");

        jLabel9.setText("6.) En tu opinión, ¿quién tiene mayor talento?");

        o6_1.setText("Leonardo Da Vinci - pintor, escultor, músico, arquitecto, ingeniero e inventor.");

        o6_2.setText("Bill Gates, inventor que cambio el estilo de vida de muchas personas. ");

        jLabel10.setText("7.) Te aporta una gran satisfacción y además eres bueno en:");

        o7_1.setText("Pensar, analizar y jugar a juegos de inteligencia.");

        o7_2.setText("Hacer cosas con mis propias manos.");

        jLabel11.setText("8.) Si la batidora que acabas de comprar se estropea, tú:");

        o8_1.setText("Encuentras el problema y la arreglas tú mismo.");

        o8_2.setText("Solicitas que te la cambien por otra o que el fabricante realice una reparación gratuita. ");

        Respuesta.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        Respuesta.setForeground(new java.awt.Color(51, 51, 255));
        Respuesta.setText("( )");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(o1_1)
                            .addComponent(o1_2)
                            .addComponent(o2_2)
                            .addComponent(o2_1)
                            .addComponent(jLabel5)
                            .addComponent(o3_2)
                            .addComponent(o3_1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(o4_1)
                            .addComponent(o4_2)
                            .addComponent(jLabel8)
                            .addComponent(o5_1)
                            .addComponent(o5_2)
                            .addComponent(jLabel9)
                            .addComponent(o6_1)
                            .addComponent(o6_2)
                            .addComponent(jLabel10)
                            .addComponent(o7_1)
                            .addComponent(jButton1)
                            .addComponent(o7_2)
                            .addComponent(o8_2)
                            .addComponent(o8_1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Respuesta)
                                .addGap(13, 13, 13)))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(o1_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(o1_2)
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(o2_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(o2_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(o3_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(o3_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(o4_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(o4_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(o5_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(o5_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(o6_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(o6_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(o7_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(o7_2)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Respuesta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(o8_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(o8_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(o1_2.isSelected() && o2_2.isSelected() && (o3_1.isSelected() || o3_2.isSelected()) &&
           o4_1.isSelected() && (o5_1.isSelected() || o5_2.isSelected()) && (o6_1.isSelected() || o6_2.isSelected())
           &&  o7_2.isSelected() && (o8_1.isSelected() || o8_2.isSelected())){
          Respuesta.setText(String.valueOf("Biología, de seguro te encantan \nlos animales."));  
        }
        
        if(o1_1.isSelected() && (o2_1.isSelected() || o2_2.isSelected()) && o3_1.isSelected() &&
          (o4_1.isSelected() || o4_2.isSelected()) && o5_1.isSelected()  && (o6_1.isSelected() || o6_2.isSelected())
           &&  o7_2.isSelected() && o8_1.isSelected()){
          Respuesta.setText(String.valueOf("Ingeniería mecánica, \nanaliza, fabrica y diseña."));  
        }
        
        if(o1_1.isSelected() && (o2_1.isSelected() || o2_2.isSelected()) && (o3_1.isSelected() || o3_2.isSelected()) &&
          (o4_1.isSelected() || o4_2.isSelected()) && o5_1.isSelected()   &&  o6_2.isSelected()
           && (o7_1.isSelected() || o7_2.isSelected()) && o8_1.isSelected()){
          Respuesta.setText(String.valueOf("Ingeniería en Ciencia de la Computación, \n¿Listo para crear?."));  
        }
        
        if(o1_1.isSelected() && o2_2.isSelected() && o3_1.isSelected() &&
          o4_2.isSelected() && o5_1.isSelected()  && (o6_1.isSelected() || o6_2.isSelected())
           && o7_1.isSelected() && (o8_1.isSelected() || o8_2.isSelected())){
          Respuesta.setText(String.valueOf("Matemática Aplicada, \nCambia el presente y el futuro."));  
        }
        
        if((o1_1.isSelected() || o1_2.isSelected()) && o2_1.isSelected() && o3_2.isSelected() &&
          o4_2.isSelected() && (o5_1.isSelected() || o5_2.isSelected())  && o6_2.isSelected() && 
          (o7_1.isSelected() || o7_2.isSelected()) && (o8_1.isSelected() || o8_2.isSelected())){
          Respuesta.setText(String.valueOf("Ingeniería en Ciencia de la Administración, \nOrganiza el mundo."));  
        }
        
        if((o1_1.isSelected() || o1_2.isSelected()) && o2_1.isSelected() && o3_2.isSelected() &&
          (o4_1.isSelected() || o4_2.isSelected()) && o5_2.isSelected()  && (o6_1.isSelected() || o6_2.isSelected()) && 
           o7_1.isSelected() && o8_2.isSelected()){
          Respuesta.setText(String.valueOf("Ingeniería Industrial, \nHaz Efectivo el mundo."));  
        }
        
         if((o1_1.isSelected() || o1_2.isSelected()) && (o2_1.isSelected() || o2_2.isSelected()) && (o3_1.isSelected() || o3_2.isSelected()) &&
           o4_2.isSelected() && o5_1.isSelected()  && o6_2.isSelected() && 
           (o7_1.isSelected() || o7_2.isSelected()) && (o8_1.isSelected() || o8_2.isSelected())){
          Respuesta.setText(String.valueOf("Quimica Pura, \nCrea soluciones."));  
        }
         
         if((o1_1.isSelected() || o1_2.isSelected()) && (o2_1.isSelected() || o2_2.isSelected()) && (o3_1.isSelected() || o3_2.isSelected()) &&
           o4_2.isSelected() && o5_1.isSelected()  && o6_2.isSelected() && 
           (o7_1.isSelected() || o7_2.isSelected()) && (o8_1.isSelected() || o8_2.isSelected())){
          Respuesta.setText(String.valueOf("Quimica Pura, \nCrea soluciones."));  
        }
         
         else{
         Respuesta.setText(String.valueOf("Ingeniería Industrial, \nHaz Efectivo el mundo."));
         }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Respuesta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton o1_1;
    private javax.swing.JRadioButton o1_2;
    private javax.swing.JRadioButton o2_1;
    private javax.swing.JRadioButton o2_2;
    private javax.swing.JRadioButton o3_1;
    private javax.swing.JRadioButton o3_2;
    private javax.swing.JRadioButton o4_1;
    private javax.swing.JRadioButton o4_2;
    private javax.swing.JRadioButton o5_1;
    private javax.swing.JRadioButton o5_2;
    private javax.swing.JRadioButton o6_1;
    private javax.swing.JRadioButton o6_2;
    private javax.swing.JRadioButton o7_1;
    private javax.swing.JRadioButton o7_2;
    private javax.swing.JRadioButton o8_1;
    private javax.swing.JRadioButton o8_2;
    // End of variables declaration//GEN-END:variables
}
