/**
 * @author higor.robinn on 26/03/2025.
 */

package com.example.higor.webservice.soap;


import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "syncBancoResponse", namespace = "http://localhost:8080/motorista")
public class SyncBancoResponse {

    private String status;

    public SyncBancoResponse() {}

    @XmlElement(name = "status", namespace = "http://localhost:8080/motorista")
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
