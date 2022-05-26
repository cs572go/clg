package lca05;
/*
Write classes circle square rectangle
Perform constructor overloading and method overloading
Find area
 */
public class shape_driver {
    public static void main(String[] args) {
        shape s1 = new shape(5.5, 5.5);
        shape r1 = new shape(12.5, 10);
        shape c1 = new shape(10.5);

        s1.find_area(s1.l1, s1.l2);
        r1.find_area(s1.l1, s1.l2);
        c1.find_area(s1.l1);

        System.out.println("Area of square is : "+s1.area);
        System.out.println("Area of rectangle is : "+r1.area);
        System.out.println("Area of circle is : "+c1.area);
    }
}
