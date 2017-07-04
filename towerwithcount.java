public class towerwithcount{
	
	public static void tower(char from, char to, char spare, int disk){
		if (disk>0){
			tower(from, spare, to, disk-1);
			count ++;
			System.out.println("");
		}
	}

}