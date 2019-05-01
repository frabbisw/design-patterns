package command;

public class MoveUp implements Move{

	@Override
	public boolean execute(Ball b) {
		// TODO Auto-generated method stub
		return b.moveUp();
	}

	@Override
	public boolean abandon(Ball b) {
		// TODO Auto-generated method stub
		return b.moveDown();
	}
}