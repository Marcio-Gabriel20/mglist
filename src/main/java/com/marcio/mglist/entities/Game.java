package com.marcio.mglist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_game")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column(name = "game_year") // a palavra "year" é palavra reservada no banco de dados, então o ela está sendo alterada para "game_year"
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    @Column(columnDefinition = "TEXT") // um 'VARCHAR' só vai até 255 caracteres, então o tipo está sendo alterado para 'TEXT' com o objetivo de alcançar maiores dimensões
    private String shortDescription;

    @Column(columnDefinition = "TEXT") // um 'VARCHAR' só vai até 255 caracteres, então o tipo está sendo alterado para 'TEXT' com o objetivo de alcançar maiores dimensões
    private String longDescription;

}