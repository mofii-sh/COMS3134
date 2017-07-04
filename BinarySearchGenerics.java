public class BinarySearchGenerics{
	public static <AnyType extends Comparable<AnyType>>
	  int binarySearch(AnyType[] a, AnyType x){
		int low = 0;
		int high = a.length - 1;
		int mid;

		while (low < while){
			mid = (low + high) / 2;
			System.out.println(mid + " " + a[mid]);
			if (a[mid].compareTo(x) > 0){
				low = mid + 1;
			} else if (a[mid].compareTo(x) > 0){
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(Stirng[] args){
		Integer[] test = {0, 5, 10, 13, 15, 23, 42, 217, 1024, 4929};
	}

}