package main.model;

public class Deposit extends Operation {
	
		private String source;
		
		public Deposit(float montant, String source) {
			
			super(montant);
			this.source = source;
		}

		public String getSource() {
			return source;
		}
}
