package pe.edu.cibertec.DSWII_CL1SOAP_HuamanchumoManuel.configuration.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.DSWII_CL1SOAP_HuamanchumoManuel.model.Medico;
import pe.edu.cibertec.ws.objects.Medicows;

import java.util.ArrayList;
import java.util.List;

@Component
public class MedicoConvert {

    public Medico convertMedicowsToMedico(Medicows medicows){
        Medico medico = new Medico();
        medico.setIdmedico(medicows.getIdmedico());
        medico.setNommedico(medicows.getNommedico());
        medico.setApemedico(medicows.getApemedico());
        medico.setFechnacmedico(medicows.getFechnacmedico());
        return medico;
    }

    public List<Medico> convertMedicowsToMedico(List<Medicows> medicows){
        List<Medico> medicoList = new ArrayList<>();
        medicows.forEach(dom ->{
            medicoList.add(convertMedicowsToMedico(dom));
        });
        return medicoList;
    }
    public Medicows convertMedicoToMedicoWs(Medico medico){
        Medicows medicows = new Medicows();
        medicows.setIdmedico(medico.getIdmedico());
        medicows.setNommedico(medico.getNommedico());
        medicows.setApemedico(medico.getApemedico());
        medicows.setFechnacmedico(medico.getFechnacmedico());
        return medicows;
    }
    public List<Medicows> convertMedicoToMedicoWs(List<Medico> medico){
        List<Medicows> medicoList = new ArrayList<>();
        medico.forEach(dom ->{
            medicoList.add(convertMedicoToMedicoWs(dom));
        });
        return medicoList;
    }

}
