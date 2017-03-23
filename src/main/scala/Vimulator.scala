class Vimulator {

  def textOf(command: String) = {
    command.drop(1).dropRight(1)
  }

  def apply(command: String) = {
    command.head match {
      case 'i' =>
        buffer = buffer + textOf(command)

    }
  }

  var buffer = ""
}
