package services;

import dto.EmployeDTO;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class Facade {
    @PersistenceContext
    EntityManager em;

    //méthode 1: DTO
    public List<EmployeDTO> retrieveEmploye(int idEmploye){
        Query query= em.createQuery("select new dto.EmployeDTO(emp.prenom,emp.nom,emp.telephones,emp.machine,emp.service,emp.adresse,emp.projetsEnCours) from Employe emp where emp.idEmp = :idEmploye");
        query.setParameter("idEmploye",idEmploye);
        return query.getResultList();
    }

}
