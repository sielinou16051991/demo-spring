package com.example.franky.entities;

import lombok.Data;

import javax.persistence.*;

/**
 * Copyright (c) 2022, Iforce5, All Right Reserved.
 * https://iforce5.com
 * <p>
 * When: @created 05/November/2022 -- 1:40 PM
 * By :  @author Franky Brice on 11/5/2022
 * Project : @project demoStart
 * Package : @package com.example.franky.entities
 */

@Entity
@Data
@Table(name = "compte_courant")
public class CompteCourant extends Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compte_courant")
    private Long id;

    private Double decouvert;
}
