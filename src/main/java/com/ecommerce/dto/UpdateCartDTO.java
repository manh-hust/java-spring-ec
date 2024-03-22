package com.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateCartDTO {

    private Long productId;
    private Integer quantity;

    public UpdateCartDTO() {
    }

    public UpdateCartDTO(Integer quantity) {
        this.quantity = quantity;
    }

    public UpdateCartDTO(Long productId, Integer quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }
}
