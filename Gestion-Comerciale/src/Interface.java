/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anonyme
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
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

        ModifierClient = new javax.swing.JButton();
        EnregistrerClient = new javax.swing.JButton();
        ConsulterClients = new javax.swing.JButton();
        SeDeconnecter = new javax.swing.JButton();
        SupprimerClient1 = new javax.swing.JButton();
        EnregistrerFourniseur = new javax.swing.JButton();
        ConsulterFourniseurs = new javax.swing.JButton();
        SupprimerFourniseur = new javax.swing.JButton();
        ModifierFourniseur = new javax.swing.JButton();
        Clients = new javax.swing.JLabel();
        Fourniseurs = new javax.swing.JLabel();
        ConsulterProduits = new javax.swing.JButton();
        SupprimerProduit = new javax.swing.JButton();
        ModifierProduit = new javax.swing.JButton();
        EnregistrerProduit = new javax.swing.JButton();
        Produits = new javax.swing.JLabel();
        FacturesClient = new javax.swing.JButton();
        Clients1 = new javax.swing.JLabel();
        Fournisseurs1 = new javax.swing.JLabel();
        Produits1 = new javax.swing.JLabel();
        ReglementClient = new javax.swing.JButton();
        ReglementFournisseur = new javax.swing.JButton();
        FacturesFournisseur = new javax.swing.JButton();
        Saisie_Versement = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenu(e)");
        setResizable(false);

        ModifierClient.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        ModifierClient.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANONYME\\Documents\\gestion_commercial\\src\\icon\\icons8-approuver-et-mettre-à-jour-24.png")); // NOI18N
        ModifierClient.setText("Update");
        ModifierClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierClientActionPerformed(evt);
            }
        });

        EnregistrerClient.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        EnregistrerClient.setText("New");
        EnregistrerClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnregistrerClientActionPerformed(evt);
            }
        });

        ConsulterClients.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        ConsulterClients.setText("Show Client");
        ConsulterClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsulterClientsActionPerformed(evt);
            }
        });

        SeDeconnecter.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        SeDeconnecter.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANONYME\\Documents\\gestion_commercial\\src\\icon\\icons8-annuler-26.png")); // NOI18N
        SeDeconnecter.setText("Sign Out");
        SeDeconnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeDeconnecterActionPerformed(evt);
            }
        });

        SupprimerClient1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        SupprimerClient1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANONYME\\Documents\\gestion_commercial\\src\\icon\\icons8-annuler-26.png")); // NOI18N
        SupprimerClient1.setText("Delete");
        SupprimerClient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerClient1ActionPerformed(evt);
            }
        });

        EnregistrerFourniseur.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        EnregistrerFourniseur.setText("New");
        EnregistrerFourniseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnregistrerFourniseurActionPerformed(evt);
            }
        });

        ConsulterFourniseurs.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        ConsulterFourniseurs.setText("Show Fournisseur");
        ConsulterFourniseurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsulterFourniseursActionPerformed(evt);
            }
        });

        SupprimerFourniseur.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        SupprimerFourniseur.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANONYME\\Documents\\gestion_commercial\\src\\icon\\icons8-annuler-26.png")); // NOI18N
        SupprimerFourniseur.setText("Delete");
        SupprimerFourniseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerFourniseurActionPerformed(evt);
            }
        });

        ModifierFourniseur.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        ModifierFourniseur.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANONYME\\Documents\\gestion_commercial\\src\\icon\\icons8-approuver-et-mettre-à-jour-24.png")); // NOI18N
        ModifierFourniseur.setText("Update");
        ModifierFourniseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierFourniseurActionPerformed(evt);
            }
        });

        ConsulterProduits.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        ConsulterProduits.setText("Show Product");
        ConsulterProduits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsulterProduitsActionPerformed(evt);
            }
        });

        SupprimerProduit.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        SupprimerProduit.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANONYME\\Documents\\gestion_commercial\\src\\icon\\icons8-annuler-26.png")); // NOI18N
        SupprimerProduit.setText("Delete");
        SupprimerProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerProduitActionPerformed(evt);
            }
        });

        ModifierProduit.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        ModifierProduit.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANONYME\\Documents\\gestion_commercial\\src\\icon\\icons8-approuver-et-mettre-à-jour-24.png")); // NOI18N
        ModifierProduit.setText("Update");
        ModifierProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierProduitActionPerformed(evt);
            }
        });

        EnregistrerProduit.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        EnregistrerProduit.setText("New");
        EnregistrerProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnregistrerProduitActionPerformed(evt);
            }
        });

        FacturesClient.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        FacturesClient.setText("Facture Client");
        FacturesClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturesClientActionPerformed(evt);
            }
        });

        Clients1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Clients1.setText("Clients");

        Fournisseurs1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Fournisseurs1.setText("Fournisseurs");

        Produits1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Produits1.setText("Produits");

        ReglementClient.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        ReglementClient.setText("Reglement Client");
        ReglementClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReglementClientActionPerformed(evt);
            }
        });

        ReglementFournisseur.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        ReglementFournisseur.setText("Reglement Fournisseur");
        ReglementFournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReglementFournisseurActionPerformed(evt);
            }
        });

        FacturesFournisseur.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        FacturesFournisseur.setText("facture Fournisseur");
        FacturesFournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturesFournisseurActionPerformed(evt);
            }
        });

        Saisie_Versement.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Saisie_Versement.setText("Saisie Versement");
        Saisie_Versement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Saisie_VersementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(Clients))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(Clients1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 349, Short.MAX_VALUE)
                        .addComponent(Produits1)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(Fourniseurs)
                        .addGap(59, 59, 59)
                        .addComponent(Produits))))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EnregistrerClient, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ReglementClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FacturesClient)
                            .addComponent(ModifierClient, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SupprimerClient1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConsulterClients)
                            .addComponent(Saisie_Versement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 247, Short.MAX_VALUE)
                                .addComponent(SeDeconnecter)
                                .addGap(20, 20, 20))
                            .addComponent(FacturesFournisseur)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ModifierFourniseur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SupprimerFourniseur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ConsulterFourniseurs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EnregistrerFourniseur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ModifierProduit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SupprimerProduit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ConsulterProduits, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EnregistrerProduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(Fournisseurs1)
                            .addComponent(ReglementFournisseur)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Clients)
                            .addComponent(Fourniseurs)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Produits)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Clients1)
                        .addComponent(Fournisseurs1))
                    .addComponent(Produits1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EnregistrerClient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ModifierClient, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ModifierFourniseur, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ModifierProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SupprimerClient1)
                            .addComponent(SupprimerFourniseur)
                            .addComponent(SupprimerProduit)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EnregistrerFourniseur)
                        .addComponent(EnregistrerProduit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConsulterClients, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsulterFourniseurs, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsulterProduits, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FacturesClient, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FacturesFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ReglementFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(ReglementClient, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeDeconnecter, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Saisie_Versement))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ModifierClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierClientActionPerformed
        ModifierUnClient I = new ModifierUnClient();
        I.show();
        this.dispose();
    }//GEN-LAST:event_ModifierClientActionPerformed

    private void EnregistrerClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnregistrerClientActionPerformed
        EnregistrerUnClient I = new EnregistrerUnClient();
        I.show();
        this.dispose();
    }//GEN-LAST:event_EnregistrerClientActionPerformed

    private void ConsulterClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsulterClientsActionPerformed
        ConsulterListeClients I = new ConsulterListeClients();
        I.show();
        this.dispose();
    }//GEN-LAST:event_ConsulterClientsActionPerformed

    private void SeDeconnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeDeconnecterActionPerformed
        DB.CloseDB();
        SeConnecter I = new SeConnecter();
        I.show();
        this.dispose();
    }//GEN-LAST:event_SeDeconnecterActionPerformed

    private void SupprimerClient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerClient1ActionPerformed
        SupprimerUnClient I = new SupprimerUnClient();
        I.show();
        this.dispose();
    }//GEN-LAST:event_SupprimerClient1ActionPerformed

    private void EnregistrerFourniseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnregistrerFourniseurActionPerformed
        EnregistrerUnFournisseur I = new EnregistrerUnFournisseur();
        I.show();
        this.dispose();
    }//GEN-LAST:event_EnregistrerFourniseurActionPerformed

    private void ConsulterFourniseursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsulterFourniseursActionPerformed
        ConsulterListeFournisseurs I = new ConsulterListeFournisseurs();
        I.show();
        this.dispose();
    }//GEN-LAST:event_ConsulterFourniseursActionPerformed

    private void SupprimerFourniseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerFourniseurActionPerformed
        SupprimerUnFournisseur I = new SupprimerUnFournisseur();
        I.show();
        this.dispose();
    }//GEN-LAST:event_SupprimerFourniseurActionPerformed

    private void ModifierFourniseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierFourniseurActionPerformed
        ModifierUnFournisseur I = new ModifierUnFournisseur();
        I.show();
        this.dispose();
    }//GEN-LAST:event_ModifierFourniseurActionPerformed

    private void ConsulterProduitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsulterProduitsActionPerformed
        ConsulterListeProduits I = new ConsulterListeProduits();
        I.show();
        this.dispose();
    }//GEN-LAST:event_ConsulterProduitsActionPerformed

    private void SupprimerProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerProduitActionPerformed
        SupprimerUnProduit I = new SupprimerUnProduit();
        I.show();
        this.dispose();
    }//GEN-LAST:event_SupprimerProduitActionPerformed

    private void ModifierProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierProduitActionPerformed
        ModifierUnProduit I = new ModifierUnProduit();
        I.show();
        this.dispose();
    }//GEN-LAST:event_ModifierProduitActionPerformed

    private void EnregistrerProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnregistrerProduitActionPerformed
        EnregistrerUnProduit I = new EnregistrerUnProduit();
        I.show();
        this.dispose();
    }//GEN-LAST:event_EnregistrerProduitActionPerformed

    private void FacturesClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturesClientActionPerformed
        FacturesClient I = new FacturesClient();
        I.show();
        this.dispose();
    }//GEN-LAST:event_FacturesClientActionPerformed

    private void ReglementClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReglementClientActionPerformed
        ReglementClient I = new ReglementClient();
        I.show();
        this.dispose();
    }//GEN-LAST:event_ReglementClientActionPerformed

    private void ReglementFournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReglementFournisseurActionPerformed
        ReglementFournisseur I = new ReglementFournisseur();
        I.show();
        this.dispose();
    }//GEN-LAST:event_ReglementFournisseurActionPerformed

    private void FacturesFournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturesFournisseurActionPerformed
        FacturesFournisseur I = new FacturesFournisseur();
        I.show();
        this.dispose();
    }//GEN-LAST:event_FacturesFournisseurActionPerformed

    private void Saisie_VersementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Saisie_VersementActionPerformed
        // TODO add your handling code here:
       SV_Client S = new SV_Client();
       S.show();
       this.dispose();
    }//GEN-LAST:event_Saisie_VersementActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clients;
    private javax.swing.JLabel Clients1;
    private javax.swing.JButton ConsulterClients;
    private javax.swing.JButton ConsulterFourniseurs;
    private javax.swing.JButton ConsulterProduits;
    private javax.swing.JButton EnregistrerClient;
    private javax.swing.JButton EnregistrerFourniseur;
    private javax.swing.JButton EnregistrerProduit;
    private javax.swing.JButton FacturesClient;
    private javax.swing.JButton FacturesFournisseur;
    private javax.swing.JLabel Fourniseurs;
    private javax.swing.JLabel Fournisseurs1;
    private javax.swing.JButton ModifierClient;
    private javax.swing.JButton ModifierFourniseur;
    private javax.swing.JButton ModifierProduit;
    private javax.swing.JLabel Produits;
    private javax.swing.JLabel Produits1;
    private javax.swing.JButton ReglementClient;
    private javax.swing.JButton ReglementFournisseur;
    private javax.swing.JButton Saisie_Versement;
    private javax.swing.JButton SeDeconnecter;
    private javax.swing.JButton SupprimerClient1;
    private javax.swing.JButton SupprimerFourniseur;
    private javax.swing.JButton SupprimerProduit;
    // End of variables declaration//GEN-END:variables
}
