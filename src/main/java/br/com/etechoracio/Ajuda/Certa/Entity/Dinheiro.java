package br.com.etechoracio.Ajuda.Certa.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Dinheiro")
public class Dinheiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idDinheiro")
    private Long id;

    @Column(name = "valor")
    private float dinheiro;
}
