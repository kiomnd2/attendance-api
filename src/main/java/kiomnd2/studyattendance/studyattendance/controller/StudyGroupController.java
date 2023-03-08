package kiomnd2.studyattendance.studyattendance.controller;

import kiomnd2.studyattendance.studyattendance.service.StudyGroupService;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@RestController("/group")
public class StudyGroupController {

    private final StudyGroupService studyGroupService;


    @Builder
    @Getter
    public static class StudyGroupResponse {
        private Long groupId;

        private String groupName;

        private LocalDateTime groupCreateDate;
    }

    @Builder
    @Getter
    public static class StudyGroupRequest {

        private Long groupId;

        // 그룹명
        private String groupName;

        // 제한 인원
        private Long limitNumber;

        // 그룹 홈페이지 URL
        private String groupHomePageUrl;

        // 그룹 설명
        private String groupDescription;

    }
}
