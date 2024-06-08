package pe.edu.cibertec.DSWII_CL1SOAP_HuamanchumoManuel.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_CL1SOAP_HuamanchumoManuel.configuration.convert.MedicoConvert;
import pe.edu.cibertec.DSWII_CL1SOAP_HuamanchumoManuel.model.Medico;
import pe.edu.cibertec.DSWII_CL1SOAP_HuamanchumoManuel.repository.MedicoRepository;
import pe.edu.cibertec.ws.objects.Medicows;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@Service
public class MedicoService implements IMedicoService {

    private MedicoRepository medicoRepository;
    private MedicoConvert medicoConvert;

    @Override
    public List<Medicows> listarMedicos() {
        return medicoConvert.convertMedicoToMedicoWs(
                medicoRepository.findAll());
    }

    @Override
    public Medicows obtenerMedicoxId(int id) {
        Optional<Medico> medico = medicoRepository.findById(id);
        return medico.map(value ->
                        medicoConvert.convertMedicoToMedicoWs(value))
                .orElse(null);
    }

    @Override
    public Medicows registrarActualizarMedico(Medicows medicows) {
        Medico nuevoMedico = medicoRepository.save(
                medicoConvert.convertMedicowsToMedico(medicows));
        if(nuevoMedico == null)
            return null;
        return medicoConvert.convertMedicoToMedicoWs(nuevoMedico);
    }
}
