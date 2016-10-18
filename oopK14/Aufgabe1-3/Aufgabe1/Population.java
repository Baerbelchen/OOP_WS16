public Interface Population{
	
	int numberOfGroups = Math.random() * 100;
	Strategy s = new Strategy();
	
	//Anzahl der Gruppen mit unterschiedlichen Strategie-Kombinationen innerhalb der Population,
	public Population(){
		this.numberOfGroups;
		//s.getStrategy(); not sure about this 
	}
	
}