package Dnd;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Npc {
	List<String>  talk();
	void callForHelp();
	Map<String,Integer>inventory  = new HashMap<String,Integer>();
	
}
