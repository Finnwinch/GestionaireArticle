/*
 * 8 mai 2023
 * Classe de navigation basé sur ModeleVueArticle
 * Comporte une interface JFRame
 */
// Interface graphique fait avec le constructeur NetBeans!
// Ajouter de windwos Opening pour charger un article
// Ajout du traitement de nécessité d'avoir un code numérique et set text information pour chaque état ( sauf precedent / suivant )
import javax.swing.JOptionPane;
public class VueArticle extends javax.swing.JFrame {
    private javax.swing.JButton Ajouter;
    private javax.swing.JButton Dernier;
    private javax.swing.JLabel Information;
    private javax.swing.JButton Modifier;
    private javax.swing.JButton Nouveau;
    private javax.swing.JButton Precedent;
    private javax.swing.JButton Premier;
    private javax.swing.JSeparator SeparationAction;
    private javax.swing.JSeparator SeparationNavigation;
    private javax.swing.JTextField SetCategorie;
    private javax.swing.JTextField SetCode;
    private javax.swing.JTextField SetDesignation;
    private javax.swing.JTextField SetPrix;
    private javax.swing.JButton Suivant;
    private javax.swing.JButton Supprimer;
    private javax.swing.JLabel Titre_Code;
    private javax.swing.JLabel Titre_categorie;
    private javax.swing.JLabel Titre_designation;
    private javax.swing.JLabel Titre_prix;

