package com.example.icai.Final2021.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Temperatures {

    @Column("ID") @Id private int id;
    @Column("VALUE") private float value;
    @Column("MONTH") private String month;
    @Column("MONTH_OF_YEAR") private int month_of_year;
    @Column("YEAR") private int year;


}
