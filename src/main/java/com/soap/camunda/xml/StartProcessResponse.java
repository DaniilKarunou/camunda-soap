package com.soap.camunda.xml;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import static com.soap.camunda.config.EndpointConfiguration.NAMESPACE_URI;

@XmlRootElement(name = "StartProcessResponse", namespace = NAMESPACE_URI)
public class StartProcessResponse {
    private String message;

    @XmlElement
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}