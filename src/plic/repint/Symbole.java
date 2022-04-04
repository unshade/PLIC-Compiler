package plic.repint;

import java.util.Objects;

/**
 * @author unshade
 */
public class Symbole {

    /**
     * Type du symbole
     */
    private String type;

    /**
     * Deplacement dans la pile
     */
    private int deplacement;

    private int taille;

    /**
     * Constructeur symbole -- unused -- test
     *
     * @param type        type
     * @param deplacement deplacement
     */
    public Symbole(String type, int deplacement) {
        this.type = type;
        this.deplacement = deplacement;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    /**
     * Constructeur de symbole
     *
     * @param type type du symbole (entier...)
     */
    public Symbole(String type) {
        this.type = type;
    }


    /**
     * Getter type
     *
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter type
     *
     * @param type type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * getter deplacement
     *
     * @return deplacement
     */
    public int getDeplacement() {
        return deplacement;
    }

    /**
     * Setter deplacement
     *
     * @param deplacement deplacement
     */
    public void setDeplacement(int deplacement) {
        this.deplacement = deplacement;
    }

    @Override
    public String toString() {
        return "Symbole{" +
                "type='" + type + '\'' +
                ", deplacement=" + deplacement +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Symbole symbole = (Symbole) o;
        return deplacement == symbole.deplacement && Objects.equals(type, symbole.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, deplacement);
    }
}
