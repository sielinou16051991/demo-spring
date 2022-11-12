package com.example.franky.entities;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Copyright (c) 2022, Iforce5, All Right Reserved.
 * https://iforce5.com
 * <p>
 * When: @created 05/November/2022 -- 1:38 PM
 * By :  @author Franky Brice on 11/5/2022
 * Project : @project demoStart
 * Package : @package com.example.franky.entities
 */


@Data
@MappedSuperclass
public abstract class Compte {

    @Column(name = "num_compte", unique = true, nullable = false)
    private String numCompte;

    @Column(name = "date_creation")
    @CreatedDate
    private LocalDateTime dateCreation = LocalDateTime.now();

    private Double solde;

}
