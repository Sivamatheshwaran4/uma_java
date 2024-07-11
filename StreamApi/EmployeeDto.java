package Java8Topics.StreamApi;


public class EmployeeDto {
	
		int id ;
		String name;
		String phoneNo;
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}

		public EmployeeDto (int id , String name , String phoneNo) {
			 id = this.id;
			 name = this.name;
			 phoneNo = this.phoneNo;
			
		}

		public EmployeeDto() {
			// TODO Auto-generated constructor stub
		}
	
}
