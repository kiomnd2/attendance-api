package kiomnd2.studyattendance.studyattendance.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Attendance {

    @Id
    private LocalDate attendanceDate;

    @ManyToOne
    private Member member;

    @ManyToOne
    private StudyGroup group;

    private LocalDateTime lastAttendanceDate;

}
