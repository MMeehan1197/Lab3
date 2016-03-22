package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Table {

	private UUID TableID;
	private ArrayList<Player> TablePlayers;
	
	private void setTablePlayers(ArrayList<Player> TablePlayers) {
		this.TablePlayers = TablePlayers;
	}

	public Table(UUID tableID) {
		super();
		TableID = tableID;
	}

	public UUID getTableID() {
		return TableID;
	}

	public void setTableID(UUID tableID) {
		TableID = tableID;
	}

	public void AddPlayerToTable(Player p) {
		TablePlayers.add(p);
	}
	
	public void RemovePlayerFromTable(Player p){
		TablePlayers.remove(p);
	}
}
