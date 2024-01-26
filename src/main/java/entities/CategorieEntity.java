package entities;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "categorie", schema = "public", catalog = "my_database")
public class CategorieEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idcat")
    private int idcat;
    @Basic
    @Column(name = "nomcat")
    private String nomcat;
    @OneToMany(mappedBy = "categorieByIdcat")
    private Collection<ProduitEntity> produitsByIdcat;

    public int getIdcat() {
        return idcat;
    }

    public void setIdcat(int idcat) {
        this.idcat = idcat;
    }

    public String getNomcat() {
        return nomcat;
    }

    public void setNomcat(String nomcat) {
        this.nomcat = nomcat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategorieEntity that = (CategorieEntity) o;
        return idcat == that.idcat && Objects.equals(nomcat, that.nomcat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcat, nomcat);
    }

    public Collection<ProduitEntity> getProduitsByIdcat() {
        return produitsByIdcat;
    }

    public void setProduitsByIdcat(Collection<ProduitEntity> produitsByIdcat) {
        this.produitsByIdcat = produitsByIdcat;
    }
}
