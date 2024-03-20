package com.fstg.mediatech.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
@Entity
@Table(name="ligne_facture")
@Data
@ToString
public class LigneFactureEntity implements Serializable {
    private static final long serialVersionUID=-3181735183192870271l;

    @EmbeddedId
    private LigneFactureKey id;

    @ManyToOne()
    @MapsId("factureId")
    @JoinColumn(name="facture_id")
    private FactureEntity facture;

    @ManyToOne()
    @MapsId("produitId")
    @JoinColumn(name = "produit_id")
    private ProduitEntity produit;



    private double quantite;







}
