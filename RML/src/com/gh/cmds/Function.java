package com.gh.cmds;

import java.util.ArrayList;

import com.gh.main.Command;
import com.gh.main.Script;

public class Function extends Command {
	Script script;
	public ArrayList<Command> cmds = new ArrayList<Command>();
	public String name;

	public Function(Script script, String name) {
		this.script = script;
	
		this.name = name;
		
	}

	public void execute() {
		for (int i = 0; i < cmds.size(); i++) {
			cmds.get(i).execute();
		}

	}

}
