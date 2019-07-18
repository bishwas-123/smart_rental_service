package com.solam.ea.solam_return.domain;


import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ReturnDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private long customerId;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date checkOut;

    @NotNull
    private long rentId;

    @NotNull
    private long paymentId;

    private String description;




    public ReturnDomain(@NotNull long customerId, @NotNull long rentId, @NotNull long paymentId, @NotNull Date checkOut, String description) {
        this.customerId = customerId;
        this.checkOut=checkOut;
        this.rentId=rentId;
        this.paymentId=paymentId;
        this.description=description;

    }
}
