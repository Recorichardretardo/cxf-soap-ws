package com.cxf.sb.ws.soap;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.ws.example.CustomerOrdersPortType;
import com.ws.example.GetOrdersRequest;
import com.ws.example.GetOrdersResponse;
import com.ws.example.Order;

public class CustomerOrderWsClient {
	public static void main(String[] args) {
		try {
			CustomerOrdersWsImplService service = new CustomerOrdersWsImplService(
					new URL("http://localhost:8080/top-down-wsdl-first-ws/customer-orders-service?wsdl"));
			CustomerOrdersPortType customerOrdersWsImplPort = service.getCustomerOrdersWsImplPort();
			
			GetOrdersRequest request = new GetOrdersRequest();
			request.setCustomerId(BigInteger.valueOf(1));
			GetOrdersResponse response = customerOrdersWsImplPort.getOrders(request);
			List<Order> orders = response.getOrder();
			
			System.out.println("Number of orders for the customer are:" + orders.size());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}
}
