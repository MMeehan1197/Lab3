package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Game {
	private UUID GameID;
	private UUID TableID;
	private ArrayList<Table> Tables = new ArrayList<Table>();

	private void setGamePlayers(ArrayList<Player> GamePlayers) {
		GamePlayers = GamePlayers;
	}

	public UUID getGameID() {
		return GameID;
	}

	public void setGameID(UUID gameID) {
		GameID = gameID;
	}

	public UUID getTableID() {
		return TableID;
	}

	public void setTableID(UUID tableID) {
		TableID = tableID;
	}

	public Game(UUID gameID, UUID tableID) {
		super();
		GameID = gameID;
		TableID = tableID;
	}

	public void AddPlayerToGame(Table t, Player p) {
		Tables.add(t);
		t.AddPlayerToTable(p);
	}

}
