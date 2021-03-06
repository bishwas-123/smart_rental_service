package com.ea.rentalproject.rentalea.domain;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class SearchFilter {
    private String zipcode;
    private String category;
    private String min_price;
    private String max_price;

    public SearchFilter(String zipcode, String category, String min_price, String max_price) {
        this.zipcode = zipcode;
        this.category = category;
       this.min_price=min_price;
       this.max_price=max_price;
    }
}
