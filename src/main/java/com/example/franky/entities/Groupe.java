package com.example.franky.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Copyright (c) 2022, Iforce5, All Right Reserved.
 * https://iforce5.com
 * <p>
 * When: @created 05/November/2022 -- 1:41 PM
 * By :  @author Franky Brice on 11/5/2022
 * Project : @project demoStart
 * Package : @package com.example.franky.entities
 */

@Entity
@Data
public class Groupe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_groupe")
    private Long id;

    @Column(name = "num_groupe")
    private Long numGroupe;

    @Column(name = "nom_groupe")
    private String nomGroupe;

    @OneToMany(targetEntity = GroupeEmploye.class, mappedBy = "groupe")
    private Set<GroupeEmploye> groupeEmployes;

}
