package com.mum.edu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Contact {
    private String email;
    private String phone;
    private String mailBox;
}
