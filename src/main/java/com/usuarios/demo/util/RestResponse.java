package com.usuarios.demo.util;

public class RestResponse {

	private Integer responseCode;
	private String mensaje;
	
	public RestResponse(Integer responseCode) {
		super();
		this.responseCode = responseCode;
	}
	
	public RestResponse(Integer responseCode, String mensaje) {
		super();
		this.responseCode = responseCode;
		this.mensaje = mensaje;
	}
	
	public Integer getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
