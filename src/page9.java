public class page9 {
	public static void main(String[] args) {
		P9RcCar rccar1 = new P9RcCar();
		
		rccar1.newShow();
	} 
}


class P9Car {
    protected int num;
    protected double gas;

    public P9Car() {
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

class P9RcCar extends P9Car {
    private int course;

    public P9RcCar() {
        course = 0;
        System.out.println("生產了賽車");
    }
    

    public void setCourse(int c) {
        course = c;
        System.out.println("將賽車編號設為 " + course);
    }
    
    public void newShow() {
        System.out.println("賽車車號是 " + num);
        System.out.println("汽油量是 " + gas);
        System.out.println("賽車編號是 " + course);
    }
}
