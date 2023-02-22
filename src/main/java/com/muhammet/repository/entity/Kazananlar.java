package com.muhammet.repository.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tblkazananlar")
public class Kazananlar extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long oyunid;
    Long oyuncuid;
    int siralama;
    String odul;
}
