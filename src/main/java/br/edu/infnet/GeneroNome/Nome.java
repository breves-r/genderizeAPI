package br.edu.infnet.GeneroNome;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nome {
    @JsonProperty
    private String name;
    @JsonProperty
    private String gender;
    @JsonProperty
    private String probability;
    @JsonProperty
    private String count;
    
    @Override
    public String toString(){
        return 
                "Nome: " + name + "\n" + 
                "Gênero: "  + gender + "\n" + 
                "Probabilidade: " + probability + "\n" +
                "Count: " + count;
    }
    
}
