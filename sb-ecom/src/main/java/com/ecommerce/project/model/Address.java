package com.ecommerce.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "addresses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;

    @NotBlank
    @Size(min=5,message = "Minimum 5 Characters")
    private String street;

    @NotBlank
    @Size(min=5,message = "Minimum 5 Characters")
    private String buildingName;

    @NotBlank
    @Size(min=3,message = "Minimum 3 Characters")
    private String city;

    @NotBlank
    @Size(min=2,message = "Minimum 2 Characters")
    private String state;

    @NotBlank
    @Size(min=2,message = "Minimum 2 Characters")
    private String country;

    @NotBlank
    @Size(min=6,message = "Minimum 6 Characters")
    private String pincode;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Address(Long addressId, String street, String buildingName,
                   String city, String state, String country, String pincode) {
        this.addressId = addressId;
        this.street = street;
        this.buildingName = buildingName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }
}
