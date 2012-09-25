package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = if(c<0 || r<0 || c>r) 0 else if(c<1 || r<=1) 1 else pascal(c-1, r-1) + pascal(c, r-1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
  
	  def isBalanced(leftBrackets: Int, rightBrackets: Int, character: Char, restOfCharacters: List[Char]): Boolean = {

		  def newLeftBrackets(): Int = if(character.equals('(')) leftBrackets + 1 else leftBrackets
	
		  def newRightBrackets(): Int = if(character.equals(')')) rightBrackets + 1 else rightBrackets
		
		  def balanced(): Boolean = 
		    (leftBrackets == rightBrackets && !character.equals('(') && !character.equals(')')) || (leftBrackets == rightBrackets + 1 && character.equals(')'))

	      if(restOfCharacters.isEmpty) balanced() 
	      else isBalanced(newLeftBrackets(), newRightBrackets(), restOfCharacters.head, restOfCharacters.tail)
	  }
	      	
	  if(chars.isEmpty) true else isBalanced(0, 0, chars.head, chars.tail)
  }
  
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = if(money==0 || coins.isEmpty) 0 else 1

}