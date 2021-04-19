package movies;

public class Login {

	public static void main(String[] args) {
		
	}
	
	public static boolean checkMobileNo(Long Mob_no , int length_Mob) {
		boolean check=true;
		String mob = Long.toString(Mob_no);
		if(mob.length()==length_Mob){
			check=true;
		}
		else if((length_Mob<=10)  || (length_Mob>=1)) {
			check=false;
		}
		return check;

		
	}
	public static boolean checkPassword(String pwd, int length_pwd) {
		boolean check=true;
		if(pwd.length()>=length_pwd) {
			check=true;
		}
		else if(pwd.length()<length_pwd || pwd.equals("")){
			check=false;
		}
		return check;
		
	}

}
