public abstract class Shape {
    String color;

    abstract double area();
    public abstract String toString();  // toString() = 다른 자료형 상수, 정수가 문자열로 변경

    public Shape(String color) {
        System.out.println("Shape 클래스 생성자 호출");
        this.color = color;
    }

    // 일반 메서드를 정의하면 모든 자식 클래스에서 같은함수를 사용할 수 있다.
    public String getColor() {
        return color;
    }
}
