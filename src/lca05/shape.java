package lca05;
/*
Write classes circle square rectangle
Perform constructor overloading and method overloading
Find area
 */
public class shape {

    double l1,l2,area;
    shape(){
        this.area=0;
    }
    shape(double r){
        this.l1=r;
        this.area=0;
    }
    shape(double l1, double l2){
        this.l1=l1;
        this.l2=l2;
        this.area=0;
    }
    public void find_area(double l1){
        this.area=this.l1*this.l1*Math.PI;
    }
    public void find_area(double l1, double l2){
        this.area=this.l1*this.l2;
    }
}

//class square extends shape{
//    square(){
//        super();
//    }
//    square(double l1, double l2){
//        super();
//    }
//}
//
//class rectangle extends shape{
//    rectangle(){
//        super();
//    }
//    rectangle(double l, double b){
//        super();
//    }
//}
//
//class circle extends shape{
//    circle(){
//        super();
//    }
//    circle(double r){
//        super();
//    }
//}
