
import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anonyme
 */
public class ConsulterListeFournisseurs extends javax.swing.JFrame {

    /**
     * Creates new form ConsulterListeClients
     */
    public ConsulterListeFournisseurs() {
        initComponents();
        
        DB.SelectNumFournisseurDB();
        for(int i=0; i<DB.fournisseurs.size(); i++)
            NumFournisseur.addItem(DB.fournisseurs.get(i).getNum());
        
        if (NumFournisseur.getSelectedIndex()!= -1) {
        Nom.setText(DB.fournisseurs.get(0).getNom());
        Prenom.setText(DB.fournisseurs.get(0).getPrenom());
        Adresse.setText(DB.fournisseurs.get(0).getAdresse());
        Civilite.setText(DB.fournisseurs.get(0).getCivilite());
        Societe.setText(DB.fournisseurs.get(0).getSociete());
        Email.setText(DB.fournisseurs.get(0).getEmail());
        Ville.setText(DB.fournisseurs.get(0).getCodePostal());
        Ville.setText(DB.fournisseurs.get(0).getVille());
        Pays.setText(DB.fournisseurs.get(0).getPays());
        Telephone.setText(DB.fournisseurs.get(0).getTelephone());
        Mobile.setText(DB.fournisseurs.get(0).getMobile());
        Fax.setText(DB.fournisseurs.get(0).getFax());
        CodePostal.setText(DB.fournisseurs.get(0).getCodePostal());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Adresse = new javax.swing.JTextArea();
        Mobile1 = new javax.swing.JLabel();
        Fax1 = new javax.swing.JLabel();
        Email1 = new javax.swing.JLabel();
        Adresse1 = new javax.swing.JLabel();
        Retour = new javax.swing.JButton();
        Nom = new javax.swing.JTextField();
        Civilite = new javax.swing.JTextField();
        Prenom = new javax.swing.JTextField();
        Ville = new javax.swing.JTextField();
        Pays = new javax.swing.JTextField();
        CodePostal = new javax.swing.JTextField();
        Telephone = new javax.swing.JTextField();
        NumFournisseur1 = new javax.swing.JLabel();
        Fax = new javax.swing.JTextField();
        NomClient1 = new javax.swing.JLabel();
        Societe = new javax.swing.JTextField();
        PrenomClient1 = new javax.swing.JLabel();
        Mobile = new javax.swing.JTextField();
        Civilite1 = new javax.swing.JLabel();
        Ville1 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Codepostal1 = new javax.swing.JLabel();
        NumFournisseur = new javax.swing.JComboBox<>();
        Societe1 = new javax.swing.JLabel();
        Pays1 = new javax.swing.JLabel();
        Telephone1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultation");

        Adresse.setEditable(false);
        Adresse.setColumns(20);
        Adresse.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        Adresse.setRows(5);
        jScrollPane1.setViewportView(Adresse);

        Mobile1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Mobile1.setText("Mobile :");

        Fax1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Fax1.setText("Fax :");

        Email1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Email1.setText("Email :");

        Adresse1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Adresse1.setText("Adresse :");

        Retour.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Retour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-greater-than-100.png"))); // NOI18N
        Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });

        Nom.setEditable(false);
        Nom.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        Civilite.setEditable(false);
        Civilite.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        Prenom.setEditable(false);
        Prenom.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        Ville.setEditable(false);
        Ville.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        Pays.setEditable(false);
        Pays.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        CodePostal.setEditable(false);
        CodePostal.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        Telephone.setEditable(false);
        Telephone.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        NumFournisseur1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        NumFournisseur1.setText("N°Fournisseur :");

        Fax.setEditable(false);
        Fax.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        NomClient1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        NomClient1.setText("Nom :");

        Societe.setEditable(false);
        Societe.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        PrenomClient1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        PrenomClient1.setText("Prenom :");

        Mobile.setEditable(false);
        Mobile.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        Civilite1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Civilite1.setText("Civilité :");

        Ville1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Ville1.setText("Ville :");

        Email.setEditable(false);
        Email.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        Codepostal1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Codepostal1.setText("Code postal :");

