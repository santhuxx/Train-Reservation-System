package train;

public class train {
	
		private int tid;
		private String tname;
	    private String ttype;
	    private String tcount;
	    private String tdetails;
	    
	    
	    public train(int tid, String tname, String ttype, String tcount, String tdetails) {
			super();
			this.tid = tid;
			this.tname = tname;
			this.ttype = ttype;
			this.tcount = tcount;
			this.tdetails = tdetails;
			
		}


		public int gettid() {
			return tid;
		}


		public String gettname() {
			return tname;
		}


		public String getttype() {
			return ttype;
		}


		public String gettcount() {
			return tcount;
		}


		public String gettdetails() {
			return tdetails;
		}
		
		
	

}
