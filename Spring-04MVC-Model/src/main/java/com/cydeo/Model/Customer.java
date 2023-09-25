package com.cydeo.Model;

import com.cydeo.enums.MembershipType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {


//    @NotNull  null object, ""
//    @NotEmpty  " "
    @NotBlank // one char besides space
    @Size(min=2, max=20)
    private String firstName;
    private String lastName;
    private String address1;
    private String address2;
    private String state;
    private String zipCode;
    private String city;
    @Email
    private String email;
    private MembershipType membershipType;
    private boolean agreeTerms;

}
