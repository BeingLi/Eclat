package Control;

import algorithm.Eclat;

public class ExecuteEclat {
	public static String fileSrcWrite="D:/Result1.txt";
	public static String fileSrcRead="./Data1.txt";
	public static String SPLIT = ";";
	public static int minSuport = 2;
	

	public static void main(String[] args) {
		long begin=System.currentTimeMillis();

		Eclat eclat = new Eclat(fileSrcRead, SPLIT, minSuport);
		eclat.mainFlow_C(fileSrcWrite);
		long end=System.currentTimeMillis();
		
		double time=(double)(end-begin)/1000;
		eclat.writeResult2File("执行Eclat算法共耗时"+time+"秒", fileSrcWrite);
		System.out.println("执行Eclat算法共耗时"+time+"秒");
	}

}
