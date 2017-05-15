package chess;
class King extends Piece
{
 King(String colour)
  {
	  colorpiece = colour;
	  status = 0;
  }  
  
  boolean validMoveOfPiece(int xi,int yi,int xf,int yf)
  {
	  // check whether move is valid or not
	  if(Math.abs(xi-xf)==1 && Math.abs(yi-yf)==1)
	  {
		  return true;
	  }
	  
	  else if(Math.abs(xi-xf)==1 && Math.abs(yi-yf)==0)
	  {
		  return true;
	  }
	  
	  else if(Math.abs(xi-xf)==0 && Math.abs(yi-yf)==1)
	  {
		  return true;
	  }
	  
	  else
	  {
		  return false;
	  }
  }
}