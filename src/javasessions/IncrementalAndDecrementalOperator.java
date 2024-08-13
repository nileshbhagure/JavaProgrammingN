package javasessions;

public class IncrementalAndDecrementalOperator {

	public static void main(String[] args) {
		// 1. Post increment:
		// ++ increment value by 1
		// first give original value & later increased the value later
		int m = 1;
		int n = m++;
		System.out.println(m);// 2
		System.out.println(n);// 1

		int p = -89;
		int q = p++;
		System.out.println(p); // -88
		System.out.println(q); // -89

		int t = 0;
		int r = t++;
		System.out.println(t);// 1
		System.out.println(r);// 0

		int k = -999;
		int g = k++;
		System.out.println(k);// -998
		System.out.println(g);// -999

		// system will take total value
		int total = 1;
		System.out.println(total++);// 1
		// total got increased by 1
		System.out.println(total);// 2

		// 2. Pre Increment
		// increase the value first
		int b = 1;
		int v = ++b;
		// first increase value of b & then give increase value to v
		System.out.println(b);// 2
		System.out.println(v); // 2

		int tt = -89;
		int rr = ++tt;
		System.out.println(tt);// -88
		System.out.println(rr);// -88

		int pop = 100;
		System.out.println(++pop);// 101
		System.out.println(pop);// 101

		// 3 Post decrement
		int d = 2;
		int f = d--;
		// first give original value to f & then decrement value by 1
		System.out.println(d);// 1
		System.out.println(f);// 2

		int y1 = 99;
		int z1 = y1--;
		System.out.println(y1); // 98
		System.out.println(z1); // 99

		int y = -99;
		int z = y--;
		System.out.println(y); // -100
		System.out.println(z); // -99
		
		int food=-89;
		System.out.println(food--); //-89
		System.out.println(food);  //-90
		
		//4 pre decrement
		int e=2;
		int u=--e;
		System.out.println(e); //1
		System.out.println(u); //1
		
		int test=-989;
		int testing=--test;
		System.out.println(test);//-990
		System.out.println(testing);//-990
		
		int google=-1000;
		System.out.println(--google); //-1001
		System.out.println(google);  //-1001
		System.out.println(google++); //-1001
		System.out.println(google ); //-1000  original value 
		
		int bal1=500;
		int totalbal1= ++bal1 + 10; 
		System.out.println(totalbal1);// //501+10==511
		System.out.println(bal1); //501
		System.out.println(totalbal1); //511
		
		int bal=-500;
		int totalbal=bal+++10; 
		System.out.println(totalbal);// //-490
		
        int le=2;
        int re=le++ +le++ - le++;
        System.out.println(re);//1
        System.out.println(le);//5
		
	}

}
