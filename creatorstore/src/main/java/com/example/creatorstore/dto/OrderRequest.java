package com.example.creatorstore.dto;

import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequest {
    @NotNull(message = "customer must be not empty")
    private String customerName;

    @NotBlank(message = "Email must be in valid format")
    @Email(message = "Enter a valid email")
    private String customerEmail;

    @Valid
    @NotEmpty(message = "Order must contain atleast one item")
    private List<OrderItemRequest> items;
}
