public class page32 {
	public static void main(String[] args) {
		P32Vehicle[] vc = new P32Vehicle[2];
		
		vc[0] = new P32Car(1234, 20.5);
		vc[1] = new P32Plane(232);
		for(int i = 0; i < vc.length; i++) {
			if(vc[i] instanceof P32Car) {
				System.out.println("第" + (i+1) + "個物件是Car類別");
			}else {
				System.out.println("第" + (i+1) + "個物件不是Car類別");
			}
		}
	} 
}


abstract class P32Vehicle {
    protected int speed;

    public void setSpeed(int s) {
        speed = s;
        System.out.println("常速度設為" + speed + "了");
    }

    abstract void show();
}

class P32Car extends P32Vehicle {
    private int num;
    private double gas;

    public P32Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("速度是" + speed);
    }
}

class P32Plane extends P32Vehicle {
    private int flight;

    public P32Plane(int f) {
        flight = f;
        System.out.println("生產了航班" + flight + "班次的飛機");
    }

    public void show() {
        System.out.println("飛機的班次是" + flight);
        System.out.println("速度是" + speed);
    }
}
