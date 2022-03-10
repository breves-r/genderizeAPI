package br.edu.infnet.GeneroNome;

import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class GeneroNomeApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(GeneroNomeApplication.class, args);
	}
        
        @Autowired
        private IClienteAPI clienteAPI;
        
        @Override
        public void run(String... args) throws Exception {
            
            Scanner entrada = new Scanner(System.in);
            
            System.out.println("Entre com o nome: ");
            
            String nome = entrada.nextLine();
            
            System.out.println(clienteAPI.buscaGeneroPor(nome));
    }

}
