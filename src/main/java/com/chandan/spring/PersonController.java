package com.chandan.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chandan.biolemmatizer.BioLemmatizer;

import edu.ucdenver.ccp.nlp.biolemmatizer.BioLemmatizerCmdOpts;

@RestController
public class PersonController {

	@Autowired
	private Person person;
	
	@Autowired
	private Lemata lemata;
	
	@RequestMapping("/")
	public String healthCheck() {
		return "OK";
	}
	
	@RequestMapping("/person/get")
	public Person getPerson(@RequestParam(name="name", required=false, defaultValue="Unknown") String name) {
		person.setName(name);
		return person;
	}
	
	
	@RequestMapping(value="/person/update", method=RequestMethod.POST, consumes = "application/json")
	public Person updatePerson(@RequestBody Person p) {
		person.setName(p.getName());
		return person;
	}
	
	//BioLemmatizerCmdOpts options = new BioLemmatizerCmdOpts();
	@RequestMapping("/bio/lemmatizer")
	public Lemata getBioLemmatizer(@RequestParam(name="inputStr", required=false, defaultValue="Unknown") String inputStr, @RequestParam(name="inputStrPos", required=false, defaultValue="Unknown") String inputStrPos) {
		BioLemmatizer bioLemmatizer = new BioLemmatizer();
		String output = bioLemmatizer.getPrecessedData(inputStr, inputStrPos);
		lemata.setOutputStr(output);
		lemata.setInputStr(inputStr);
		lemata.setInputStrPos(inputStrPos);
		return lemata;
	}
}
