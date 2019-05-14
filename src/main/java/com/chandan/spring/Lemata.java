package com.chandan.spring;

import org.springframework.stereotype.Component;

@Component
public class Lemata {

	private String inputStr;
	private String inputStrPos;
	private String outputStr;

	public String getInputStr() {
		return inputStr;
	}

	public void setInputStr(String inputStr) {
		this.inputStr = inputStr;
	}

	public String getInputStrPos() {
		return inputStrPos;
	}

	public void setInputStrPos(String inputStrPos) {
		this.inputStrPos = inputStrPos;
	}

	public String getOutputStr() {
		return outputStr;
	}

	public void setOutputStr(String outputStr) {
		this.outputStr = outputStr;
	}

}
