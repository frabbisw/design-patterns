package river;

import java.awt.Color;

public class RiverBuilder 
{
	public static River getRiver(int x0, int y0, int x1, int y1, int x2, int y2, int x3, int y3)
	{
		int [][] points = new int [5][2];
		points[0][0]=x0;
		points[0][1]=y0;
		points[1][0]=x1;
		points[1][1]=y1;
		points[2][0]=x2;
		points[2][1]=y2;
		points[3][0]=x3;
		points[3][1]=y3;
		
		River river = new River();
		river.setColor(new Color(0x34, 0x98, 0xdb));
		
		int s=Math.abs(points[0][0]-points[1][0]);
		int h=Math.abs(points[0][1]-points[1][1]);
		
		if(points[1][0]-points[0][0]>=0 & points[1][1]-points[0][1]>=0)
			for(int i=points[0][0]; i<=points[1][0]; i++)
			{
				int dx=i-points[0][0];
				int dy=h-(int)(h*((double)(s-dx)/s)*((double)(s-dx)/s));
				
				river.addPoint(i, points[0][1]+dy);
			}
		
		s=Math.abs(points[2][0]-points[3][0]);
		h=Math.abs(points[2][1]-points[3][1]);
		
		if(points[2][0]-points[3][0]>=0 & points[2][1]-points[3][1]>=0)
		for(int i=points[2][0]; i>=points[3][0]; i--)
		{
			int dx=i-points[3][0];
			int dy=(int)(h*((double)dx/s)*((double)dx/s));
			
			river.addPoint(i, points[3][1]+dy);
		}
		
		return river;
	}
}