package array;

import java.util.Arrays;
import java.util.Collections;

public class sorting2_collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] num_arr = {5, 2, 8, 1, 9};
		Arrays.sort(num_arr);
		System.out.println(Arrays.toString(num_arr));
		Arrays.sort(num_arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(num_arr));
	}

}
