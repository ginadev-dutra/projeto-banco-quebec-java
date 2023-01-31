package models;

import lombok.*;

import java.util.List;

@Getter
@Setter

public class Banco {

    private String nome;
    private List<Conta> contas;

}
