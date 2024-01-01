package rectanglesintersection;

public class Main {
    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle(2, 2, 5, 4);
        Rectangle secondRectangle = new Rectangle(5, 4, 8, 6);

        IntersectionType intersectionType = firstRectangle.findIntersection(secondRectangle);

        if (intersectionType == IntersectionType.RECTANGLE) {
            System.out.println("Intersection: rectangle");
        } else if (intersectionType == IntersectionType.VERTICAL_LINE) {
            System.out.println("Intersection: vertical line");
        } else if (intersectionType == IntersectionType.HORIZONTAL_LINE) {
            System.out.println("Intersection: horizontal line");
        } else if (intersectionType == IntersectionType.POINT) {
            System.out.println("Intersection: point");
        } else {
            System.out.println("No intersection");
        }
    }
}