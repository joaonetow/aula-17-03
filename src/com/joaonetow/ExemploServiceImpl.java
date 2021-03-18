package com.joaonetow;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.joaonetow.ExemploService")
public class ExemploServiceImpl implements ExemploService {

    @WebMethod
    public int calcula(int id) {
        return id+10;
    }

    @WebMethod
    public String nome(String nome) {
        return nome;
    }
}