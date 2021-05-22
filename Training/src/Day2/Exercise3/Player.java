package Day2.Exercise3;

public class Player implements Comparable<Player> {
	
	private String name;
	private int age;
	private String game;

	public Player(String name, int age, String game) {
		super();
		this.name = name;
		this.age = age;
		this.game = game;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGame() {
		return game;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", game=" + game + "]";
	}

	
	@Override 
	public int compareTo(Player p) {
		
		if(name.equals(p.getName()))
			return 0;
		else if(game.equals(p.getGame())) {
			return age-p.getAge();
		}
		else 
			return game.compareTo(p.getGame());
		
	}

	
	


}
