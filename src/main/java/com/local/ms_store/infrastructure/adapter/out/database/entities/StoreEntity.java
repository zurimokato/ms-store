package com.local.ms_store.infrastructure.adapter.out.database.entities;

import com.local.ms_store.domain.enums.Status;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "STORES")
public class StoreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String phone;
    @Enumerated(EnumType.STRING)
    private Status status;

}
