import java.net.URL
import de.htwg.scalala.midi.{ MidiPlayer }
import javax.sound.midi.{ MidiSystem, Receiver }
import javax.sound.sampled.{ AudioInputStream, LineEvent, LineListener, AudioSystem }
import java.io.File
import de.htwg.scalala.music.Context

import de.htwg.scalala.midi._

object MidiWorksheet {

  val midiPlayer = Context.midiPlayer             //> midiPlayer  : de.htwg.scalala.midi.MidiPlayer = MidiPlayer()/

  midiPlayer.play(key=68)
  midiPlayer.play(key=70)
  midiPlayer.play(key=90)
  midiPlayer.changeToInstrument(12)
  midiPlayer.play(key=50)
}