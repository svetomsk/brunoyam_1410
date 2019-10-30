package crosses_zeros.tests;

import crosses_zeros.Cell;
import crosses_zeros.Field;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class FieldTest {
    @Test
    public void testSetValueEmptyCell() {
        Field field = new Field();
        boolean result = field.setValue(0, 0, Cell.CROSS);
        assertTrue(result);
//        int actual = 123;
//        int expected = 124;
//        assertEquals(expected, actual);
    }

    @Test
    public void testSetValueNotEmptyCell() {
        Field field = new Field();
        field.setValue(0, 0, Cell.CROSS);
        boolean result = field.setValue(0, 0, Cell.CROSS);
        assertFalse(result);
    }

    @Test
    public void testSetValueOutOfBounds() {
        Field field = new Field();
        boolean result = field.setValue(-1, -1, Cell.CROSS);
        assertFalse(result);
    }

    @Test
    public void testClearField() {
        Field field = new Field();
        for (int i = 0; i < field.getSize(); i++) {
            for (int j = 0; j < field.getSize(); j++) {
                field.setValue(i, j, Cell.CROSS);
            }
        }

        field.clearField();
        for (int i = 0; i < field.getSize(); i++) {
            for (int j = 0; j < field.getSize(); j++) {
                assertEquals(Cell.EMPTY, field.getValue(i, j));
            }
        }
    }
    // Test Driven Development
}
