package com.AgileTracker.tracker.model;

import lombok.Getter;
import lombok.Setter;
import net.minidev.json.annotate.JsonIgnore;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "projects")
public class Project {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Getter
    @Setter
    @NotBlank
    private String name;

    @Getter
    @Setter
    private String details;

    @Getter
    @Setter
    private enums.projectState state;

    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date startDate = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date expectedEndDate = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date actualEndDate = new Date();
}
