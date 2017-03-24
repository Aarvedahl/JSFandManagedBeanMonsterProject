package monster;

import java.util.ArrayList;

import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.sun.corba.se.impl.javax.rmi.CORBA.Util;

@Named
@RequestScoped
public class AllMonsters {
	Monster monster = new Monster();
	
	
	ArrayList<Monster> monsterList = new ArrayList<>();
	
	public AllMonsters(){
		monsterList.add(new Monster("Bob", "yellow", 10, 1));
		monsterList.add(new Monster("Kevin", "yellow", 2, 2));
		monsterList.add(new Monster("Benny", "yellow", 5, 2));
		monsterList.add(new Monster("Kevin", "yellow", 3, 3));

	}
	

	public ArrayList<Monster> getMonsterList() {
		return monsterList;
	}
	
	public Monster getMonsters(int id) {
		return monsterList.get(id);
	}
	
	public Monster getMonster() {
		return monster;
	}
	public void addMonster(){
		monsterList.add(monster);
		monster = new Monster();
		
	}
	
	
	
	public void deleteMonster(Monster monster){
		monsterList.remove(monster);
	}
	
}
