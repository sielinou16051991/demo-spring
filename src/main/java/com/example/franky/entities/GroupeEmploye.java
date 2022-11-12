package com.example.franky.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/**
 * Copyright (c) 2022, Iforce5, All Right Reserved.
 * https://iforce5.com
 * <p>
 * When: @created 05/November/2022 -- 2:30 PM
 * By :  @author Franky Brice on 11/5/2022
 * Project : @project demoStart
 * Package : @package com.example.franky.entities
 */

@Entity
@Table(name = "lnk_groupe_employe",
        indexes = {
                @Index(name = "UK_GROUPE_EMPLOYE", columnList = "id_groupe,id_employe", unique = true)
        })
public class GroupeEmploye {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "id_groupe")
    @ManyToOne(targetEntity = Groupe.class)
    private Groupe groupe;

    @JoinColumn(name = "id_employe")
    @ManyToOne(targetEntity = Employe.class)
    private Employe employe;

}
