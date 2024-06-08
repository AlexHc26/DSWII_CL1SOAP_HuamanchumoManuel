package pe.edu.cibertec.DSWII_CL1SOAP_HuamanchumoManuel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_CL1SOAP_HuamanchumoManuel.model.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Integer> {
}
