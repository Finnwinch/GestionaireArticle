/*
 * 8 mai 2023
 * Classe Article
 */
import java.io.Serializable;
public class Article implements Serializable, Comparable<Object> {
    private String code ;
    private String designation ;
    private String categorie ;
    private float prixUnitaire ;
    Article(){}
    Article(String Code, String Designation, String Categorie, float PrixUnitaire){
        this.code = Code ;
        this.designation = Designation ;
        this.categorie = Categorie ;
        this.prixUnitaire = PrixUnitaire ;
    }
    public String getCode() { return this.code ; }
    public String getDesignation() { return this.designation ; }
    public String getCategorie() { return this.categorie ; }
    public float getPrixUnitaire() { return this.prixUnitaire ; }
    public void setCode(String Code) { this.code = Code ; }
    public void setDesignation(String Designation) { this.code = Designation ; }
    public void setCategorie(String Categorie) { this.code = Categorie ; }
    public void setPrixUnitaire(float PrixUnitaire) { this.prixUnitaire = PrixUnitaire ; }
    public boolean equals(Article article) { return this.code.equals(article.code) ; }
    @Override
    public String toString() { return this.code + this.designation + this.categorie + Float.toString(this.prixUnitaire) ; }
    @Override
    public int compareTo(Object o) { 
        Article article = (Article) o ;
        return this.code.compareTo(article.code) ; 
    }
}
