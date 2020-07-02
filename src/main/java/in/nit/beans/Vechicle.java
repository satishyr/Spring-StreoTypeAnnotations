package in.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("vehicle")
@Component
@PropertySources(value= {@PropertySource(value = "in/nit/commons/info.properties"),
		                                       @PropertySource(value = "in/nit/commons/info1.properties")
                                            }
                              ) 

//from spring 4
/*@PropertySource(value = "com/nt/commons/info.properties")
@PropertySource(value = "com/nt/commons/info1.properties")*/
//@PropertySource(value = {"in/nit/commons/info1.properties","in/nit/commons/info.properties"})
@Scope("singleton")
public class Vechicle {

	@Value("${vehicle.type}")
	private String type;

	@Autowired
	private Engine engg;

	public void jounery(String startPlace, String endPlace) {

		System.out.println("Vechicle.jounery() ::: journey started from " + startPlace);
		engg.start();

		System.out.println("Vechicle:: Journey going on....... in vechile of type::" + type);

		System.out.println("Vechicle.jounery() ::: journey ended at " + endPlace);
		engg.stop();
	}
}
