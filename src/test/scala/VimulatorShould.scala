import org.scalatest.{FreeSpec, Matchers, OneInstancePerTest}

class VimulatorShould extends FreeSpec with Matchers with OneInstancePerTest {
  val vimulator = new Vimulator()

  "start with an empty buffer" in {
    vimulator.buffer should equal ("")
  }


  "insert text in the buffer" in {
    vimulator.apply("itext^")

    vimulator.buffer should equal ("text")
  }

  "undo the insertion of text" in {
    vimulator.apply("itext^")

    vimulator.apply("u")

    vimulator.buffer should equal ("")
  }
}
