package utilities;

import java.io.File;
import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;

import javafx.scene.media.Media;

public class MidiLoader {
	
	public static Sequence getSequence(File file){
		Sequence sequence = null;
		
		try {
			sequence = MidiSystem.getSequence(file);
		} catch (InvalidMidiDataException e) {
			System.out.println("Invalid Midi Data");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Invalid Input File");
		}
		
		return sequence;
	}
	
	public static Media getMedia(File file){
		Media track = new Media(file.toString());
		
		return track;
	}
}
