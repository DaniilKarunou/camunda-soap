package com.soap.camunda.xml;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Setter;

import static com.soap.camunda.config.EndpointConfiguration.NAMESPACE_URI;

@Setter
@XmlRootElement(name = "StartProcessRequest", namespace = NAMESPACE_URI)
public class StartProcessRequest {
    private String processKey;

    @XmlElement(name = "processKey", namespace = NAMESPACE_URI)
    public String getProcessKey() {
        return processKey;
    }
}