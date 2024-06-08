package pe.edu.cibertec.DSWII_CL1SOAP_HuamanchumoManuel.endpoint;


import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.objects.GetSumSeriesRequest;
import pe.edu.cibertec.ws.objects.GetSumSeriesResponse;


@Endpoint
public class SerieEndpoint {

    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetSumSeriesRequest")
    @ResponsePayload
    public GetSumSeriesResponse getSumSeries(@RequestPayload GetSumSeriesRequest request) {
        int limit = request.getLimit();
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            sum += i;
        }

        GetSumSeriesResponse response = new GetSumSeriesResponse();
        response.setSum(sum);

        return response;
    }
}

