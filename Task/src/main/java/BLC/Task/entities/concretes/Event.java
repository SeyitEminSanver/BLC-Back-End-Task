package BLC.Task.entities.concretes;

import java.time.LocalDateTime;


import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="event")
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="eventid")
    private Long eventId;

    @Column(name="eventname")
    private String eventName;
    
    @Column(name="startdate")
    private LocalDateTime startDate;

    @Column(name="enddate")
    private LocalDateTime endDate;

    @Column(name="quota")
    private Integer quota;

    @Column(name="numberofparticipants")
    private Integer numberOfParticipants;
}
