package com.example.week1assignment.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class CourseRequestedDto {
    private String title;
    private String tutor;

    public CourseRequestedDto(String title, String tutor) {
        this.title = title;
        this.tutor = tutor;
    }
}



