package com.soap.camunda.endpoint;

import com.soap.camunda.xml.StartProcessRequest;
import com.soap.camunda.xml.StartProcessResponse;
import lombok.RequiredArgsConstructor;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import static com.soap.camunda.config.EndpointConfiguration.NAMESPACE_URI;

@Endpoint
@RequiredArgsConstructor
public class StartProcessEndpoint {

    private final RuntimeService runtimeService;

    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "StartProcessRequest")
    public StartProcessResponse startProcess(@RequestPayload StartProcessRequest request) {
        runtimeService.startProcessInstanceByKey(request.getProcessKey());

        StartProcessResponse response = new StartProcessResponse();
        response.setMessage("Process started successfully");
        return response;
    }
}