package de.ait.homework.homework45;

import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SafelyRetrievingElementsFromAnArrayTest {
    @Test
    public void testSafeRetrieveValidIndex() {
        String[] stringArray = {"Grape", "Banana", "Cherry", "Apple", "Elderberry"};
        String result = SafelyRetrievingElementsFromAnArray .safeRetrieve(stringArray, 2);
        assertEquals("Cherry", result);
    }

    @Test
    public void testSafeRetrieveInvalidIndex() {
        String[] stringArray = {"Grape", "Banana", "Cherry", "Apple", "Elderberry"};
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            SafelyRetrievingElementsFromAnArray .safeRetrieve(stringArray, 10);
        });
    }

    @Test
    public void testSafeRetrieveNegativeIndex() {
        String[] stringArray = {"Grape", "Banana", "Cherry", "Apple", "Elderberry"};
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            SafelyRetrievingElementsFromAnArray.safeRetrieve(stringArray, -1);
        });

    }

}