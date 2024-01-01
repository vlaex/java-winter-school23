package rectanglesintersection;

public final class Rectangle {
    private final int ax;
    private final int ay;
    private final int bx;
    private final int by;

    public Rectangle(int ax, int ay, int bx, int by) {
        this.ax = ax;
        this.ay = ay;
        this.bx = bx;
        this.by = by;
    }

    public IntersectionType findIntersection(Rectangle otherRectangle) {
        boolean isPointIntersection = false;
        boolean isVerticalLineIntersection = false;
        boolean isHorizontalLineIntersection = false;
        boolean isIntersectionRectangle = false;

        boolean areRectanglesOnXAxis = this.bx == otherRectangle.ax || this.ax == otherRectangle.bx;
        boolean areRectanglesOnYAxis = this.by == otherRectangle.ay || this.ay == otherRectangle.by;

        if (areRectanglesOnXAxis) {
            if (areRectanglesOnYAxis) {
                isPointIntersection = true;
            }

            // If the second rectangle is between the first rectangle's A1 and B2
            if (this.by > otherRectangle.ay && (this.ay < otherRectangle.ay || this.ay < otherRectangle.by)) {
                isVerticalLineIntersection = true;
            }
        }

        if (areRectanglesOnYAxis) {
            if (this.bx > otherRectangle.ax && (this.bx < otherRectangle.bx || this.ax < otherRectangle.bx)) {
                isHorizontalLineIntersection = true;
            }
        }

        boolean hasIntersectionOnXAxis = (this.ax >= otherRectangle.ax && this.ax < otherRectangle.bx) ||
                (this.bx > otherRectangle.ax && this.ax < otherRectangle.bx);

        boolean hasIntersectionOnYAxis = (this.ay < otherRectangle.ay && this.by > otherRectangle.ay) ||
                (this.ay > otherRectangle.ay && this.ay < otherRectangle.by);

        if (hasIntersectionOnXAxis && hasIntersectionOnYAxis) {
            isIntersectionRectangle = true;
        }

        if (isIntersectionRectangle) {
            return IntersectionType.RECTANGLE;
        } else if (isVerticalLineIntersection) {
            return IntersectionType.VERTICAL_LINE;
        } else if (isHorizontalLineIntersection) {
            return IntersectionType.HORIZONTAL_LINE;
        } else if (isPointIntersection) {
            return IntersectionType.POINT;
        } else {
            return IntersectionType.NO_INTERSECTION;
        }
    }
}
