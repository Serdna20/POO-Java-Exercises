package dimension;

public class Dimension {
    double height;
    double width;
    double depth;

    public Dimension() {
        this.height = 0;
        this.width = 0;
        this.depth = 0;
    }

    public Dimension(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
    
    public double getVolumen() {
        return height*width*depth;
    }

    @Override
    public String toString() {
        return "Dimension{" + "height=" + height + ", width=" + width + ", depth=" + depth + ", maxVol=" + getVolumen() + '}';
    }
    
}
