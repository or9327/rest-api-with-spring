package com.jaeeun.demoinflearnrestapi.events;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder @NoArgsConstructor @AllArgsConstructor //기본 생성자, 모든 아규먼트 갖는 생성자 둘다 만들기위함
@Getter @Setter @EqualsAndHashCode(of ="id")
@Entity
public class Event {
    @Id @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    private LocalDateTime beginEnrollmentDateTime;
    private LocalDateTime closeEnrollmentDateTime;
    private LocalDateTime beginEventDateTime;
    private LocalDateTime endEventDateTime;
    private String location; // (optional) 이게 없으면 온라인 모임
    private int basePrice; // (optional)
    private int maxPrice; // (optional)
    private int limitOfEnrollment;
    private Boolean offline;
    private Boolean free;
    @Enumerated(EnumType.STRING)
    private EventStatus eventStatus;



}
