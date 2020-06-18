package com.erabia.design_pattern.structural.facade.test;

import com.erabia.design_pattern.structural.facade.bean.Amplifier;
import com.erabia.design_pattern.structural.facade.bean.CdPlayer;
import com.erabia.design_pattern.structural.facade.bean.DvdPlayer;
import com.erabia.design_pattern.structural.facade.bean.PopcornPopper;
import com.erabia.design_pattern.structural.facade.bean.Projector;
import com.erabia.design_pattern.structural.facade.bean.Screen;
import com.erabia.design_pattern.structural.facade.bean.TheaterLights;
import com.erabia.design_pattern.structural.facade.bean.Tuner;
import com.erabia.design_pattern.structural.facade.facade.HomeTheaterFacade;

public class Client {
	public static void main(String[] args) {
		Amplifier amp = new Amplifier("Amplifier");
		Tuner tuner = new Tuner("Tuner", amp);
		DvdPlayer dvd = new DvdPlayer("DVD Player", amp);
		CdPlayer cd = new CdPlayer("CD Player", amp);
		Projector projector = new Projector("Projector", dvd);
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");

		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);
		homeTheater.watchMovie("John Wick");
		homeTheater.endMovie();
	}
}
