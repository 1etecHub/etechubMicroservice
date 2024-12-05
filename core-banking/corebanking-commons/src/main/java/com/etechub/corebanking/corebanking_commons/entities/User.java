package com.etechub.corebanking.corebanking_commons.entities;


import com.etechub.corebanking.corebanking_commons.enums.Gender;
import com.etechub.corebanking.corebanking_commons.enums.Roles;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "users")
public class User extends BaseEntity{


    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String password;

    @Column
    private String address;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    
    @Column(name = "roles", nullable = false)
    @Enumerated(EnumType.STRING)
    private Roles role;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "registration_date")
    private LocalDateTime registrationDate;

    @Column(name = "last_login_date")
    private LocalDateTime lastLoginDate;

    private boolean isVerified;

    @OneToOne(mappedBy ="user")
    private WalletAccount walletAccount;



}
