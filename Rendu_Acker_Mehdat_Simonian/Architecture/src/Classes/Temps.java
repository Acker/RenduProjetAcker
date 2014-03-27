package Classes;

import java.util.Calendar;
import java.util.Date;

//Cette classe est responsable du temps elle va nous permettre de tester notre projet par rapport aux dates limites(alertes + fin annonce)

public class Temps {
	private Calendar temps;

	public Temps () {
		temps.getTime();
	}

	public Calendar getTemps() {
		return temps;
	}

	public void setTemps(Calendar temps) {
		this.temps = temps;
	}
	
	

}
