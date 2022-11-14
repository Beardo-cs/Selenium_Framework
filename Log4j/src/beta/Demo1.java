package beta;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.Logger;

public class Demo1 {

		private static Logger log = LogManager.getLogger(Demo1.class.getName());

		public static void main(String[] args) {
			log.debug("I have clicked on the button");
			if(5>4) { 
			log.debug("Button is displayed");
			log.info("Button is  displayed");
			log.error("Object is not displayeds");
			log.fatal("buton is missing");

		}
		}

	}


