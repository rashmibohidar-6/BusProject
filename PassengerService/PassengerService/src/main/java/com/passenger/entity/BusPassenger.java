package com.passenger.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bus_passengers")
public class BusPassenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long psngId;

    @NotNull
    @Size(max = 20 , message = "Name should be almost 20 characters")
    private String name;

//    @NotBlank(message = "number can not be blank")
//    @Size(max = 10 , message = "Number should be almost 20 characters")
    private Long number;

    @NotNull
    private String email;

    @NotNull
    private String address;
}
