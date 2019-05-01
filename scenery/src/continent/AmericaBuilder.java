package continent;

import house.House;
import house.HouseBuilder;
import river.River;
import river.RiverBuilder;
import tree.Tree;
import tree.TreeBuilder;

public class AmericaBuilder extends ContinentBuilder
{
	@Override
	public House getHouse(int x0, int y0, int width, int height) {
		// TODO Auto-generated method stub
		return HouseBuilder.getAmericanHouse(x0, y0, width, height);
	}

	@Override
	public Tree getTree(int x0, int y0, int width, int height) {
		// TODO Auto-generated method stub
		return TreeBuilder.getAmericanTree(x0, y0, width, height);
	}

	@Override
	public River getRiver(int x0, int y0, int x1, int y1, int x2, int y2, int x3, int y3) {
		// TODO Auto-generated method stub
		return RiverBuilder.getRiver(x0, y0, x1, y1, x2, y2, x3, y3);
	}
}
