package lambda;

@FunctionalInterface //함수형 인터페이스 - 메서드가 여러개면 오류
public interface MyNumber { //lambda를 위한 함수형 interface는 메서드를 하나만 선언해야 한다.

	int getMaxNumber(int num1, int num2);
}
