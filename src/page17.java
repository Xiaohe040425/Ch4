public class page17 {
	public static void main(String[] args) {
		P17Car[] cars = new P17Car[2];

        cars[0] = new P17Car();
        cars[0].setCar(1234, 20.5);

        cars[1] = new P17RcCar();
        cars[1].setCar(4567, 30.5);

        for (int i = 0; i < cars.length; i++) {
            cars[i].show();
        }
	} 
}


class P17Car {
	protected int num;
    protected double gas;

    public P17Car() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為 " + num + "，汽油量設為 " + gas);
    }

    public void show() {
        System.out.println("車號是 " + num);
        System.out.println("汽油量是 " + gas);
    }
}

class P17RcCar extends P17Car {
    private int course;

    public P17RcCar() {
        course = 0;
        System.out.println("生產了賽車");
    }
    

    public void setCourse(int c) {
        course = c;
        System.out.println("將賽車編號設為 " + course);
    }
    
    public void show() {
        System.out.println("賽車車號是 " + num);
        System.out.println("汽油量是 " + gas);
        System.out.println("賽車編號是 " + course);
    }
}	
