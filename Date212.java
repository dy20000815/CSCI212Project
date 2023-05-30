
public class Date212 {
	private String Date;
	   
	   public String getDate() {
		return Date;
	}//getter

	public void setDate(String date) {
			Date = date;
	}//setter

	//display correctly
	public String toString() {
	      if(Date.charAt(4)=='0') {
	    	  if(Date.charAt(5)=='1') {
	    		  Date="January"+Date.charAt(6)+Date.charAt(7)+","+Date.charAt(0)+Date.charAt(1)+Date.charAt(2)+Date.charAt(3);
	    	  }
	    	  if(Date.charAt(5)=='2') {
	    		  Date="February"+Date.charAt(6)+Date.charAt(7)+","+Date.charAt(0)+Date.charAt(1)+Date.charAt(2)+Date.charAt(3);
	    	  }
	    	  if(Date.charAt(5)=='3') {
	    		  Date="March"+Date.charAt(6)+Date.charAt(7)+","+Date.charAt(0)+Date.charAt(1)+Date.charAt(2)+Date.charAt(3);
	    	  }
	    	  if(Date.charAt(5)=='4') {
	    		 Date="April"+Date.charAt(6)+Date.charAt(7)+","+Date.charAt(0)+Date.charAt(1)+Date.charAt(2)+Date.charAt(3);
	    	  }
	    	  if(Date.charAt(5)=='5') {
	    		  Date="May"+Date.charAt(6)+Date.charAt(7)+","+Date.charAt(0)+Date.charAt(1)+Date.charAt(2)+Date.charAt(3);
	    	  }
	    	  if(Date.charAt(5)=='6') {
	    		  Date="June"+Date.charAt(6)+Date.charAt(7)+","+Date.charAt(0)+Date.charAt(1)+Date.charAt(2)+Date.charAt(3);
	    	  }
	    	  if(Date.charAt(5)=='7') {
	    		  Date="July"+Date.charAt(6)+Date.charAt(7)+","+Date.charAt(0)+Date.charAt(1)+Date.charAt(2)+Date.charAt(3);
	    	  }
	    	  if(Date.charAt(5)=='8') {
	    		  Date="August"+Date.charAt(6)+Date.charAt(7)+","+Date.charAt(0)+Date.charAt(1)+Date.charAt(2)+Date.charAt(3);
	    	  }
	    	  if(Date.charAt(5)=='9') {
	    		  Date="September"+Date.charAt(6)+Date.charAt(7)+","+Date.charAt(0)+Date.charAt(1)+Date.charAt(2)+Date.charAt(3);
	    	  }
	    	 
	      }
	      if(Date.charAt(4)=='1') {
	    	  if(Date.charAt(5)=='0') {
	    		  Date="October"+Date.charAt(6)+Date.charAt(7)+","+Date.charAt(0)+Date.charAt(1)+Date.charAt(2)+Date.charAt(3);
	    	  }
	      
	    	  if(Date.charAt(5)=='1') {
	    		  Date="November"+Date.charAt(6)+Date.charAt(7)+","+Date.charAt(0)+Date.charAt(1)+Date.charAt(2)+Date.charAt(3);
	    	  }
	    	  if(Date.charAt(5)=='2') {
	    		  Date="December"+Date.charAt(6)+Date.charAt(7)+","+Date.charAt(0)+Date.charAt(1)+Date.charAt(2)+Date.charAt(3);
	    	  }
	      }
		return Date;
		
	   }
	   
	
		public int toInt() {
			return Integer.valueOf(Date);
		}
		
		
	   public boolean equals(Date212 other) {
	      return Integer.valueOf(Date)== (other.toInt());
	   }
	   
	   public Date212 compareTo(Date212 other) {
		   if(Integer.valueOf(Date)>=other.toInt()) {
			   return this;
		   }else return other;
	   }
	  
}

