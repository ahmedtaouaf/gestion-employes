package com.hendisantika.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@Entity
public class Employer {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String NumBadge;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getNumBadge() {

        return NumBadge;
    }

    public void setNumBadge(String numBadge) {

        NumBadge = numBadge;
    }

    public String getNom() {

        return nom;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public String getPrenom() {

        return prenom;
    }

    public void setPrenom(String prenom) {

        this.prenom = prenom;
    }

    public Fonction getFonction() {

        return fonction;
    }

    public void setFonction(Fonction fonction) {

        this.fonction = fonction;
    }

    public Disponibilite getDisponibilite() {

        return disponibilite;
    }

    public void setDisponibilite(Disponibilite disponibilite) {

        this.disponibilite = disponibilite;
    }

    @OneToOne
    private Fonction fonction;
    @ManyToOne
    private Disponibilite disponibilite;

}