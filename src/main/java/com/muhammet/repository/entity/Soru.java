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
@Table(name = "tblsoru")
public class Soru extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String konu;
    String soruicerik;
    String cevapa;
    String cevapb;
    String cevapc;
    String cevapd;
    int dogrucevap;
    Long time;
    int puan;
}
