package corebasic;

import java.util.Arrays;

public class ArrayCopyInto {
	public static void main(String[]args) {
		int[]a= {1,2,3,4,5,6,7,8,9,10};
		int[]b=new int[5];
		System.arraycopy(a, 3, b, 0, 5);
		System.out.println(Arrays.toString(b));
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
				
			}
		}
	}


