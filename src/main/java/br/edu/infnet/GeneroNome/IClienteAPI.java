package br.edu.infnet.GeneroNome;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="https://api.genderize.io/", name = "GenderizeService")
public interface IClienteAPI {
    
    @GetMapping("?name={name}")
    Nome buscaGeneroPor(@PathVariable("name") String name);
    
    
}
