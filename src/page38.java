public class page38 {
	public static void main(String[] args) {
		iP38Vehicle[] ivc = new iP38Vehicle[2];
		
		ivc[0] = new P38Car(1234, 20.5);
		
		ivc[1] = new P38Plane(232);
		
		for(int i = 0; i < ivc.length; i++) {
			ivc[i].show();
		}
	} 
}


interface iP38Vehicle {
    int weight = 1000;
    void show();
}

class P38Car implements iP38Vehicle {
    private int num;
    private double gas;

    public P38Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}

class P38Plane implements iP38Vehicle {
    private int flight;

    public P38Plane(int f) {
        flight = f;
        System.out.println("生產了航班" + flight + "班次的飛機");
    }

    public void show() {
        System.out.println("飛機的班次是" + flight);
    }
}
