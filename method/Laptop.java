class Laptop {
	public static void main(String []args) {
		printModel();
		printModel(20);

}
	static void printModel() {
		System.out.println("Easy to carry");
		System.out.println("store information");
		System.out.println("game");
}
             static void printModel(int Model) {
		System.out.println( Model + " Easy to carry");
		System.out.println( Model + " store information");
		System.out.println( Model + " game");
}
}
