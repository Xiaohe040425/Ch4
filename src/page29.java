public class page29 {
	public static void main(String[] args) {
		P29Vehicle[] vc = new P29Vehicle[2];
		
		vc[0] = new P29Car(1234, 20.5);
		vc[0].setSpeed(60);
		
		vc[1] = new P29Plane(232);
		vc[1].setSpeed(500);
		
		for(int i = 0; i < vc.length; i++) {
			vc[i].show();
		}
	} 
}


abstract class P29Vehicle {
    protected int speed;

    public void setSpeed(int s) {
        speed = s;
        System.out.println("常速度設為" + speed + "了");
    }

    abstract void show();
}

class P29Car extends P29Vehicle {
    private int num;
    private double gas;

    public P29Car(int n, double g) {
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

class P29Plane extends P29Vehicle {
    private int flight;

    public P29Plane(int f) {
        flight = f;
        System.out.println("生產了航班" + flight + "班次的飛機");
    }

    public void show() {
        System.out.println("飛機的班次是" + flight);
        System.out.println("速度是" + speed);
    }
}