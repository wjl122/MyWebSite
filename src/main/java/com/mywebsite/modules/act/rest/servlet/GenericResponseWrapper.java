package com.mywebsite.modules.act.rest.servlet;

import java.io.ByteArrayOutputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import com.mywebsite.modules.act.rest.servlet.FilterServletOutputStream;

public class GenericResponseWrapper extends HttpServletResponseWrapper{

	private ByteArrayOutputStream output;
	private int contentLength;
	private String contentType;
	
	public GenericResponseWrapper(HttpServletResponse response) {
		super(response);
		output = new ByteArrayOutputStream();
	}
	
	public byte[] getData() {
		return output.toByteArray();
	}
    
	public ServletOutputStream getOutputStream() {
		return new FilterServletOutputStream(output);
	}
}
