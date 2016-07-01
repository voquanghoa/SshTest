package com.quanghoa.sshtest;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody void get(HttpServletResponse response) throws IOException {
		
		response.getWriter().println("<?xml version='1.0' encoding='utf-8'?><invoices>\n"+
                "  <invoice>\n"+
                "    <invoice-number>23432</invoice-number>\n"+
                "    <order-number>1223</order-number>\n"+
                "    <contract-number>343</contract-number>\n"+
                "    <due-date>08/08/2009</due-date>\n"+
                "    <amount currency='USD'>459000</amount>\n"+
                "    <status>Paid</status>\n"+
                "  </invoice>\n"+
                "  <invoice>\n"+
                "    <invoice-number>23456</invoice-number>\n"+
                "    <order-number>1201</order-number>\n"+
                "    <contract-number>371</contract-number>\n"+
                "    <due-date>01/09/2010</due-date>\n"+
                "    <amount currency='USD'>76000</amount>\n"+
                "    <status>Paid</status>\n"+
                "  </invoice>\n"+
                "</invoices>");
	}
}
