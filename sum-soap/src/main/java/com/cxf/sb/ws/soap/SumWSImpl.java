package com.cxf.sb.ws.soap;

import com.cxf.sb.ws.soap.dto.SumRequest;
import com.cxf.sb.ws.soap.dto.SumResponse;

public class SumWSImpl implements SumWS {
	
	
	@Override
	public SumResponse calculateSum(SumRequest request) {
		int result = request.getNum1() + request.getNum2();
		SumResponse response = new SumResponse();
		response.setResult(result);
		return response;
	}


}
