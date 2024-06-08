package pe.edu.cibertec.DSWII_CL1SOAP_HuamanchumoManuel.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.objects.GetSalarioRequest;
import pe.edu.cibertec.ws.objects.GetSalarioResponse;

@Endpoint
public class SalarioEndpoint {

    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetSalarioRequest")
    @ResponsePayload
    public GetSalarioResponse getSalario(@RequestPayload GetSalarioRequest request) {
        GetSalarioResponse response = new GetSalarioResponse();
        double salarioRegular = request.getHorasTrabajadas() * request.getTarifaHoraRegular();
        double salarioExtra = (request.getHorasTrabajadas() > 40) ?
                (request.getHorasTrabajadas() - 40) * request.getTarifaHoraExtra() : 0;
        response.setSalario(salarioRegular + salarioExtra);
        return response;
    }
}
