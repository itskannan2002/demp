Feature: add to cart  

Scenario Outline: user add the product to cart

Given user opening the website 
When login with "<username>" and "<password>"
And search the "<product>"  in search page  and add to cart
Then  check the product is added 

Examples:
			|username|password |product        |
			|me      |Pass1234 |The Hate U Give|
			|me      |Pass1234  |The Help       |