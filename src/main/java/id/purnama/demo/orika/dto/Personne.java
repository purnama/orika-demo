package id.purnama.demo.orika.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Personne {

    private long id;
    private String nom;
    private String surnom;
    private int age;

}
