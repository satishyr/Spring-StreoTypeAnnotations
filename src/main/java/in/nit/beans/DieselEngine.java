package in.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dEngine")
@Primary
public class DieselEngine implements Engine {

	@Value("${engine.diesel.id}")
	private long engineId;

	@Override
	public void start() {

		System.out.println("DieselEngine.start()::: Diesel Engine Started with Id::"+engineId);

	}

	@Override
	public void stop() {

		System.out.println("DieselEngine.stop()::: Diesel Engine Stopped");

	}

}
