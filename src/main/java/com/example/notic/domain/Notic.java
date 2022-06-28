package com.example.notic.domain;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Notic {
    private Long noticId;
    private String title;
    private String content;
    private String name;
    private LocalDateTime createDate;
    private int read;
    private Long memberId;
}
