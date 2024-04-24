package esercizi7;

import java.util.Iterator;

public class StringaIterabile implements Iterable<Character>{
	
	String str;
	
	public StringaIterabile(String str) {
		this.str = new String(str);
	}

	@Override
	public Iterator<Character> iterator() {
		IteratoreStringa it = new IteratoreStringa(str);
		return it;
	}
	private class IteratoreStringa implements Iterator<Character>{

		String internalStr;
		int i = 0;
		
		public IteratoreStringa(String str) {
			internalStr = new String(str);
		}
		
		@Override
		public boolean hasNext() {
			//if(i < internalStr.length()-1) {
			return (i<internalStr.length());
		}

		@Override
		public Character next() {
			Character val = internalStr.charAt(i);
			i++;
			return val;
		}
		
	}

}
