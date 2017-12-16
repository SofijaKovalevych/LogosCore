package nestedClasses;

import java.util.Arrays;

public class Collection {

	private static Object[] arr;

	public Object[] getArr() {
		return arr;
	}

	public Collection() {
	}

	public void setArr(Object[] arr) {
		Collection.arr = arr;
	}

	public Collection(Object[] arr) {
		Collection.arr = arr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(arr);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if (!Arrays.equals(arr, Collection.arr))
			return false;
		return true;
	}

	class First implements Iterator {

		@Override
		public void hasNext() {
			for (Object object : arr) {
				System.out.println(object);
			}
		}

		@Override
		public void Next() {
			for (int i = 0; i < arr.length; i++) {
				if ((i % 2) == 0) {
					arr[i] = 0;
				}
				System.out.println(arr[i]);
			}
		}
	}

	class Second implements Iterator {

		@Override
		public void hasNext() {
			for (Object object : arr) {
				System.out.println(object);
			}
		}

		@Override
		public void Next() {
			for (int i = arr.length; i > 0; i--) {
				i--;
				System.out.println(arr[i]);
			}

		}

		public class local {
			{
				for (Object object : arr) {
					System.out.println(object);
					for (int i = 0; i < arr.length; i++) {
						if ((i % 5) == 0) {
							arr[i] = i - 100;
						}
						System.out.println(arr[i]);

					}
				}
			}
		}
	}

	public static class oneOfTwo {
		{
			for (Object object : arr) {
				System.out.println(object);
				for (int i = 0; i < arr.length; i++) {
					if ((i % 2) == 0) {
						arr[i] = i + 1;
					}
					System.out.println(arr[i]);
				}
			}
		}
	}
}
