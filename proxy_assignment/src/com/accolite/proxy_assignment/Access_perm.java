package com.accolite.proxy_assignment;

public interface Access_perm {

	void grant_access();
	void deny_access();
}

class Access_permissions implements Access_perm{

	public static int i= 0;
	int j;
	@Override
	public void grant_access() {
		
		System.out.println("User " + j+ ":Access granted. Welcome Admin." );
	}
	
	private boolean isAdmin;
	
	public Access_permissions(String type,String password) {
		i++;
		j = i;
		if(type.equals("admin") && password.equals("admin_grant@123")) {
			isAdmin = true;
		}
		
		else isAdmin = false;
	}
	
	void check_authorization() {
		
		if(this.isAdmin) {
			
			grant_access();
		}
		
		else deny_access();
		
		
	}

	@Override
	public void deny_access() {
		
		System.out.println("User " + j+ ":Access denied. User unauthorized. Only Admins are authorized.");
		
	}
	
}


class Access{
	
	public static void main(String[] args) {
		
		Access_permissions user1 = new Access_permissions("user","1234asdf");
		Access_permissions user2 = new Access_permissions("admin","1234grtf");
		Access_permissions user3 = new Access_permissions("admin","admin_grant@123");
		user1.check_authorization();
		user2.check_authorization();
		user3.check_authorization();
	}
	
}
