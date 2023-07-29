package com.java.aula04.client;

import com.java.aula04.dto.EnderecoDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class EnderecoClient {


    public EnderecoDTO bucarPorCep(String cep) throws  Exception{
        RestTemplate restTemplat = new RestTemplate();
        ResponseEntity<EnderecoDTO> result = restTemplat.exchange("https://viacep.com.br/ws/"+cep+"/json/", HttpMethod.GET, null, EnderecoDTO.class);
return  result.getBody();
    }
}
