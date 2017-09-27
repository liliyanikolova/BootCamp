package core;

import core.interfaces.Engine;
import io.ConsoleReader;
import io.ConsoleWriter;
import io.interfaces.InputReader;
import io.interfaces.OutputWriter;
import utils.Messages;

public class EngineImpl implements Engine{
	
	private InputReader inputReader;
	
	private OutputWriter outputWriter;
	
	private boolean isRunning;
	
	public EngineImpl() {
		this.inputReader = new ConsoleReader();
		this.outputWriter = new ConsoleWriter();
	}

	@Override
	public void run() {
		
		this.isRunning = true;
		
		this.outputWriter.writeLine(Messages.WELCOME_MESSAGE);
		this.outputWriter.writeLine(Messages.MAIN_MENU_OPTIONS);
		
		while(this.isRunning) {
			
			String input = this.inputReader.readLine();
			
			this.processInput(input);
			
		}
		
	}
	
	private void processInput(String input) {
		
		if("0".equals(input)) {
			this.isRunning = false;
			this.outputWriter.writeLine(Messages.GOODBYE_MESSAGE);
			return;
		}
		
		
	}

}
