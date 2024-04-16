public class Circle extends Shape {
    double radius;  // radius = 반지름

    public Circle(String color, double radius) {
        super(color);   // 부모 클래스의 생성자 호출
        System.out.println("Circle 클래스의 생성자 호출");
        this.radius = radius;
    }

    // 추상 메서드 정의
    double area() {
        return radius * radius * 3.14;  // MathLibrary에서 pi변수 있다.
    }

    public String toString() {
        return "원 색상은 " + super.getColor() + " 그리고 면적은 " + area();
    }
}
