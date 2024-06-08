package pe.edu.cibertec.DSWII_CL1SOAP_HuamanchumoManuel.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.objects.GetPromedioPracticasRequest;
import pe.edu.cibertec.ws.objects.GetPromedioPracticasResponse;

import java.util.Arrays;

@Endpoint
public class PromedioEndPoint {

    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetPromedioPracticasRequest")
    @ResponsePayload
    public GetPromedioPracticasResponse getPromedioPracticas(@RequestPayload GetPromedioPracticasRequest request) {
        double[] notas = {request.getNota1(), request.getNota2(), request.getNota3(), request.getNota4()};
        Arrays.sort(notas);

        double notaEliminada = notas[0];
        double promedio = (notas[1] + notas[2] + notas[3]) / 3;

        GetPromedioPracticasResponse response = new GetPromedioPracticasResponse();
        response.setNotaEliminada(notaEliminada);
        response.setPromedio(promedio);

        return response;
    }
    }

