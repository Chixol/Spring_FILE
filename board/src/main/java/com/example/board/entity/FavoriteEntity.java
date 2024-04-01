package com.example.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "favorite")
@Table(name = "favorite")
public class FavoriteEntity {
    @Id
    private Integer boardNumber;
    @Id
    private String UserEmail;
}
