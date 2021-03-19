package com.cxf.sb.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import org.apache.cxf.feature.Features;


@WebService
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class ExampleSoapService {
	
	@WebMethod
	public String sample() {
		return "Sample Example";
	}

}
