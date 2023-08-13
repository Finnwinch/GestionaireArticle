/*
 * Cirapci, Léo
 * 8 mai 2023
 * Classe de navigation pour VueArticle utilisant la classe Article
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ModeleVueArticle extends Article {
    private HashMap<String,Article> articlesMap;
    private int positionCourante;
    private String cheminFichier;

    public ModeleVueArticle(String cheminFichier) {
        this.cheminFichier = cheminFichier;
        articlesMap = new HashMap<String, Article>();
        positionCourante = 0;
    }
    // Utilisation d'un arrylist pour faire les call depuis une valeur
    public Article courant() {
        List<Article> articlesList = new ArrayList<>(articlesMap.values());
        if (articlesList.isEmpty() || ! articlesMap.containsKey(articlesList.get(positionCourante).getCode())) {
            throw new Exception("La liste d'articles est vide !");
        }
        return articlesList.get(positionCourante);
    }

    public Article premier() {
        positionCourante = 0 ;
        return courant() ;
    }
    
    public Article precedent(){
        positionCourante--;
        if (positionCourante < 0) {
            positionCourante = articlesMap.size() - 1;
        }
        return courant();
    }

    public Article suivant() {
        positionCourante++ ;
        if (positionCourante == articlesMap.size()) { positionCourante = 0 ;}
        return courant() ;
}

    public Article dernier() {
        positionCourante = articlesMap.size() - 1 ;
        return courant() ;
    }
    // premier condition permet de s'assurer que ces une valeur numérique
    // second condition permet de s'assurer que l'objet existe pas
    public void ajouter(Article article) {
        if ( ! article.getCode().matches(".*\\d+.*") ) {
            throw new Exception("Vous devez rentrer un code numérique") ;
        }
        if (! articlesMap.containsKey(article.getCode())) {
            articlesMap.put(article.getCode(), article) ;
            positionCourante = articlesMap.size() - 1;
        } else {
            throw new Exception("Vous ne pouvez pas crée un article avec un code déja utiliser") ;
        }
        
    }

    public void modifier(Article article){
        if ( articlesMap.containsKey(article.getCode()) ) {
            articlesMap.put(article.getCode(),article) ;
        } else {
            throw new Exception("Vous ne pouvez pas modifier un article qui n'est pas référer avec votre code !!") ;
        }
    }
    
    public void trouver(Article article) {
        if ( ! articlesMap.containsKey(article.getCode()) ) {
            throw new Exception("Vous ne pouvez pas modifier un article qui n'existe pas") ;
        }
    }
    
    public void supprimer(Article article){
        if ( positionCourante == -1 ) {
            throw new Exception("Il y a pus d'article d'enregistrer") ;
        }
        if ( articlesMap.containsKey(article.getCode()) ) {
            articlesMap.remove(article.getCode()) ;
            positionCourante-- ;
        } else {
            throw new Exception("Vous ne pouvez pas modifier un article qui n'existe pas") ;
        }
    }

    public void serialiser() {
        try {
            FileOutputStream fileOut = new FileOutputStream(cheminFichier);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(articlesMap);
            out.close();
            fileOut.close();
        } catch(IOException i) {}
    }

    public void deserialiser() {
        try {
            FileInputStream fileIn = new FileInputStream(cheminFichier);
           ObjectInputStream in = new ObjectInputStream(fileIn);
           articlesMap = (HashMap<String, Article>) in.readObject();
           in.close();
           fileIn.close();
        } catch(IOException | ClassNotFoundException i) {}
    }

}
// Class d'erreur
class Exception extends RuntimeException {
    Exception(String message) {
        super(message) ;
    }
}