package rickie;

public class HomeWork39 {
	
	public static void main(String[] args) {
		int i1 = 12;
		int i2 = 6;
		System.out.println("第一題");
		System.out.println("相加："+(i1+i2));
		System.out.println("相乘："+(i1*i2));
		System.out.println("========");
		int i3 = 200;
		int i4 = 12;
		System.out.println("第二題");
		System.out.println((i3/i4)+"打");
		System.out.println((i3%i4)+"顆");
		System.out.println("========");
		int t = 256559 , day = 60*60*24 , hour = 60*60 , sec = 60;
	    System.out.println("第三題");
	    System.out.println(t/day+"天"+t%day/hour+"小時"+t%day%hour/sec+"分"+t%sec+"秒");
	    System.out.println("========");
		final double Pi = 3.1415;
		int r = 5;
		System.out.println("第四題");
		System.out.println("圓周長："+(r*2)*3.1415);
		System.out.println("圓面積："+Pi*r*r);
		int x = 1_500_000;
		double y = 0.02;
		double z = x*(Math.pow(1+y, 10));
		System.out.println("第五題");
		System.out.println((int)z+"元");
		System.out.println("========");
		System.out.println("第六題");
		System.out.println(5 + 5);//數字相加，出來是int整數
		System.out.println(5 + '5');//單引號為char，'5'=53 下方
		System.out.println(5 + "5");//前面的5是整數，後面是字串，結果55屬於字串
		System.out.println("========");
		char b = '5';
		System.out.println((int)b);
		
	}
}
	   
