public class Circle implements Cloneable {
    private String label;
    private Point[] points;

    Circle (String label, Point[] source){
        this.label=label;
        this.points=new Point[source.length];
        for (int i = 0; i < source.length; i++) {
            this.points[i] = new Point(source[i]); 
        }
    }

    public Point gePoint(int index){
        if (index >= 0 && index < points.length)
            return points[index];
        return null;
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }

     public Circle deepCopy() throws CloneNotSupportedException {
        Circle copy = (Circle) super.clone(); // first shallow
        
        copy.points = new Point[this.points.length];
        for (int i = 0; i < this.points.length; i++) {
            copy.points[i] = new Point(this.points[i]); // new Point
        }
        copy.label = this.label; 
        return copy;
    }

    @Override
    public String toString() {
        String result = label + ": [";
        for (int i = 0; i < points.length; i++) {
            result += points[i].toString();
            if (i < points.length - 1) result += ", ";
        }
        result += "]";
        return result;
    }

    public Point getX(int index) { 
        return points[index]; 
    }
    
    public Point getY(int index) { 
        return points[index]; 
    }

}