package command;

public class MoveRight implements Move{

	@Override
	public boolean execute(Ball b) {
		// TODO Auto-generated method stub
		return b.moveRight();
	}

	@Override
	public boolean abandon(Ball b) {
		// TODO Auto-generated method stub
		return b.moveLeft();
	}

}
