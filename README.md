This repository includes two classes: the NumberFactsAPI, and a NumberFactsTester.

NumberFactsAPI contains an overloaded getNumberFact method.

	getNumberFact() generates a random number 0-100 and outputs a fact about that number and the JSON object for that fact.
	getNumberFact(int _num) outputs a fact about an inputted number and the JSON object for that fact.

NumberFactsTester contains a simple prompt for a number, receives the number, and calls getNumberFact with that number, as well as another getNumberFact with a random number.

