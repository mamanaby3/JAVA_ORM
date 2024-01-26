package entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "produit", schema = "public", catalog = "my_database")
public class ProduitEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idp")
    private int idp;
    @Basic
    @Column(name = "libellep")
    private String libellep;
    @Basic
    @Column(name = "qtep")
    private Integer qtep;
    @Basic
    @Column(name = "prixp")
    private BigDecimal prixp;
    @Basic
    @Column(name = "idcat")
    private Integer idcat;
    @ManyToOne
    @JoinColumn(name = "idcat", referencedColumnName = "idcat")
    private CategorieEntity categorieByIdcat;

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public String getLibellep() {
        return libellep;
    }

    public void setLibellep(String libellep) {
        this.libellep = libellep;
    }

    public Integer getQtep() {
        return qtep;
    }

    public void setQtep(Integer qtep) {
        this.qtep = qtep;
    }

    public BigDecimal getPrixp() {
        return prixp;
    }

    public void setPrixp(BigDecimal prixp) {
        this.prixp = prixp;
    }

    public Integer getIdcat() {
        return idcat;
    }

    public void setIdcat(Integer idcat) {
        this.idcat = idcat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProduitEntity that = (ProduitEntity) o;
        return idp == that.idp && Objects.equals(libellep, that.libellep) && Objects.equals(qtep, that.qtep) && Objects.equals(prixp, that.prixp) && Objects.equals(idcat, that.idcat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idp, libellep, qtep, prixp, idcat);
    }

    public CategorieEntity getCategorieByIdcat() {
        return categorieByIdcat;
    }

    public void setCategorieByIdcat(CategorieEntity categorieByIdcat) {
        this.categorieByIdcat = categorieByIdcat;
    }
}
