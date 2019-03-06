
import java.awt.event.KeyEvent;
import java.sql.Time;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anonyme
 */
public class ModifierUnProduit extends javax.swing.JFrame {

    /**
     * Creates new form EnregistrerUnClient
     */
    public ModifierUnProduit() {
        initComponents();
        Actualiser(0);
    }
    
    void Actualiser(int j) {
        
        DB.SelectNumFournisseurDB();
        DB.SelectTauxTVADB();
        DB.SelectCodeFamilleDB();
        DB.SelectCodePortDB();
        DB.SelectRefProduitDB();
        
        for(int i=0; i<DB.fournisseurs.size(); i++) {
            Fournisseur.addItem(DB.fournisseurs.get(i).getNom()+" "+DB.fournisseurs.get(i).getPrenom());
        }
        if(Fournisseur.getItemCount() !=0) Fournisseur.setSelectedItem(DB.fournisseurs.get(0).getNum());
        
        for(int i=0; i<DB.TVA.size(); i++) {
            TauxTVA.addItem(DB.TVA.get(i).toString());
        }
        if(TauxTVA.getItemCount() !=0) TauxTVA.setSelectedItem(DB.TVA.get(0).toString());
        
        for(int i=0; i<DB.CFs.size(); i++) {
            Famille.addItem(DB.CFs.get(i));
        }
        if(Famille.getItemCount() !=0) Famille.setSelectedItem(DB.CFs.get(0));
        
        for(int i=0; i<DB.CPs.size(); i++) {
            Transport.addItem(DB.CPs.get(i));
        }
        if(Transport.getItemCount() !=0) Transport.setSelectedItem(DB.CPs.get(0));
        
        
        
        Ref.removeAllItems();
        for(int i=0; i<DB.produits.size(); i++) {
            Ref.addItem(DB.produits.get(i).getRef());
        }
        if(Ref.getItemCount() !=0) {
            
        Ref.setSelectedItem(DB.produits.get(j).getRef());
        GenCode.setText(DB.produits.get(j).getGenCode());
        CodeBar.setText(DB.produits.get(j).getCodeBar());
        LibProd.setText(DB.produits.get(j).getLibProd());
        Description.setText(DB.produits.get(j).getDescription());
        PrixHT.setText(String.valueOf(DB.produits.get(j).getPrixHT()));
        TauxTVA.setSelectedItem(DB.produits.get(j).getTauxTVA());
        QteReappro.setText(String.valueOf(DB.produits.get(j).getQteReappro()));
        QteMini.setText(String.valueOf(DB.produits.get(j).getQteMini()));
        PlusAuCatalogue.setText(String.valueOf(DB.produits.get(j).getPlusAuCatalogue()));
        SaisiPar.setText(DB.produits.get(j).getSaisiPar());
        SaisiLe.setText("2018-12-19");
            
        
        
        if(DB.produits.get(j).getCodeFamille().equals("10")) Famille.setSelectedItem("PCs");
        else if(DB.produits.get(j).getCodeFamille().equals("23")) Famille.setSelectedItem("Imprimantes");
        if(DB.produits.get(j).getCodePort().equals("564")) Transport.setSelectedItem("EMS");
        
        
        
        DB.SelectNumFournisseurDB();
        int N = 0;
        String X = "";
        for(int i=0; i<DB.fournisseurs.size(); i++)
        {
            N=Integer.parseInt(DB.fournisseurs.get(i).getNum());
            if(DB.produits.get(j).getNumFournisseur() == N) X=DB.fournisseurs.get(i).getNom()+" "+DB.fournisseurs.get(i).getPrenom();
        }
        
        Fournisseur.setSelectedItem(X);    
            
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

        SaisiLeJ1 = new javax.swing.JComboBox<>();
        SaisiPar1 = new javax.swing.JLabel();
        SaisiLe1 = new javax.swing.JLabel();
        Transport1 = new javax.swing.JLabel();
        Famille1 = new javax.swing.JLabel();
        Description1 = new javax.swing.JLabel();
        ModifierProduit = new javax.swing.JButton();
        Retour = new javax.swing.JButton();
        GenCode = new javax.swing.JTextField();
        CodeBar = new javax.swing.JTextField();
        Ref1 = new javax.swing.JLabel();
        GenCode1 = new javax.swing.JLabel();
        CodeBar1 = new javax.swing.JLabel();
        LibProd1 = new javax.swing.JLabel();
        Fournisseur1 = new javax.swing.JLabel();
        TauxTVA1 = new javax.swing.JLabel();
        PrixHT1 = new javax.swing.JLabel();
        PlusAuCatalogue1 = new javax.swing.JLabel();
        PrixHT = new javax.swing.JTextField();
        PlusAuCatalogue = new javax.swing.JTextField();
        SaisiPar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        LibProd = new javax.swing.JTextField();
        TauxTVA = new javax.swing.JComboBox<>();
        Transport = new javax.swing.JComboBox<>();
        Fournisseur = new javax.swing.JComboBox<>();
        Famille = new javax.swing.JComboBox<>();
        QteMini1 = new javax.swing.JLabel();
        QteReappro2 = new javax.swing.JLabel();
        QteMini = new javax.swing.JTextField();
        QteReappro = new javax.swing.JTextField();
        Selectionner = new javax.swing.JButton();
        Selectionner1 = new javax.swing.JLabel();
        SaisiLe = new javax.swing.JTextField();
        Ref = new javax.swing.JComboBox<>();

        SaisiLeJ1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modification");

        SaisiPar1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        SaisiPar1.setText("Saisi Par :");

        SaisiLe1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        SaisiLe1.setText("Saisi Le :");

        Transport1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Transport1.setText("Transport :");

        Famille1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Famille1.setText("Famille :");

        Description1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Description1.setText("Description :");

        ModifierProduit.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        ModifierProduit.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANONYME\\Documents\\gestion_commercial\\src\\icon\\icons8-approuver-et-mettre-à-jour-24.png")); // NOI18N
        ModifierProduit.setText("Update");
        ModifierProduit.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.blue));
        ModifierProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierProduitActionPerformed(evt);
            }
        });

        Retour.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Retour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-greater-than-100.png"))); // NOI18N
        Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });

        GenCode.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        GenCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GenCodeKeyPressed(evt);
            }
        });

        CodeBar.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        CodeBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CodeBarKeyPressed(evt);
            }
        });

        Ref1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Ref1.setText("Ref° Produit :");

        GenCode1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        GenCode1.setText("Code Généré :");

        CodeBar1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        CodeBar1.setText("Code Bar :");

        LibProd1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        LibProd1.setText("Libellé Produit :");

        Fournisseur1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Fournisseur1.setText("Fournisseur :");

        TauxTVA1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        TauxTVA1.setText("Taux TVA :");

        PrixHT1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        PrixHT1.setText("Prix HT :");

        PlusAuCatalogue1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        PlusAuCatalogue1.setText("Plus Au Catalogue :");

        PrixHT.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        PrixHT.setText("0.00");

        PlusAuCatalogue.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        PlusAuCatalogue.setText("0");
        PlusAuCatalogue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PlusAuCatalogueKeyPressed(evt);
            }
        });

        SaisiPar.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        SaisiPar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SaisiParKeyPressed(evt);
            }
        });

        Description.setColumns(20);
        Description.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        Description.setRows(5);
        Description.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DescriptionKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(Description);

        LibProd.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        LibProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LibProdKeyPressed(evt);
            }
        });

        TauxTVA.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N

        Transport.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N

        Fournisseur.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N

        Famille.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N

        QteMini1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        QteMini1.setText("Qte. Minimale :");

        QteReappro2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        QteReappro2.setText("Qte. Réappro :");

        QteMini.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        QteMini.setText("0");

        QteReappro.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        QteReappro.setText("0");
        QteReappro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                QteReapproKeyPressed(evt);
            }
        });

        Selectionner.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Selectionner.setText("Selectionner");

        Selectionner1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Selectionner1.setText("Pas de photo selectionnée.");

        SaisiLe.setEditable(false);
        SaisiLe.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        Ref.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ModifierProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Retour, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ref1)
                            .addComponent(GenCode1)
                            .addComponent(CodeBar1)
                            .addComponent(LibProd1)
                            .addComponent(PrixHT1)
                            .addComponent(Description1)
                            .addComponent(TauxTVA1)
                            .addComponent(QteReappro2)
                            .addComponent(QteMini1)
                            .addComponent(Fournisseur1))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(QteReappro, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PrixHT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(GenCode, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(CodeBar, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LibProd, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TauxTVA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QteMini)
                                .addComponent(Ref, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Fournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SaisiPar1)
                                    .addComponent(Transport1)
                                    .addComponent(SaisiLe1)
                                    .addComponent(Famille1)
                                    .addComponent(PlusAuCatalogue1))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Selectionner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PlusAuCatalogue)
                                    .addComponent(SaisiPar)
                                    .addComponent(Transport, javax.swing.GroupLayout.Alignment.LEADING, 0, 140, Short.MAX_VALUE)
                                    .addComponent(Famille, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SaisiLe, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(Selectionner1)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ref1)
                    .addComponent(Ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenCode1)
                    .addComponent(GenCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodeBar1)
                    .addComponent(CodeBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Selectionner1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LibProd1)
                    .addComponent(LibProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Description1)
                            .addComponent(Selectionner))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PlusAuCatalogue1)
                            .addComponent(PlusAuCatalogue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrixHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrixHT1))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TauxTVA1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TauxTVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Famille1)
                        .addComponent(Famille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QteReappro2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(QteReappro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Transport1))
                    .addComponent(Transport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QteMini1)
                    .addComponent(QteMini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaisiPar1)
                    .addComponent(SaisiPar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fournisseur1)
                    .addComponent(Fournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaisiLe1)
                    .addComponent(SaisiLe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModifierProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Retour, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void ModifierProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierProduitActionPerformed
        Produit produit = new Produit();
        
        produit.setRef(Ref.getSelectedItem().toString());
        produit.setGenCode(GenCode.getText());
        produit.setCodeBar(CodeBar.getText());
        produit.setLibProd(LibProd.getText());
        produit.setDescription(Description.getText());
        produit.setPrixHT(Double.parseDouble(PrixHT.getText()));
        produit.setTauxTVA(Double.parseDouble(TauxTVA.getSelectedItem().toString()));
        produit.setQteReappro(Integer.parseInt(QteReappro.getText()));
        produit.setQteMini(Integer.parseInt(QteMini.getText()));
        produit.setPlusAuCatalogue(Integer.parseInt(PlusAuCatalogue.getText()));
        produit.setSaisiPar(SaisiPar.getText());
        produit.setSaisiLe("2018-12-19");
        
        if(Famille.getSelectedItem().toString().equals("PCs")) produit.setCodeFamille("10");
        else if(Famille.getSelectedItem().toString().equals("Imprimantes")) produit.setCodeFamille("23");
        produit.setCodePort(Transport.getSelectedItem().toString());
        
        DB.SelectNumFournisseurDB();
        int N=0;
        for(int i=0; i<DB.fournisseurs.size(); i++)
        {
            String X=DB.fournisseurs.get(i).getNom()+" "+DB.fournisseurs.get(i).getPrenom();
            if(X.equals(Fournisseur.getSelectedItem().toString())) N=Integer.parseInt(DB.fournisseurs.get(i).getNum());
        }
        
        produit.setNumFournisseur(N);
        
        DB.UpdateDB(produit);
        
         JOptionPane.showMessageDialog( null, "Succès!", 
					      "Produit Modifié", JOptionPane.INFORMATION_MESSAGE);
         
    }//GEN-LAST:event_ModifierProduitActionPerformed

    private void GenCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GenCodeKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
            {
              CodeBar.grabFocus();
            }
    }//GEN-LAST:event_GenCodeKeyPressed

    private void CodeBarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodeBarKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
            {
              LibProd.grabFocus();
            }
    }//GEN-LAST:event_CodeBarKeyPressed

    private void DescriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DescriptionKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
            {
              PrixHT.grabFocus();
            }
    }//GEN-LAST:event_DescriptionKeyPressed

    private void PlusAuCatalogueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PlusAuCatalogueKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
            {
              SaisiPar.grabFocus();
            }
    }//GEN-LAST:event_PlusAuCatalogueKeyPressed

    private void SaisiParKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SaisiParKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
            {
              GenCode.grabFocus();
            }
    }//GEN-LAST:event_SaisiParKeyPressed

    private void QteReapproKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QteReapproKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
            {
              QteMini.grabFocus();
            }
    }//GEN-LAST:event_QteReapproKeyPressed

    private void LibProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LibProdKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
            {
              Description.grabFocus();
            }
    }//GEN-LAST:event_LibProdKeyPressed

    private void RefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefActionPerformed
        int i=0;
        if (Ref.getSelectedIndex()!= -1) {
            while (!DB.produits.get(i).getRef().equals(Ref.getSelectedItem().toString())) i++;
            
            GenCode.setText(DB.produits.get(i).getGenCode());
            CodeBar.setText(DB.produits.get(i).getCodeBar());
            LibProd.setText(DB.produits.get(i).getLibProd());
            Description.setText(DB.produits.get(i).getDescription());
            PrixHT.setText(String.valueOf(DB.produits.get(i).getPrixHT()));
            TauxTVA.setSelectedItem(DB.produits.get(i).getTauxTVA());
            QteReappro.setText(String.valueOf(DB.produits.get(i).getQteReappro()));
            QteMini.setText(String.valueOf(DB.produits.get(i).getQteMini()));
            Fournisseur.setSelectedItem(DB.produits.get(i).getNumFournisseur());
            PlusAuCatalogue.setText(String.valueOf(DB.produits.get(i).getPlusAuCatalogue()));
            Famille.setSelectedItem(DB.produits.get(i).getCodeFamille());
            Transport.setSelectedItem(DB.produits.get(i).getCodePort());
            SaisiPar.setText(DB.produits.get(i).getSaisiPar());
            SaisiLe.setText(DB.produits.get(i).getSaisiLe());
        }
    }//GEN-LAST:event_RefActionPerformed

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
            java.util.logging.Logger.getLogger(EnregistrerUnClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnregistrerUnClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnregistrerUnClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnregistrerUnClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnregistrerUnClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodeBar;
    private javax.swing.JLabel CodeBar1;
    private javax.swing.JTextArea Description;
    private javax.swing.JLabel Description1;
    private javax.swing.JComboBox<String> Famille;
    private javax.swing.JLabel Famille1;
    private javax.swing.JComboBox<String> Fournisseur;
    private javax.swing.JLabel Fournisseur1;
    private javax.swing.JTextField GenCode;
    private javax.swing.JLabel GenCode1;
    private javax.swing.JTextField LibProd;
    private javax.swing.JLabel LibProd1;
    private javax.swing.JButton ModifierProduit;
    private javax.swing.JTextField PlusAuCatalogue;
    private javax.swing.JLabel PlusAuCatalogue1;
    private javax.swing.JTextField PrixHT;
    private javax.swing.JLabel PrixHT1;
    private javax.swing.JTextField QteMini;
    private javax.swing.JLabel QteMini1;
    private javax.swing.JTextField QteReappro;
    private javax.swing.JLabel QteReappro2;
    private javax.swing.JComboBox<String> Ref;
    private javax.swing.JLabel Ref1;
    private javax.swing.JButton Retour;
    private javax.swing.JTextField SaisiLe;
    private javax.swing.JLabel SaisiLe1;
    private javax.swing.JComboBox<String> SaisiLeJ1;
    private javax.swing.JTextField SaisiPar;
    private javax.swing.JLabel SaisiPar1;
    private javax.swing.JButton Selectionner;
    private javax.swing.JLabel Selectionner1;
    private javax.swing.JComboBox<String> TauxTVA;
    private javax.swing.JLabel TauxTVA1;
    private javax.swing.JComboBox<String> Transport;
    private javax.swing.JLabel Transport1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
