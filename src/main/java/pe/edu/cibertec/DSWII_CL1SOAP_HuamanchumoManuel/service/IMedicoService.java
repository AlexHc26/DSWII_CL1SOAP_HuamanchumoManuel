package pe.edu.cibertec.DSWII_CL1SOAP_HuamanchumoManuel.service;

import pe.edu.cibertec.ws.objects.Medicows;
import java.util.List;

public interface IMedicoService {

    List<Medicows> listarMedicos();

    Medicows obtenerMedicoxId(int id);

    Medicows registrarActualizarMedico(Medicows medico);
}
