package problem0011;

import java.awt.Point;

public enum Direction
{
	  HORIZONTAL			(new Point(1, 0))
	, DIAGONAL_DOWN_RIGHT	(new Point(1, 1))
	, VERTICAL				(new Point(0, 1))
	, DIAGONAL_DOWN_LEFT	(new Point(-1, 1));
	
	final Point value;
	
	Direction(Point value)
	{
		this.value = value;
	}
	
	public Point asPoint()
	{
		return value;
	}
	
	public int getX()
	{
		return value.x;
	}
	
	public int getY()
	{
		return value.y;
	}
}
