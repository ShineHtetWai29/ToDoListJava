package org.talent.toDoList.entity;

import jakarta.persistence.*;
import lombok.*;
import org.yaml.snakeyaml.LoaderOptions;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "NVARCHAR(30)")
    private String name;
    private String imageUrl;
}
