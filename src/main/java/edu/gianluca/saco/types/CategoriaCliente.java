package edu.gianluca.saco.types;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name="categoria_cliente")
public class CategoriaCliente{

    public static enum categoria{Esporádico, Especial, Mal_Pagador, Devedor};

    @Enumerated(EnumType.STRING)
    CategoriaCliente categoria;

}