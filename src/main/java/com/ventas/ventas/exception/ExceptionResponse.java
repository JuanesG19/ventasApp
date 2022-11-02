package com.ventas.ventas.exception;

import java.util.Date;
import java.util.Map;

public class ExceptionResponse {

    private Date timestamp;

    private String mensaje;

    private String detalles;

    private Map<String, String> errorresValidacion;

    public ExceptionResponse(Date timestamp, String mensaje, String detalles) {
        this.timestamp = timestamp;
        this.mensaje = mensaje;
        this.detalles = detalles;
    }

    public ExceptionResponse() {
    }

    public ExceptionResponse(Date timestamp, String mensaje, String detalles, Map<String, String> errorresValidacion) {
        this.timestamp = timestamp;
        this.mensaje = mensaje;
        this.detalles = detalles;
        this.errorresValidacion = errorresValidacion;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Map<String, String> getErrorresValidacion(){
        return errorresValidacion;
    }

    public void setErrorresValidacion(Map<String, String> errorresValidacion){
        this.errorresValidacion = errorresValidacion;
    }
}
