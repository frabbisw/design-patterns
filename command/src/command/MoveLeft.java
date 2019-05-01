package command;

public class MoveLeft implements Move{

	@Override
	public boolean execute(Ball b) {
		// TODO Auto-generated method stub
		return b.moveLeft();
	}

	@Override
	public boolean abandon(Ball b) {
		// TODO Auto-generated method stub
		return b.moveRight();
	}

}
