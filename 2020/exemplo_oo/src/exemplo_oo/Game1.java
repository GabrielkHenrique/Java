package exemplo_oo;

public class Game1 {
	private Player player;
	private Inimigo inimigo;
	
	

	public Game1() {
		player = new Player();
		inimigo = new Inimigo();
	}
	
	public Player getPlayer() {
		return player;
	}
	public Inimigo getInimigo() {
	return inimigo;
	}
	
public static void main (String[] args) {
	Game1 game = new Game1();
	Player player = game.getPlayer();
	player.atacarInimigo(game.getInimigo());
	System.out.println(game.getInimigo().life);
}
}

