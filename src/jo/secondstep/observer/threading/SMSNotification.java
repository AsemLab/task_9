package jo.secondstep.observer.threading;

public class SMSNotification implements FireSensorObserver {

	@Override
	public void fireDetected(FireSensor fireSensor) {

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					try {
						if (i % 5 == 0)
							Thread.sleep(50);
					} catch (InterruptedException e) {

						System.out.println("Exception in SMSNotification");
					}
					System.out.println("Send SMS to 07806512516");
				}
			}
		});

		t.setName(SMSNotification.class.getSimpleName() + "thread");
		t.start();

	}

}
