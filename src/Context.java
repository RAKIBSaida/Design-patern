public class Context {
	private IStrategy strategy;
	public Context() {
		this.strategy=new DefaultStrategyImpl();
	}
	
	public void process() {
			strategy.applyStrategy();
	}
	public void setStrategy(IStrategy strategy) {
		this.strategy=strategy;
	}
}