    private final ModeleVueArticle modele ;
    public VueArticle(ModeleVueArticle modele) {
        this.modele = modele ;
        initComponents();
        setResizable(false) ;
        setTitle("Gestionnaire d'article") ;
    }
    public void setArticle(Article ref){
        SetCode.setText(ref.getCode());
        SetDesignation.setText(ref.getDesignation());
        SetCategorie.setText(ref.getCategorie());
        SetPrix.setText(Float.toString(ref.getPrixUnitaire()));
    }
    public Article getArticle(){
        String code = SetCode.getText() ;
        String designation = SetDesignation.getText() ;
        String categorie = SetCategorie.getText() ;
        String prixUnitaireText = SetPrix.getText();
        float prixUnitaire = Float.parseFloat(prixUnitaireText);
        return new Article(code,designation,categorie,prixUnitaire) ;
    }
    private void initComponents() {

        Premier = new javax.swing.JButton();
        Dernier = new javax.swing.JButton();
        Precedent = new javax.swing.JButton();
        Suivant = new javax.swing.JButton();
        Nouveau = new javax.swing.JButton();
        Supprimer = new javax.swing.JButton();
        Ajouter = new javax.swing.JButton();
        Modifier = new javax.swing.JButton();
        Information = new javax.swing.JLabel();
        SeparationAction = new javax.swing.JSeparator();
        SeparationNavigation = new javax.swing.JSeparator();
        Titre_Code = new javax.swing.JLabel();
        Titre_designation = new javax.swing.JLabel();
        Titre_categorie = new javax.swing.JLabel();
        Titre_prix = new javax.swing.JLabel();
        SetDesignation = new javax.swing.JTextField();
        SetCode = new javax.swing.JTextField();
        SetPrix = new javax.swing.JTextField();
        SetCategorie = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Premier.setText("Premier");
        Premier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionPerformedPremier(evt);
            }
        });

        Dernier.setText("Dernier");
        Dernier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionPerformedDernier(evt);
            }
        });

        Precedent.setText("Precedent");
        Precedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionPerformedPrecedent(evt);
            }
        });

        Suivant.setText("Suivant");
        Suivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionPerformedSuivant(evt);
            }
        });

        Nouveau.setText("Nouveau");
        Nouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionPerformedNouveau(evt);
            }
        });

        Supprimer.setText("Supprimer");
        Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionPerformedSupprimer(evt);
            }
        });

        Ajouter.setText("Ajouter");
        Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionPerformedAjouter(evt);
            }
        });

        Modifier.setText("Modifier");
        Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionPerformedModifier(evt);
            }
        });

        Information.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Information.setText("Cette application vous permet de traiter et modifier la table Article");

        Titre_Code.setText("Code");

        Titre_designation.setText("Désignation");

        Titre_categorie.setText("Catégorie");

        Titre_prix.setText("Prix Unitaire");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Information, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SeparationNavigation)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Premier, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Precedent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Suivant, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Dernier, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SeparationAction, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nouveau, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Titre_categorie)
                                            .addComponent(Titre_prix))
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SetPrix, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SetCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Titre_designation)
                                            .addComponent(Titre_Code))
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SetDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SetCode, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dernier)
                    .addComponent(Precedent)
                    .addComponent(Premier)
                    .addComponent(Suivant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparationNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titre_Code, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SetCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titre_designation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SetDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titre_categorie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SetCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titre_prix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SetPrix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Information, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparationAction, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Supprimer)
                    .addComponent(Ajouter)
                    .addComponent(Nouveau)
                    .addComponent(Modifier))
                .addContainerGap())
        );

        pack();
    }
    // Boutton de navigation
    private void ActionPerformedPremier(java.awt.event.ActionEvent evt) {
        try {
            setArticle(modele.premier()) ;
            if (modele.premier() == modele.dernier()) {
                Information.setText("Vous etes sur la sélection du seul article") ;
            } else {
                Information.setText("Vous etes sur la sélection du dernier article") ;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur Sélection", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    private void ActionPerformedPrecedent(java.awt.event.ActionEvent evt) {
        try {
            setArticle(modele.precedent()) ;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur Sélection", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void ActionPerformedSuivant(java.awt.event.ActionEvent evt) {
        try {
            setArticle(modele.suivant()) ;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur Sélection", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void ActionPerformedDernier(java.awt.event.ActionEvent evt) {
        try {
            setArticle(modele.dernier()) ;
            if (modele.premier() == modele.dernier()) {
                Information.setText("Vous etes sur la sélection du seul article") ;
            } else {
                Information.setText("Vous etes sur la sélection du dernier article") ;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur Sélection", JOptionPane.ERROR_MESSAGE);
        }
    }
    // Boutton de traitement
    private void ActionPerformedNouveau(java.awt.event.ActionEvent evt) {
        setArticle(new Article()) ;
        Information.setText("Nouvelle Article en cours...");
    }
    private void ActionPerformedAjouter(java.awt.event.ActionEvent evt) {
        int choix = JOptionPane.showConfirmDialog(null, "Voulez-vous Ajouter l'article?", "Validation", JOptionPane.YES_NO_OPTION);
        if (choix == JOptionPane.YES_OPTION) {
            try {
                Article nouveau = getArticle() ;
                modele.ajouter(nouveau);
                Information.setText("Article enregistrer...");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Erreur Ajout", JOptionPane.ERROR_MESSAGE);
                Information.setText("Erreur d'ajout...");
            } catch (NumberFormatException ea) {
                JOptionPane.showMessageDialog(null, "Il y a une erreur avec les saisies!", "Erreur", JOptionPane.ERROR_MESSAGE);
                Information.setText("Erreur d'ajout...");
            }
        }
    }
    private void ActionPerformedModifier(java.awt.event.ActionEvent evt) {
        int choix = JOptionPane.showConfirmDialog(null, "Voulez-vous modifier l'article?", "Validation", JOptionPane.YES_NO_OPTION);
        if (choix == JOptionPane.YES_OPTION) {
            try {
                modele.modifier(getArticle()) ;
                Information.setText("Article modifier...");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur Modification", JOptionPane.ERROR_MESSAGE);
                Information.setText("Erreur Modification...");
            }  catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Il y a une erreur avec le traitement \n Surement avec les saisies", "Erreur", JOptionPane.ERROR_MESSAGE);
                Information.setText("Erreur Modification...");
            }
        }
    } 
    private void ActionPerformedSupprimer(java.awt.event.ActionEvent evt) {
        int choix = JOptionPane.showConfirmDialog(null, "Voulez-vous Supprimer l'article?", "Validation", JOptionPane.YES_NO_OPTION);
        if (choix == JOptionPane.YES_OPTION) {
            try {
                modele.trouver(getArticle());
                modele.supprimer(modele.courant());
                Information.setText("Article supprimer...");
                setArticle(modele.precedent());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur Suppresion", JOptionPane.ERROR_MESSAGE);
                Information.setText("La liste d'articles est vide !");
                SetCode.setText("") ;
                SetDesignation.setText("") ;
                SetCategorie.setText((""));
                SetPrix.setText("");
            } catch (NumberFormatException e) {
                Information.setText("Erreur de suppresion");
                JOptionPane.showMessageDialog(null, "Il y a aucun article valide avec les saisies!", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    // Fonctionalité Windows (OS)
    private void formWindowClosing(java.awt.event.WindowEvent evt) { 
        modele.serialiser();
        JOptionPane.showMessageDialog(null, "Sauvegarde des Articles réussie") ;
     }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        try {
            setArticle(modele.premier());
            JOptionPane.showMessageDialog(null, "Chargement des Articles trouver réussie") ;
        } catch (Exception e) {
            Information.setText("Aucun Article d'enregistrer...");
        } catch (NumberFormatException ea) {}
    }

}
