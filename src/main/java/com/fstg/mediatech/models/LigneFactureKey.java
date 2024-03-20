package com.fstg.mediatech.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
public class LigneFactureKey implements Serializable {

    private static final long serialVersionUID=4722352116317893282l;
    @Column(name="facture_id")
    private Integer factureId;
    @Column(name = "produit_id")
    private Integer produitId;
}
