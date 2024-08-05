package com.apple.shop;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class notice {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String title;

    @Column(nullable = false)
    public Date date;

}
