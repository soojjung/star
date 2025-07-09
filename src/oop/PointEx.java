package oop;

public class PointEx {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1, 2, 3);
    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x :" + x + ", y :" + y;
    }
}

class Point3D extends Point {
    int z;
    
    Point3D(int x, int y, int z) {
        super(x, y);      // 부모(Point)의 생성자를 명시적으로 호출
        this.z = z;       // Point3D 고유 필드 초기화
    }

    @Override
    String getLocation() {
        return "x :" + x + ", y :" + y + ", z :" + z;
    }

//    Point3D(int x, int y, int z) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }
//
//    String getLocation() {
//        return "x :" + x + ", y :" + y + ", z :" + z;
//    }
}