        NumFournisseur.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        NumFournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumFournisseurActionPerformed(evt);
            }
        });

        Societe1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Societe1.setText("Société :");

        Pays1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Pays1.setText("Pays :");

        Telephone1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Telephone1.setText("Telephone :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Retour, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumFournisseur1)
                            .addComponent(NomClient1)
                            .addComponent(PrenomClient1)
                            .addComponent(Civilite1)
                            .addComponent(Societe1)
                            .addComponent(Adresse1))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Societe, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nom, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumFournisseur, javax.swing.GroupLayout.Alignment.LEADING, 0, 140, Short.MAX_VALUE)
                            .addComponent(Civilite, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Prenom, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pays1)
                            .addComponent(Telephone1)
                            .addComponent(Fax1)
                            .addComponent(Ville1)
                            .addComponent(Codepostal1)
                            .addComponent(Mobile1)
                            .addComponent(Email1))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Fax, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(Telephone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pays, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ville, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CodePostal, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mobile)
                            .addComponent(Email))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumFournisseur1)
                    .addComponent(NumFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Codepostal1)
                    .addComponent(CodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomClient1)
                    .addComponent(Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ville1)
                    .addComponent(Ville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrenomClient1)
                    .addComponent(Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pays1)
                    .addComponent(Pays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Civilite1)
                    .addComponent(Civilite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Telephone1)
                    .addComponent(Telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Societe1)
                    .addComponent(Societe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fax1)
                    .addComponent(Fax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Adresse1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Mobile1)
                                .addComponent(Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Email1)
                                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30)
                .addComponent(Retour, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
        Interface I = new Interface();
        I.show();
        this.dispose();
    }//GEN-LAST:event_RetourActionPerformed

    private void NumFournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumFournisseurActionPerformed
        int i=0;
        while (Integer.parseInt(DB.fournisseurs.get(i).getNum()) != Integer.parseInt(NumFournisseur.getSelectedItem().toString())) i++;
        
        Nom.setText(DB.fournisseurs.get(i).getNom());
        Prenom.setText(DB.fournisseurs.get(i).getPrenom());
        Adresse.setText(DB.fournisseurs.get(i).getAdresse());
        Civilite.setText(DB.fournisseurs.get(i).getCivilite());
        Societe.setText(DB.fournisseurs.get(i).getSociete());
        Email.setText(DB.fournisseurs.get(i).getEmail());
        Ville.setText(DB.fournisseurs.get(i).getCodePostal());
        Ville.setText(DB.fournisseurs.get(i).getVille());
        Pays.setText(DB.fournisseurs.get(i).getPays());
        Telephone.setText(DB.fournisseurs.get(i).getTelephone());
        Mobile.setText(DB.fournisseurs.get(i).getMobile());
        Fax.setText(DB.fournisseurs.get(i).getFax());
        CodePostal.setText(DB.fournisseurs.get(i).getCodePostal());
    }//GEN-LAST:event_NumFournisseurActionPerformed

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
            java.util.logging.Logger.getLogger(ConsulterListeClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsulterListeClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsulterListeClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsulterListeClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsulterListeClients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Adresse;
    private javax.swing.JLabel Adresse1;
    private javax.swing.JTextField Civilite;
    private javax.swing.JLabel Civilite1;
    private javax.swing.JTextField CodePostal;
    private javax.swing.JLabel Codepostal1;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel Email1;
    private javax.swing.JTextField Fax;
    private javax.swing.JLabel Fax1;
    private javax.swing.JTextField Mobile;
    private javax.swing.JLabel Mobile1;
    private javax.swing.JTextField Nom;
    private javax.swing.JLabel NomClient1;
    public static javax.swing.JComboBox<String> NumFournisseur;
    private javax.swing.JLabel NumFournisseur1;
    private javax.swing.JTextField Pays;
    private javax.swing.JLabel Pays1;
    private javax.swing.JTextField Prenom;
    private javax.swing.JLabel PrenomClient1;
    private javax.swing.JButton Retour;
    private javax.swing.JTextField Societe;
    private javax.swing.JLabel Societe1;
    private javax.swing.JTextField Telephone;
    private javax.swing.JLabel Telephone1;
    private javax.swing.JTextField Ville;
    private javax.swing.JLabel Ville1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
