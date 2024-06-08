package pe.edu.cibertec.DSWII_CL1SOAP_HuamanchumoManuel.endpoint;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.objects.GetMinutesRequest;
import pe.edu.cibertec.ws.objects.GetMinutesResponse;


@Endpoint
public class TimeEndpoint {

    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetMinutesRequest")
    @ResponsePayload
    public GetMinutesResponse getMinutes(@RequestPayload GetMinutesRequest request) {
        int seconds = request.getSeconds();
        int minutes = seconds / 60;

        GetMinutesResponse response = new GetMinutesResponse();
        response.setMinutes(minutes);

        return response;
    }
}

