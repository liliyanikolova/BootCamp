package io;

import io.interfaces.OutputWriter;

public class ConsoleWriter implements OutputWriter {

	@Override
	public void writeLine(String output) {
		
		System.out.println(output);
		
	}

	@Override
	public void writeLine(String format, String output) {
		
		System.out.println(String.format(format, output));
		
	}

}
