package com.example.icai.Final2021.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table("BOOKINGS")
public class Reservas {

   @Column("ID") @Id
   private int id;
   @Column("NUMBER_PEOPLE") private int number;

   public Reservas(String email, String APARTMENT, LocalDateTime start, LocalDateTime end) {
      this.email = email;
      this.APARTMENT = APARTMENT;
      this.start = start;
      this.end = end;
   }

   @Column("EMAIL") private String email;
   @Column("APARTMENT") private String APARTMENT;
   @Column("START_DATE") private LocalDateTime start;
   @Column("END_DATE") private LocalDateTime end;
   @Column("PETS") private boolean pets;


   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getNumber() {
      return number;
   }

   public void setNumber(int number) {
      this.number = number;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getAPARTMENT() {
      return APARTMENT;
   }

   public void setAPARTMENT(String APARTMENT) {
      this.APARTMENT = APARTMENT;
   }

   public LocalDateTime getStart() {
      return start;
   }

   public void setStart(LocalDateTime start) {
      this.start = start;
   }

   public LocalDateTime getEnd() {
      return end;
   }

   public void setEnd(LocalDateTime end) {
      this.end = end;
   }

   public boolean isPets() {
      return pets;
   }

   public void setPets(boolean pets) {
      this.pets = pets;
   }
}
