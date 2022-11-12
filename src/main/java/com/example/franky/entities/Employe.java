package com.example.franky.entities;

import lombok.Data;

import javax.persistence.*;

/**
 * Copyright (c) 2022, Iforce5, All Right Reserved.
 * https://iforce5.com
 * <p>
 * When: @created 05/November/2022 -- 1:39 PM
 * By :  @author Franky Brice on 11/5/2022
 * Project : @project demoStart
 * Package : @package com.example.franky.entities
 */

@Entity
@Data
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employe")
    private Long id;

    @Column(name = "code_employe")
    private Long codeEmploye;

    @Column(name = "nom_employe")
    private String nomEmploye;

}
