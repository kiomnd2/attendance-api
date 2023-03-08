package kiomnd2.studyattendance.studyattendance.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;

    private String userId;

    private String userName;

    private String password;

    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    private StudyGroup group;

}
