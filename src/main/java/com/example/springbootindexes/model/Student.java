package com.example.springbootindexes.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(indexes = {
        @Index(columnList = "firstName"),
        @Index(name = "multiIndex1", columnList = "firstName, lastName"),
        @Index(name = "mulitIndex2", columnList = "lastName, firstName"),
        @Index(name = "mulitSortIndex", columnList = "firstName, lastName DESC"),
        @Index(name = "uniqueIndex", columnList = "firstName", unique = true),
        @Index(name = "uniqueMulitIndex", columnList = "firstName, lastName", unique = true)
        })
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;

}