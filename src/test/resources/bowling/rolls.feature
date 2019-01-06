Feature: Roll tests
	In a bowling game, the score of the game for a given a certain roll sequence match
	
Scenario: All strikes
	Given All the rolls for a game are completed
	When When the roll sequence is "XXXXXXXXXXXX"
	Then the score shall be 300
	
Scenario: All rolls are 9s and misses
	Given All the rolls for a game are completed
	When When the roll sequence is "9-9-9-9-9-9-9-9-9-9-"
	Then the score shall be 90

Scenario: All rolls are 5s and spares
	Given All the rolls for a game are completed
	When When the roll sequence is "5/5/5/5/5/5/5/5/5/5/5"
	Then the score shall be 150

Scenario: A random sequence of rolls
	Given All the rolls for a game are completed
	When When the roll sequence is "X7/9-X-88/-6XXX81"
	Then the score shall be 167