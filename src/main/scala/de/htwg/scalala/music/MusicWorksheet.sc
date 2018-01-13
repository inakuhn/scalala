package de.htwg.scalala.music

object MusicWorksheet {
  import akka.actor._
  import de.htwg.scalala.players._

  import scala.language.postfixOps

 
  Conductor ! Add(PianoPlayer)
  Conductor ! Add(DrumPlayer)
  Conductor ! Add(ViolinPlayer)
  Conductor ! Start
    PianoPlayer.play(Tune(c16.mol*Pattern(1,0,1,0,1,1,0,0,1,1,1,1,1,0,0,1) ))
                                                  //> Conductor Started/
                                                
    
     DrumPlayer.play(Tune(c16, c16, c8, c4,c2 )*4)
   
     ViolinPlayer.play(Tune(p4, f, e, p4)*4)
      
   
}