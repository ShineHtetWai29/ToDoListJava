package org.talent.toDoList.dto;

import lombok.Getter;
import lombok.Setter;
import org.talent.toDoList.entity.Category;
import org.talent.toDoList.enumeration.RepeatType;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter

public class NewTaskRequest {

    private String label;
    private LocalTime startTime;
    private LocalTime endTime;
    private RepeatType repeatType;
    private int categoryId;
}
