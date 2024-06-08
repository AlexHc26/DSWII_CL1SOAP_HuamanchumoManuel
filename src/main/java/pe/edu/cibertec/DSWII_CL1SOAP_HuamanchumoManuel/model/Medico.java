package pe.edu.cibertec.DSWII_CL1SOAP_HuamanchumoManuel.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmedico ;
    private String nommedico;
    private String apemedico;
    private Date fechnacmedico;
}
