package sec06.exam04.package2;

import sec06.exam04.package1.*;

public class C {
	A a1 = new A(true);
	//A a2 = new A(1); default는 같은 패키지 안에서만 가능하기 때문에 에러
	//A a3 = new A("문자열") private는 같은 내부 안에서만 가능하기 때문에 에러
}
