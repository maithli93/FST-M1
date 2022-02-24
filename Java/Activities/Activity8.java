package activities;

class CustomException extends Exception {
	private String message = null;

	public CustomException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public class Activity8 {

		public static void main(String[] args) {
			try {
				Activity8.exceptionTest("Will print to console");
				Activity8.exceptionTest(null);
				Activity8.exceptionTest("will not execute");

			}

			catch (CustomException mae) {

				System.out.println("Inside catch block: " + mae.getMessage());

			}
		}
		

		public static void exceptionTest(String msg) throws CustomException {
			if (msg == null) {
				throw new CustomException("String value is null");
			} else {
				System.out.println(msg);
			}
		}
	}

}

