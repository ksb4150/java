package sec02.exam01;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1+"+"+data2+"="+result);
		} catch (NumberFormatException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (Exception e) {
			//Exception e를 맨 마지막에 씀 -> 개발자가 생각하지 못한 예외를 캐치해주는 용도
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}

/*
 catch (Exception e) {}
 catch (ArrayIndexOutOfBoundsException e) {}
 위와 같이 Exception e를 먼저 써주면 

  */
//먼저 써주면 생각해논 예외를 exception이 캐치해서 생각해논 예외를 저장할 공간이 없음