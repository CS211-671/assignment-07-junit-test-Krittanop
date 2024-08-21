package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    StudentList sl1;
    @BeforeEach
    void init() {
        sl1 = new StudentList();
        sl1.addNewStudent("6610xxxxxx", "Point1");
        sl1.addNewStudent("6611xxxxxx", "Point2", 50);
    }

    @Test
    @DisplayName("Test findStudentById")
    void testFindStudentById() {
        assertEquals((sl1.getStudents()).get(0) ,sl1.findStudentById("6610xxxxxx"));
        assertEquals((sl1.getStudents()).get(1) ,sl1.findStudentById("6611xxxxxx"));
        assertNull(sl1.findStudentById("6612xxxxxx"));
    }

    @Test
    @DisplayName("Test giveScoreToId method")
    void testGiveScoreToId() {
        sl1.giveScoreToId("6610xxxxxx", 55);
        assertEquals(55, sl1.getStudents().get(0).getScore());
    }

    @Test
    @DisplayName("Test viewGradeOfId")
    void testViewGradeOfId() {
        sl1.giveScoreToId("6610xxxxxx", 95);
        sl1.giveScoreToId("6611xxxxxx", 2);
        assertEquals("A", sl1.viewGradeOfId("6610xxxxxx"));
        assertEquals("D", sl1.viewGradeOfId("6611xxxxxx"));
    }

}