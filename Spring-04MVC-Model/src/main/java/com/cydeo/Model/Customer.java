package com.cydeo.Model;

import com.cydeo.enums.MembershipType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private String firstName;
    private String lastName;
    private String address1;
    private String address2;
    private String state;
    private String zipCode;
    private String city;
    private String email;
    private MembershipType membershipType;
    private boolean agreeTerms;

}
