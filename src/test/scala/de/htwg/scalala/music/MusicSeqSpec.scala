package de.htwg.scalala.music

import org.junit.runner.RunWith
import org.scalatest.{Matchers, WordSpec}
import org.scalatest.junit.JUnitRunner

import scala.language.postfixOps

@RunWith(classOf[JUnitRunner])
class MusicSeqSpec extends WordSpec with Matchers {

  "MusicSeq is used for nesting and" should {
    var tune = Tune()
    var line = Line()
    var track = Track()
    "nest Keys in Tunes" in {
      tune = Tune(c16, g16, e16, g16)
      tune.play()
      play(tune)
    }
    "nest Tunes in Lines" in {
      line = Line(c16-,tune, tune)
      line.play()
      play(line)
    }
    "nest Lines in Tracks" in {
      track = Track(c16--,line, line)
      track.play()
      play(track)
    }
    "and nest in any other combination, but the above is the intention" in {
      val mix = Track( c16, g16, e16, g16, tune, line, track) 
      mix.play()
      play( mix)
    }

  }

}