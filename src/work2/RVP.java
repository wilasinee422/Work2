package work2;

public class RVP {
		private String name;
		private String position;
		private String friend[];

		public RVP() {
			name = "RVP";
			position = "vanguard";
			friend = new String[] { "Rooney", "Gigg"
					+ "welbeck", "wilson", "Nani" };
			System.out.println("Constructor RVP");
		}

		public String getName() {
			return name;
		}

		public String getPosition() {
			return position;
		}

		public String[] getFriend() {
			return friend;
		}
	}

