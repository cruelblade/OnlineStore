package com.gorodovikov.OnlineStore.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "characteristic")
public class Characteristic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    int productId;

    int memorySize;

    String memoryType;

    int memoryFrequency;

    int hdmiOutputs;

}
