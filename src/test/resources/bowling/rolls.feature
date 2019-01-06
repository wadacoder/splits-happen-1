Feature: Roll tests
	In a bowling game, tests the score of the game given a certain roll sequence
	
Scenario: All strikes
	Given All the rolls for a game are completed
	When When the roll sequence is "XXXXXXXXXXXX"
	Then the score shall be 300
	
Scenario: All rolls are 9s and misses
	Given All the rolls for a game are completed
	When When the roll sequence is "9-9-9-9-9-9-9-9-9-9-"
	Then the score shall be 90