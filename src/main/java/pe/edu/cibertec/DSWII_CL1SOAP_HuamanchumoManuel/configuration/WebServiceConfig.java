package pe.edu.cibertec.DSWII_CL1SOAP_HuamanchumoManuel.configuration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;


@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServletServletRegistrationBean
            (ApplicationContext applicationContext){
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet,"/ws/*");
    }
    @Bean(name = "medicos")
    public DefaultWsdl11Definition medicoWsdl11Definition(XsdSchema medicoSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("MedicosPort");
        wsdl11Definition.setLocationUri("/ws/medicos");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(medicoSchema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema medicoSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/medico.xsd"));
    }

    @Bean(name = "salario")
    public DefaultWsdl11Definition salarioWsdl11Definition(XsdSchema salarioSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("SalarioPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(salarioSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema salarioSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/salario.xsd"));
    }

    @Bean(name = "promedio")
    public DefaultWsdl11Definition promedioWsdl11Definition(XsdSchema promedioSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("PromedioPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(promedioSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema promedioSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/promedio.xsd"));
    }

    @Bean(name = "minutos")
    public DefaultWsdl11Definition minutosWsdl11Definition(XsdSchema minutosSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("MinutosPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(minutosSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema minutosSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/minutos.xsd"));
    }

    @Bean(name = "serie")
    public DefaultWsdl11Definition serieWsdl11Definition(XsdSchema serieSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("SeriePort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(serieSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema serieSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/serie.xsd"));
    }

    @Bean(name = "calculo")
    public DefaultWsdl11Definition calculoWsdl11Definition(XsdSchema calculoSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CalculoPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(calculoSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema calculoSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/calculo.xsd"));
    }



}
