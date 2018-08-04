
public class EventImpl implements Event {

	@Override
	public void doSomething() {
		System.out.println(" First Event implementation");
	}

	static class InnerEventImpl implements Event {

		@Override
		public void doSomething() {
			System.out.println("\n Second Event Implementation");
		}

	}

	public void doingSomething() {
		class innerMostImpl implements Event {

			@Override
			public void doSomething() {
				System.out.println("\n Third Event Implementation");

			}

		}
		;
		new innerMostImpl().doSomething();
	}

	public void doingSomethingagain()
	{
		Event e=new Event() {
			@Override
			public void doSomething() {
				System.out.println("\n Fourth Event Implementation");
			}		
	};
		e.doSomething();
	}
	
	public void doingSomethingOneLastTime()
	{
		Event e= () ->System.out.println("\n Fifth Event Implememtation");
	e.doSomething();
	}
	public static void main(String[] args) {
		EventImpl impl = new EventImpl();
		impl.doSomething();
		InnerEventImpl innerimpl = new EventImpl.InnerEventImpl();
		innerimpl.doSomething();
		impl.doingSomething();
		impl.doingSomethingagain();
		impl.doingSomethingOneLastTime();
		
	}

}
