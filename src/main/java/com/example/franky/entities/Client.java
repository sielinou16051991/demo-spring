package com.example.franky.entities;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

/**
 * Copyright (c) 2022, Iforce5, All Right Reserved.
 * https://iforce5.com
 * <p>
 * When: @created 05/November/2022 -- 1:38 PM
 * By :  @author Franky Brice on 11/5/2022
 * Project : @project demoStart
 * Package : @package com.example.franky.entities
 */

@Entity
@Data
@Table(name = "client")
public class Client {

    @Id
    @Column(name = "id_client")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private Long code;

    private String nom;


}
