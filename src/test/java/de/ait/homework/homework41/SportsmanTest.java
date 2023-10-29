package de.ait.homework.homework41;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportsmanTest {
    private Sportsman sportsman;


    @BeforeEach
    void setUp() {
        sportsman = new Sportsman("Aleksey Nazarov", 37, "cyber", 10);
    }
    @Test
    public void testSportsmanCreation() {
        assertNotNull(sportsman);
        assertEquals("Aleksey Nazarov", sportsman.getName());
    }
    @Test
    public void testUpdateRecordGreater() {

        sportsman.updateRecord(15);
        assertEquals(15, sportsman.getRecords());
    }

    @Test
    void getName() {
        assertEquals("Aleksey Nazarov", sportsman.getName());
    }

    @Test
    void setName() {
        sportsman.setName("Aleksey Nazarov");
        assertEquals("Aleksey Nazarov", sportsman.getName());
    }

    @Test
    void getAge() {
        assertEquals(37, sportsman.getAge());
    }

    @Test
    void setAge() {
        sportsman.setAge(38);
        assertEquals(38, sportsman.getAge());
    }

    @Test
    void getSport() {
        assertEquals("cyber", sportsman.getSport());
    }

    @Test
    void setSport() {
        sportsman.setSport("Basketball");
        assertEquals("Basketball", sportsman.getSport());
    }

    @Test
    void getRecords() {
        assertEquals(10, sportsman.getRecords());
    }

    @Test
    void setRecords() {
        sportsman.setRecords(20);
        assertEquals(20, sportsman.getRecords());
    }

    @Test
    public void testUpdateRecordLesserOrEqual() {

        sportsman.updateRecord(5);
        assertEquals(10, sportsman.getRecords());

        sportsman.updateRecord(10);
        assertEquals(10, sportsman.getRecords());
    }

    @Test
    void isEligibleForCompetition() {
        assertTrue(sportsman.isEligibleForCompetition(20, 39));
        assertFalse(sportsman.isEligibleForCompetition(20, 30));
    }

    @Test
    void testToString() {
        String expected = "Sportsman{name='Aleksey Nazarov', age=37, sport='cyber', records=10}";
        assertEquals(expected, sportsman.toString());
    }
}