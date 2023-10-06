/*
 * 8 mai 2023
 * Main programme : Gestionnaire d'article
 */
public class Main {
    public static void main(String[] args) {
        // Creation du fichier data directement dans le repertoire des fichiers
        // peut etre remplacer via des "" dans un fichier directement : "C/Users/data.res" etc...
        //String cheminFichier = System.getProperty("user.dir") +java.io.File.separator + "data.res";
        String cheminFichier = "C:\\Program Files\\GestionnaireArticleData.ser";
        ModeleVueArticle navigation = new ModeleVueArticle(cheminFichier) ;
        navigation.deserialiser();
        new VueArticle(navigation).setVisible(true) ;
    }
}
