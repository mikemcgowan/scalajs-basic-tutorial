package tutorial.webapp

import org.querki.jquery._

object TutorialApp {
  val messages: List[String] = (1 to 10).foldRight(Nil: List[String])((n, acc) =>
    ("<p>Message %d</p>" format n) :: acc
  )

  def main(args: Array[String]): Unit = {
    messages foreach println
    $(() => setupUI())
  }

  def setupUI(): Unit = {
    messages foreach ($("body") append _)

    $("""<button type="button">Click me!</button>""")
      .click(() => addClickedMessage())
      .appendTo($("body"))
  }

  def addClickedMessage(): Unit = {
    $("body") append "<p>You clicked the button!</p>"
  }
}
