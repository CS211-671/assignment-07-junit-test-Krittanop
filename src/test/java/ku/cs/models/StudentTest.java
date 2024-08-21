package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student s1;

    @BeforeEach
    void init() {
        s1 = new Student("6610450749", "Point");
    }

    @Test
    @DisplayName("Test addScore method")
    void testAddScore(){
//        Student s1 = new Student("6610450749", "Point");
        assertEquals(0, s1.getScore());
        s1.addScore(40);
        assertEquals(40, s1.getScore());
        s1.addScore(10);
        assertEquals(60, s1.getScore());  //Assume that getScore is not correct (expected value not equal to method return value)
    }

    @Test
    @DisplayName("Test grade method")
    void testCalculateGrade() {
//        Student s1 = new Student("6610450749", "Point");
        s1.addScore((80));
        assertEquals("A", s1.grade());
    }

    @Test
    @DisplayName("Test isId method")
    void testIsId() {
        assertTrue(s1.isId("6610450749"));
    }

    @Test
    @DisplayName("Test getName method")
    void testGetName() {
        assertEquals("Point", s1.getName());
    }

    @Test
    @DisplayName("Test getId method")
    void testGetId() {
        assertEquals("6610450749", s1.getId());
    }

    @Test
    @DisplayName("Test getScore method")
    void testGetScore() {
        s1.addScore(50);
        assertEquals(50, s1.getScore());
    }

    @Test
    @DisplayName("Test changeName method")
    void testChangeName() {
        s1.changeName("Point123");
        assertEquals("Point123", s1.getName());
    }

    @Test
    @DisplayName("Test toString method")
    void testToString() {
        assertEquals("{id: '6610450749', name: 'Point', score: 0.0}", s1.toString());
    }
}