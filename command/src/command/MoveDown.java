package command;

public class MoveDown implements Move{

	@Override
	public boolean execute(Ball b) {
		// TODO Auto-generated method stub
		return	b.moveDown();
	}

	@Override
	public boolean abandon(Ball b) {
		return b.moveUp();
	}
}
