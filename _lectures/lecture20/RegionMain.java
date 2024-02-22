import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static java.lang.Integer.*;

class Point {
  int x, y;
  Point(int x, int y) { this.x = x; this.y = y; }
  boolean belowLeftOf(Point p) { return this.x < p.x && this.y < p.y; }
  boolean aboveRightOf(Point p) { return this.x > p.x && this.y > p.y; }
  double distance(Point p) {
    int dx = p.x - this.x;
    int dy = p.y - this.y;
    return Math.sqrt(dx * dx + dy * dy);
  }
}
interface Region { boolean contains(Point p); }
class RectRegion implements Region {
  Point lowerLeft, upperRight;
  RectRegion(Point lowerL, Point upperR) {
    this.lowerLeft = lowerL;
    this.upperRight = upperR;
  }
  public boolean contains(Point p) { return this.lowerLeft.belowLeftOf(p) && this.upperRight.aboveRightOf(p); }
}
class CircleRegion implements Region {
  Point center;
  int radius;
  CircleRegion(Point center, int radius) { this.center = center; this.radius = radius; }
  public boolean contains(Point p) { return this.center.distance(p) < this.radius; }
}
class ArrayUnionRegion implements Region {
  Region[] regions;
  ArrayUnionRegion(Region[] regions) { this.regions = regions; }
  public boolean contains(Point p) {
    for(Region r: this.regions) {
      if(r.contains(p)) { return true; }
    }
    return false;
  }
}

class RegionMain {

  static Region makeRegion(String line) {
    String[] parts = line.split(" ");
    if(parts[0].equals("circle")) {
      Point center = new Point(parseInt(parts[1]), parseInt(parts[2]));
      return new CircleRegion(center, parseInt(parts[3]));
    }
    else if(parts[1].equals("rectangle")) {
      Point ll = new Point(parseInt(parts[1]), parseInt(parts[2]));
      Point ur = new Point(parseInt(parts[3]), parseInt(parts[4]));
      return new RectRegion(ll, ur);
    }
    else {
      return null;
    }
  }

  static Point makePoint(String line) {
    String[] parts = line.split(" ");
    return new Point(parseInt(parts[0]), parseInt(parts[1]));
  }

  public static void main(String[] args) throws IOException {
    String regFile = Files.readString(Paths.get(args[0]));
    String[] regLines = regFile.split("\n");

    String points = Files.readString(Paths.get(args[1]));
    String[] pointsLines = points.split("\n");

    Region[] regions = new Region[regLines.length];

    for(int i = 0; i < regLines.length; i += 1) {
      regions[i] = makeRegion(regLines[i]);
    }

    Region unionOfAll = new ArrayUnionRegion(regions);

    for(String line: pointsLines) {
      Point p = makePoint(line);
      if(unionOfAll.contains(p)) {
        System.out.println(line);
      }
    }
  }
}
