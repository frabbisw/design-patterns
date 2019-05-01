package command;

public interface Move {
	public boolean execute(Ball b);
	public boolean abandon(Ball b);
}
