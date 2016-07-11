package prob7;

public class Duck extends Bird {

	@Override
	public void fly() {
		System.out.println("오리(" +birdname + ")는 날지 않습니다." );

	}

	@Override
	public void sing() {
		System.out.println("오리(" +birdname + ")가 소리내어 웁니다." );

	}

	@Override
	public String toString() {
		return "오리의 이름은 " + birdname + "입니다.";
	}

	@Override
	public void setName(String string) {
		birdname = string;

	}

}
