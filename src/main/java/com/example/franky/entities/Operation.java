package com.example.franky.entities;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Copyright (c) 2022, Iforce5, All Right Reserved.
 * https://iforce5.com
 * <p>
 * When: @created 05/November/2022 -- 1:41 PM
 * By :  @author Franky Brice on 11/5/2022
 * Project : @project demoStart
 * Package : @package com.example.franky.entities
 */

@Data
public abstract class Operation {

    @Column(name = "num_operation", unique = true, nullable = false)
    private Long numOperation;

    @Column(name = "date_operation")
    private LocalDateTime dateOperation = LocalDateTime.now();

    private Double montant;
}
