package com.cxf.sb.ws.soap;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.cxf.sb.ws.soap.dto.SumRequest;
import com.cxf.sb.ws.soap.dto.SumResponse;

@WebService(name = "SumWs")
public interface SumWS {
	@WebResult(name = "response")
	SumResponse calculateSum(@WebParam SumRequest request);
}
