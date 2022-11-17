package dto;

import entities.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

public class EmployeDTO {

    private int idEmp;

    private String prenom;

    private String nom;

    private List<Telephone> telephones;

    private Machine machine;

    private Service service;

    private Adresse adresse;

    private Set<Projet> projetsEnCours;


    public EmployeDTO() {}

    /* Ce constructeur comporte des paramètres. On est donc obligé de spécifier un constructeur vide (ci dessus).
     */

    public EmployeDTO(String prenom, String nom, List<Telephone> telephones, Machine machine, Service service, Adresse adresse, Set<Projet> projetsEnCours) {
        this.prenom = prenom;
        this.nom = nom;
        this.telephones = telephones;
        this.machine = machine;
        this.service = service;
        this.adresse = adresse;
        this.projetsEnCours = projetsEnCours;
    }

    public int getIdEmp() {
        return idEmp;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Telephone> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<Telephone> telephones) {
        this.telephones = telephones;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Set<Projet> getProjetsEnCours() {
        return projetsEnCours;
    }

    public void setProjetsEnCours(Set<Projet> projetsEnCours) {
        this.projetsEnCours = projetsEnCours;
    }
}
