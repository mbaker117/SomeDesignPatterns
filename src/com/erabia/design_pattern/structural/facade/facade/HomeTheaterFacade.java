package com.erabia.design_pattern.structural.facade.facade;

import com.erabia.design_pattern.structural.facade.bean.Amplifier;
import com.erabia.design_pattern.structural.facade.bean.CdPlayer;
import com.erabia.design_pattern.structural.facade.bean.DvdPlayer;
import com.erabia.design_pattern.structural.facade.bean.PopcornPopper;
import com.erabia.design_pattern.structural.facade.bean.Projector;
import com.erabia.design_pattern.structural.facade.bean.Screen;
import com.erabia.design_pattern.structural.facade.bean.TheaterLights;
import com.erabia.design_pattern.structural.facade.bean.Tuner;

public class HomeTheaterFacade {
	Amplifier amp;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;

	public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector, Screen screen,
			TheaterLights lights, PopcornPopper popper) {

		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.screen = screen;
		this.lights = lights;
		this.popper = popper;
	}

	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");

		popper.on();
		popper.pop();

		lights.dim(10);
		screen.down();

		projector.on();
		projector.wideScreenMode();

		amp.on();
		amp.setDvd(dvd);
		amp.setSurroundSound();
		amp.setVolume(5);

		dvd.on();
		dvd.play(movie);
	}

	public void endMovie() {
		System.out.println("Shutting movie theater down...");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
}
