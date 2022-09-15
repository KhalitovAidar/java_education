class TfTable {
	public static void main(String[] args){
		System.out.println("Table for AND(&)");
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("| true | false | true | false |");
		System.out.println("-------------------------------");
		System.out.println("| true | true  | false| false |");
		System.out.println("-------------------------------");
		System.out.println("|" + " " + (true & true) + " " + "|" +
			" " + (true & false) + " " + "|" + " " + (true & false) +
			"|" + " " + (false & false) + " " + "|");
		System.out.println("-------------------------------");
		// Конец таблицы для логического оператора И
		System.out.println("");
		System.out.println("__________________________________________________");
		System.out.println("");
		System.out.println("Table for OR(|)");
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("| true | false | true | false |");
		System.out.println("-------------------------------");
		System.out.println("| true | true  | false| false |");
		System.out.println("-------------------------------");
		System.out.println("|" + " " + (true | true) + " " + "|" +
			" " + (true | false) + "  " + "|" + " " + (true | false) + " " +
			"|" + " " + (false | false) + " " + "|");
		System.out.println("-------------------------------");
		// Конец таблицы для логического оператора ИЛИ
		System.out.println("");
		System.out.println("__________________________________________________");
		System.out.println("");
		System.out.println("Table for XOR(^)");
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("| true | false | true | false |");
		System.out.println("-------------------------------");
		System.out.println("| true | true  | false| false |");
		System.out.println("-------------------------------");
		System.out.println("|" + " " + (true ^ true) + "|" +
			" " + (true ^ false) + "  " + "|" + " " + (true ^ false) + " " +
			"|" + " " + (false ^ false) + " " + "|");
		System.out.println("-------------------------------");
		// Конец таблицы для логического оператора XOR
		System.out.println("");
		System.out.println("__________________________________________________");
		System.out.println("");
		System.out.println("Table for NOT(!)");
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("|     true      |    false    |");
		System.out.println("-------------------------------");
		System.out.println("|" + "     " + (!true) + "     " + "|" + "    " + 
			(!false) + "     " + "|");
		System.out.println("-------------------------------");
		// Конец таблицы для логического оператора XOR
		System.out.println("");
		System.out.println("__________________________________________________");
	}
}