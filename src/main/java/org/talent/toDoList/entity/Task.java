package org.talent.toDoList.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.talent.toDoList.enumeration.RepeatType;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "NVARCHAR(30)")
    private String label;
    private LocalTime startTime;
    private LocalTime endTime;

    @Enumerated(EnumType.STRING)
    private RepeatType repeatType;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Category category;
}
