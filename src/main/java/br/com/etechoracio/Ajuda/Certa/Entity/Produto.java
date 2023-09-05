package br.com.etechoracio.Ajuda.Certa.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table(name = "Produto")
public class Produto {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column(name = "idProduto")
        private Long id;

        @Column(name = "tipoProduto")
        private String tipoProduto;

        @Column(name = "validade")
        private LocalDate validade;
    }
