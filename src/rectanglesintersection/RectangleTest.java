package rectanglesintersection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    public void testNoIntersection() {
        Rectangle firstRectangle = new Rectangle(2, 1, 4, 3);
        Rectangle secondRectangle = new Rectangle(6, 3, 8, 5);

        IntersectionType result = firstRectangle.findIntersection(secondRectangle);
        assertEquals(IntersectionType.NO_INTERSECTION, result);
    }

    @Test
    public void testPointIntersection() {
        Rectangle firstRectangle = new Rectangle(1, 2, 3, 5);
        Rectangle secondRectangle = new Rectangle(3, 1, 5, 2);

        IntersectionType result = firstRectangle.findIntersection(secondRectangle);
        assertEquals(IntersectionType.POINT, result);
    }

    @Test
    public void testVerticalLinePartialIntersection() {
        Rectangle firstRectangle = new Rectangle(3, 1, 5, 4);
        Rectangle secondRectangle = new Rectangle(1, 2, 3, 5);

        IntersectionType result = firstRectangle.findIntersection(secondRectangle);
        assertEquals(IntersectionType.VERTICAL_LINE, result);
    }

    @Test
    public void testVerticalLineIntersection() {
        Rectangle firstRectangle = new Rectangle(7, 1, 9, 3);
        Rectangle secondRectangle = new Rectangle(9, 1, 11, 3);

        IntersectionType result = firstRectangle.findIntersection(secondRectangle);
        assertEquals(IntersectionType.VERTICAL_LINE, result);
    }

    @Test
    public void testHorizontalLinePartialIntersection() {
        Rectangle firstRectangle = new Rectangle(8, 5, 9, 6);
        Rectangle secondRectangle = new Rectangle(6, 6, 9, 8);

        IntersectionType result = firstRectangle.findIntersection(secondRectangle);
        assertEquals(IntersectionType.HORIZONTAL_LINE, result);
    }

    @Test
    public void testHorizontalLineIntersection() {
        Rectangle firstRectangle = new Rectangle(6, 6, 9, 8);
        Rectangle secondRectangle = new Rectangle(6, 5, 9, 6);

        IntersectionType result = firstRectangle.findIntersection(secondRectangle);
        assertEquals(IntersectionType.HORIZONTAL_LINE, result);
    }

    @Test
    public void testRectangleIntersection() {
        Rectangle firstRectangle = new Rectangle(2, 1, 4, 3);
        Rectangle secondRectangle = new Rectangle(3, 2, 5, 5);

        IntersectionType result = firstRectangle.findIntersection(secondRectangle);
        assertEquals(IntersectionType.RECTANGLE, result);
    }
}