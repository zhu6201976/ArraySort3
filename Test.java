/**
选择排序算法
每一趟从待排序的数据元素中选出最小（或最大）的一个元素，顺序放在已排好序的数列的最后，直到全部待排序的数据元素排完。 选择排序是不稳定的排序方法。
*/

import java.util.Scanner;
import java.util.Arrays;
public class Test{
	public static void main(String[] args){
		
		int[] numbers = {34,4,56,17,90,65};
		int minIndex = 0;// 设定最小值下标
		// 从小到大排序
		// 外循环控制轮数，6个数比较5轮
		for(int i=0;i<numbers.length-1;i++){
			minIndex = i;
			for(int j=i+1;j<numbers.length;j++){
				if(numbers[j]<numbers[minIndex]){
					minIndex = j;// 记录最小值下标			
				}
			}
			// 设定的最小值右边还有比它还小的数，交换
			if(minIndex != i){
				numbers[i] = numbers[i]+numbers[minIndex];
				numbers[minIndex] = numbers[i]-numbers[minIndex];
				numbers[i] = numbers[i]-numbers[minIndex];
			}
		}
		// 打印结果
		System.out.println("从小到大排序："+Arrays.toString(numbers));
	
	}
	
}

/**
34 4 56 17 90 65

4 34 56 17 90 65  第1轮，比较5次，确定了最小值4
4 17 56 34 90 65  第2轮，比较4次，确定了最大值17
4 17 34 56 90 65  第3轮，比较3次，确定了最大值34
4 17 34 56 90 65  第4轮，比较2次，确定了最大值56
4 17 34 56 65 90  第5轮，比较1次，确定了最大值90
*/

