/**
ѡ�������㷨
ÿһ�˴Ӵ����������Ԫ����ѡ����С������󣩵�һ��Ԫ�أ�˳��������ź�������е����ֱ��ȫ�������������Ԫ�����ꡣ ѡ�������ǲ��ȶ������򷽷���
*/

import java.util.Scanner;
import java.util.Arrays;
public class Test{
	public static void main(String[] args){
		
		int[] numbers = {34,4,56,17,90,65};
		int minIndex = 0;// �趨��Сֵ�±�
		// ��С��������
		// ��ѭ������������6�����Ƚ�5��
		for(int i=0;i<numbers.length-1;i++){
			minIndex = i;
			for(int j=i+1;j<numbers.length;j++){
				if(numbers[j]<numbers[minIndex]){
					minIndex = j;// ��¼��Сֵ�±�			
				}
			}
			// �趨����Сֵ�ұ߻��б�����С����������
			if(minIndex != i){
				numbers[i] = numbers[i]+numbers[minIndex];
				numbers[minIndex] = numbers[i]-numbers[minIndex];
				numbers[i] = numbers[i]-numbers[minIndex];
			}
		}
		// ��ӡ���
		System.out.println("��С��������"+Arrays.toString(numbers));
	
	}
	
}

/**
34 4 56 17 90 65

4 34 56 17 90 65  ��1�֣��Ƚ�5�Σ�ȷ������Сֵ4
4 17 56 34 90 65  ��2�֣��Ƚ�4�Σ�ȷ�������ֵ17
4 17 34 56 90 65  ��3�֣��Ƚ�3�Σ�ȷ�������ֵ34
4 17 34 56 90 65  ��4�֣��Ƚ�2�Σ�ȷ�������ֵ56
4 17 34 56 65 90  ��5�֣��Ƚ�1�Σ�ȷ�������ֵ90
*/

