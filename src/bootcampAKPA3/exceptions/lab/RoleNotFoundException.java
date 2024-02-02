package bootcampAKPA3.exceptions.lab;

/**
 * Custom EXCEPTION per menaxhimin e roleve ne sistem
 */
public class RoleNotFoundException extends RuntimeException {

	public RoleNotFoundException(String message) {
		super(message);
	}
}
